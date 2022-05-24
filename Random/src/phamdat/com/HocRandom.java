package phamdat.com;

import java.util.Random;

public class HocRandom {

	public static void main(String[] args) {
		Random rd= new Random();
		int x1= rd.nextInt(101); //Lấy ngẫu nhiên 1 số [0...100] hay [0...101)
		int x2= rd.nextInt(201) -100 ; //Lấy ngẫu nhiên 1 số [-100...100]
		System.out.println(x1 +" "+x2);
		
		
		double x3= rd.nextDouble(); //Lấy số thực ngẫu nhiên [0...1)
		double x4= rd.nextDouble()*10; //Lấy số thực ngẫu nhiên [0...10)
		System.out.println(x3 +" "+x4 );
	

	}

}
