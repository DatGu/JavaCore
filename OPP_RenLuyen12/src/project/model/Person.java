package project.model;

import java.util.Date;

public abstract class Person implements Mammal{
	protected String firstname;
	protected BloodGroup bloodName;
	protected Address homeAdd;
	protected Address schoolAdd;
	
	
	public Person() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setDateOfBirth(Date dob)
	{
		
	}
	
	public void getAgeAsDays()
	{
		
	}
	
	
}


















