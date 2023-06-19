package Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsert {

	public static void main(String[] args) {

		EntityManagerFactory enityEntityManagerFactory = Persistence.createEntityManagerFactory("m1");
		EntityManager entityManager = enityEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("mayur");
		employee1.setJob("developer");
		employee1.setSal(70000);

		entityTransaction.begin();
		entityManager.persist(employee1);
		entityTransaction.commit();

		System.out.println("insert Successfull");

	}
}
