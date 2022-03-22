import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        Client client = new Client();
        client.setId(1);
        client.setName("David");

        Bank bank = new Bank();
        bank.setName("Chase");

        EntityManager entityManager= entityManagerFactory.createEntityManager();

        entityManager.persist(client);
        entityManager.persist(bank);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }
}
