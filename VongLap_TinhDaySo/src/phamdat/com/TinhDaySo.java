package phamdat.com;

import java.util.Scanner;

public class TinhDaySo {

	public static void main(String[] args) {
		double x,n,tu,mau,sum=0;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Mời bạn nhập giá trị của x ");
		x= sc.nextDouble();
		System.out.println("Mời bạn nhập giá trj của n");
		n= sc.nextDouble();
		
		for(int i=1; i<=n;i++)
		{
			tu= Math.pow(x,i);
			mau=0;
			for(int j=1;j<=i;j++)
			{
				mau=mau+j;
			}
			sum=sum+(tu/mau);
		}
		System.out.println("Giá trị dãy số là "+ sum);

	}

}
