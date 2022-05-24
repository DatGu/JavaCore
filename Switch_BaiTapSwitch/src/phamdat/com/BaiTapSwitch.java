package phamdat.com;

import java.util.Scanner;

public class BaiTapSwitch {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập giá trị a và b");
		double a,b;
		char ch;
		Scanner sc=new Scanner(System.in);
		a= sc.nextDouble();
		b= sc.nextDouble();
		System.out.println("Mời bạn nhập phép tính ");
		ch= new Scanner(System.in).nextLine().charAt(0);
		switch(ch)
		{
		
		case '+' : System.out.println("Giá trị phép tính là "+ (a+b)); break;
		case '-' : System.out.println("Giá trị phép tính là "+ (a-b)); break;
		case '*' : System.out.println("Giá trị phép tính là "+ (a*b)); break;
		case '/' : System.out.println("Giá trị phép tính là "+ (a/b)); break;
		
		}
		

				
	}

}
