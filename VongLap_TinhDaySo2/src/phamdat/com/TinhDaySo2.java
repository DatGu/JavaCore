package phamdat.com;

import java.util.Scanner;

public class TinhDaySo2 {

	public static void main(String[] args) {
		double x,n,tu,mau,sum=0;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Mời bạn nhập giá trị của x ");
		x= sc.nextDouble();
		System.out.println("Mời bạn nhập giá trj của n");
		n= sc.nextDouble();
		
		for(int i=0; i<=n;i++)
		{
		 double mu=2*i+1;
			tu= Math.pow(x,mu);
			mau=1;
			for(int j=1;j<=2*i+1;j++)
			{
				mau=mau*j;
			}
			sum=sum+(tu/mau);
		}
		System.out.println("Giá trị dãy số là "+ sum);


	}

}
