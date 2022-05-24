package project.model;

public class Address {
	public String streetAddress;
	public String city;
	public String state;
	public int zipCode;
	
	
	
	public Address() {
		super();
	}



	public Address(String streetAddress, String city, String state, int zipCode) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}



	@Override
	public String toString() {
		return this.streetAddress+" "+this.city+" "+this.state+" "+this.zipCode;
	}
}
