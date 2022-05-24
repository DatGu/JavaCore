package baitap;

import java.util.Scanner;

public class bai23 {
	public static int fib(int n)
	{
		if(n==1||n==2) return 1;
		return fib(n-2)+fib(n-1);
	}
	public static void nFib(int n)
	{
		System.out.println(n+ " Số Fibonaci đầu tiên là");
		for(int i=1;i<=n;i++)
		{
			System.out.print(fib(i)+"\t");
		}
	}
	
	public static void nSnt(int n)
	{
		System.out.println(n+ " Số nguyên tố đầu tiên là ");
		int dem=0;
		for(int i=1;dem<n;i++)
		{
			int du=0;
			for(int j=1;j<n;j++)
			{
				if(i%j==0) du+=j;
			}
			if(du==1||i==1) 
				{
				System.out.print(i+"\t");
				dem++;
				}
		}
	}
	public static void main(String[] args) {
		Scanner scv=new Scanner(System.in);
		System.out.println("Mời bạn nhập các số đầu tiên " );
		int n=scv.nextInt();
		nSnt(n);
		System.out.println();
		nFib(n);
		
	}

}
