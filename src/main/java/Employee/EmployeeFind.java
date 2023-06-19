package Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeFind {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("m1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee e = entityManager.find(Employee.class, 1);

		if (e != null) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getJob());
			System.out.println(e.getSal());

		}
		else {
			System.out.println("No Employee found");
		}
		
		
		entityTransaction.begin();
		
		entityTransaction.commit();


	}

}
