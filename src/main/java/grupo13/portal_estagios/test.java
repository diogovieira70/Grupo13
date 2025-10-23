package grupo13.portal_estagios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration; 

public class test {
	public static void main(String[] args) {
		SessionFactory factory = new
				Configuration().configure().buildSessionFactory(); 
		try (Session session = factory.openSession()) {
			session.beginTransaction();
			
			Aluno a1=new Aluno(1, "diogo", "1234", "Estudante", 1, "Diogo", "2004", "Engenharia");
		}

	}
}
