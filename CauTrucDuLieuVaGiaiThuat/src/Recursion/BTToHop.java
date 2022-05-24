package Recursion;

import java.util.Scanner;

public class BTToHop {
	public static int toHop(int k, int n)
	{
		if(k==0||n==k) return 1;
		return toHop(k,n-1)+toHop(k-1, n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Mời bạn nhập k=");
		int k=sc.nextInt();
		System.out.print("Mời bạn nhập n=");
		int n=sc.nextInt();
		System.out.println("Tổ hợp cần tính là ="+toHop(k, n));
	}

}
