package project.model;

public class Circle extends Point {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y,double radius) {
		super(x, y);
		this.radius=radius;
	}
	
	public double diameter()
	{
		return this.radius*2;
	}
	
	public double circumference()
	{
		return Math.PI*radius;
	}
	public double area()
	{
		return Math.PI*Math.pow(radius, 2);
	}
}














