package Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {

	public static void main(String[] args) {
		EntityManagerFactory enityEntityManagerFactory = Persistence.createEntityManagerFactory("m1");
		EntityManager entityManager = enityEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee e = entityManager.find(Employee.class, 1);

		if (e != null) {
			entityTransaction.begin();
			entityManager.remove(e);
			entityTransaction.commit();

		}
		else
		{
			System.out.println("No Data Found");
		}

	}

}
