package project.model;

public abstract class StaffMemeber {
	protected String name;
	protected String address;
	protected String phone;
	public StaffMemeber(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public StaffMemeber() {
		super();
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String toString() {
		return "Họ Tên: "+this.name+"\n Địa Chỉ: "+this.address+"\n Phone: "+this.phone;
	}
	
	public abstract double pay();
}
