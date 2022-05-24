package project.model;

public class Student {
	private String name;
	private Address homeAddress=new Address();
	private Address schoolAddress=new Address();
	
	public Student() {
		super();
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getHomeAddress() {
		return homeAddress;
	}


	public Address getSchoolAddress() {
		return schoolAddress;
	}


	public void setHomeAddress(String streetAddress,String city,String state,int zipCode) {
		this.homeAddress.streetAddress=streetAddress;
		this.homeAddress.city=city;
		this.homeAddress.state=state;
		this.homeAddress.zipCode=zipCode;
	}



	public void setSchoolAddress(String streetAddress,String city,String state,int zipCode) {
		this.schoolAddress.streetAddress=streetAddress;
		this.schoolAddress.city=city;
		this.schoolAddress.state=state;
		this.schoolAddress.zipCode=zipCode;
	}



	public String toString() {
		return this.name+"\n Home Address: "+this.homeAddress+"\n School Address: "+this.schoolAddress;
	}
}
