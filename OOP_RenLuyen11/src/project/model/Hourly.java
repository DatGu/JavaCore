package project.model;

public class Hourly extends Employee {
	private int hoursWorked;
	 
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public Hourly() {
		// TODO Auto-generated constructor stub
	}

	public Hourly(String name, String address, String phone) {
		super(name, address, phone);
		// TODO Auto-generated constructor stub
	}
	
	public void addHour(int hour)
	{
		this.hoursWorked=hour;
	}

	public double pay()
	{
		return this.hoursWorked*50;
	}
		
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n Giờ làm: "+this.hoursWorked;
	}
}
