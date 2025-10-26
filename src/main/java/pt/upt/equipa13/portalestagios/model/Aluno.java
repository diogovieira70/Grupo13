package pt.upt.equipa13.portalestagios.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/** Entidade Aluno: candidato aos estágios. */
@Entity
@Table(name = "alunos", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)               private String  nome;
    @Column(nullable=false, unique=true)  private String  email;
    @Column(nullable=false)               private Integer numero;
                                          private String  curso;

    /** Um Aluno pode ter várias Candidaturas. */
    @OneToMany(mappedBy = "aluno",
               cascade = CascadeType.ALL,
               orphanRemoval = true,
               fetch = FetchType.LAZY)
    private List<Candidatura> candidaturas = new ArrayList<>();

    public Aluno() {}

    // Helpers de associação
    public void addCandidatura(Candidatura c) {
        candidaturas.add(c);
        c.setAluno(this);
    }
    public void removeCandidatura(Candidatura c) {
        candidaturas.remove(c);
        c.setAluno(null);
    }

    // Getters/Setters
    public Long getId() { return id; }
    public String getNome() { return nome; }            public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }          public void setEmail(String email) { this.email = email; }
    public Integer getNumero() { return numero; }       public void setNumero(Integer numero) { this.numero = numero; }
    public String getCurso() { return curso; }          public void setCurso(String curso) { this.curso = curso; }
    public List<Candidatura> getCandidaturas() { return candidaturas; }

    @Override public String toString() {
        return "Aluno#" + id + " " + nome + " (" + numero + ")";
    }
}
