package phamdat.com;

import java.util.Scanner;

public class VeTamGiacVuongCan {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập chiều dài tam giác ");
		n= sc.nextInt();
		for(int i=1;i<=n; i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n || j==1 || i==j)	System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
