/**
 * 
 */

/**
 * POJO class for Customer
 * @author Pello Altadill
 *
 */
public class Customer {
	private int id;
	private String name;
	private String address;	
	
	/**
	 * @param id
	 * @param name
	 * @param address
	 */
	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}
	
	
	/********** Getters/Setters ********************/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
