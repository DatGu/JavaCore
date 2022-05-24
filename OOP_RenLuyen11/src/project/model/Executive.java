package project.model;

public class Executive extends Employee {
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Executive() {
		// TODO Auto-generated constructor stub
	}

	public Executive(String name, String address, String phone) {
		super(name, address, phone);
		// TODO Auto-generated constructor stub
	}
	
	public void awardBunus(double bonus)
	{
		this.bonus=bonus;
		System.out.println("Nhận lương Bonus "+ this.bonus);
	}
	
	public double pay()
	{
		return super.pay()+ this.bonus;
		
	}

}
