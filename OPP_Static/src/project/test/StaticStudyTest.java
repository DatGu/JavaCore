package project.test;

import project.model.StaticStudy;

public class StaticStudyTest {

	public static void main(String[] args) {
		StaticStudy a1=new StaticStudy();
		StaticStudy a2=new StaticStudy();
		a1.setA(12);
		//do dùng chung biến static nên 2 biến đang trỏ cùng một ô nhớ 
		System.out.println(a1.getA());
		System.out.println(a2.getA());
		a2.setA(28);
		System.out.println(a1.getA());
		System.out.println(a2.getA());
		
		//Gọi Method có static
		//Không cần thông qua đối tượng
		StaticStudy.fn1();
		
		//Gọi Method thường
		//Thông qua đối tượng
		a1.fn2();
	}
	
	

}
