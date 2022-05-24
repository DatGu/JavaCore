package baitap;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mời bạn nhập số ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int chusocuoi=n%10;
			n=n/10;
			sum=sum+chusocuoi;
		}
		System.out.println("Tổng các chữ số là "+sum);

	}

}
