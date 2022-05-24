package phamdat.com;

import java.util.Scanner;
import java.lang.Math;

public class PtrBac2 {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập theo thứ tự a b c  ");
		int a,b,c,denta;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		denta= b*b-4*a*c;
		double no1,no2;
		if(a==0)
		{
			no1=(double)-c/b;
			System.out.println("Phương trình có một ngiệm là " + no1);
		}
		
		if(a!=0)
		{
			if(denta==0)
			{
				no1=(double) -b/(2*a);
				System.out.println("Phương trình có ngiệm kép là " + no1);
			}
			else if(denta>0)
			{
				no1=(double) (-b+ Math.sqrt(denta))/(2*a);
				no2=(double) (-b- Math.sqrt(denta))/(2*a);
				System.out.println("Phương trình có 2 ngiệm là " + no1 +" và "+ no2);
			}
			else System.out.println("Phương trình bạn nhập vô nghiệm");
		}

	}

}
