package project.model;

import java.util.ArrayList;

public class Staff {
	private ArrayList<StaffMemeber> staffList;
	
	public ArrayList<StaffMemeber> getStaffList() {
		return staffList;
	}
	public void setStaffList(ArrayList<StaffMemeber> staffList) {
		this.staffList = staffList;
	}
	public Staff() {
		super();
		staffList=new ArrayList<StaffMemeber>();
	}
	public void addStaffList(StaffMemeber sm)
	{
		staffList.add(sm);
	}
	public void payDay()
	{
		for(StaffMemeber sm:staffList)
		{
			System.out.println(sm);
		}
	}
}
