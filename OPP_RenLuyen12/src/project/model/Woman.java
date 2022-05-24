package project.model;

public class Woman extends Person{
	private boolean wearingMakeup ;

	public boolean isWearingMakeup() {
		return wearingMakeup;
	}

	public void setWearingMakeup(boolean wearingMakeup) {
		this.wearingMakeup = wearingMakeup;
	}
	
	public void putMakeupOn()
	{
		
	}
	public boolean isWearingMakeupOn()
	{
		return true;
	}
}
