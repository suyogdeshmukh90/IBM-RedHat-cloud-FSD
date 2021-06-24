package model3;

public class Customer {
	private int id;
	private String name;
	private Address address;
	private Branch branch;
	public Customer() {
		super();
	}
	public Customer(int id, String name, Address address, Branch branch) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.branch = branch;
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address
				+ ", branch=" + branch + "]";
	}
	

}
