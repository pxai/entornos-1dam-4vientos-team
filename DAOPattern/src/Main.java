import java.util.Scanner;

/**
 * 
 */

/**
 * @author luser
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CustomerDAO customerDAO = new CustomerDAO();
		
		// TODO Auto-generated method stub
		int id = 0;
		String name = "";
		String address = "";
		
		// CREATE
		System.out.println("Insert new Name");
		name = scanner.nextLine();
		System.out.println("Insert new Adress");
		address = scanner.nextLine();
		
		Customer customer = new Customer(0, name, address);
		int newId = customerDAO.create(customer);
		
		customer.setId(newId);
		
		System.out.println("Customer data: " + customer.toString());
		
		// UPDATE DATA
		System.out.println("Insert new Name");
		name = scanner.nextLine();
		System.out.println("Insert new Adress");
		address = scanner.nextLine();

		customer.setName(name);
		customer.setAddress(address);
		customerDAO.update(customer);
		
		// REMOVE
		customerDAO.delete(customer.getId());
		
	}

}
