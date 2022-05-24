package project.test;

import java.text.DecimalFormat;

import project.model.Circle;

public class CircleTesst {

	public static void main(String[] args) {
		Circle h1=new Circle(1, 2, 5);
		DecimalFormat df =new DecimalFormat("#.##");
		System.out.println("Đường kính hình tròn là "+df.format(h1.diameter()));
		System.out.println("Chu vi hình tròn là "+df.format(h1.circumference()));
		System.out.println("Diện tích hình tròn là "+df.format(h1.area()));

	}

}
