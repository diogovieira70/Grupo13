package pt.upt.equipa13.portalestagios.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pt.upt.equipa13.portalestagios.model.Aluno;
import pt.upt.equipa13.portalestagios.model.Candidatura;
import pt.upt.equipa13.portalestagios.model.Empresa;
import pt.upt.equipa13.portalestagios.model.OfertaEstagio;

public class Main {
  public static void main(String[] args) {
    // 1) Lê o hibernate.cfg.xml (com as <mapping class="...">) e cria o SessionFactory
    SessionFactory sf = new Configuration()
        .configure("hibernate.cfg.xml")
        .buildSessionFactory();

    // 2) Abre uma Session (contexto de persistência) e inicia transação
    try (Session s = sf.openSession()) {
      s.beginTransaction();

      // 3) SEED — criar dados de exemplo (valores únicos para evitar violar UNIQUE)
      Empresa e = new Empresa();
      e.setNome("Tech4U");
      e.setNif("123456789");                 // UNIQUE
      e.setEmail("hr@tech4u.io");
      e.setWebsite("https://tech4u.io");
      s.persist(e);

      OfertaEstagio o = new OfertaEstagio();
      o.setTitulo("Estágio Java Back-end");
      o.setDescricao("Desenvolvimento com Spring/Hibernate");
      o.setArea("Informática");
      o.setEmpresa(e);                       // FK obrigatória
      s.persist(o);

      Aluno a = new Aluno();
      a.setNome("João Faria");
      a.setEmail("joao" + System.currentTimeMillis() + "@alunos.upt.pt"); // UNIQUE
      a.setNumero(10001);
      a.setCurso("Eng. Informática");
      s.persist(a);

      Candidatura c = new Candidatura();
      c.setAluno(a);                         // FK obrigatória
      c.setOferta(o);                        // FK obrigatória
      s.persist(c);

      // 4) COMMIT — envia os INSERTs reais para o MySQL
      s.getTransaction().commit();

      // 5) LISTAR — HQL (o Hibernate traduz para SQL e materializa objetos)
      System.out.println("\n== Ofertas mais recentes ==");
      s.createQuery("from OfertaEstagio o order by o.createdAt desc", OfertaEstagio.class)
       .list()
       .forEach(of -> System.out.println(of.getId() + " | " + of.getTitulo() + " | " + of.getArea()));
    } finally {
      // 6) Libertar recursos pesados
      sf.close();
    }

    System.out.println("\nLigação MySQL OK ✔ Tabelas criadas e dados inseridos/listados.");
  }
}
