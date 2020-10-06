import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SuppressWarnings("unused")
public class ClinicDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("AndrewsPU");

	public ClinicDAO() {

	}

	public void persistObject(Object obj) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
		em.close();

	}
}
