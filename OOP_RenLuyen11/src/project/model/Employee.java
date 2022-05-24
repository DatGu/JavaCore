package project.model;

public class Employee extends StaffMemeber {

	protected int socialSecurityNumber;
	protected double payRate;
	
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address, String phone) {
		super(name, address, phone);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +"\n Số An sịnh xã hội: "+this.socialSecurityNumber+"\n Lãi Suất: "+this.payRate;
	}

	public double pay() {
		
		return 500;
	}

}
