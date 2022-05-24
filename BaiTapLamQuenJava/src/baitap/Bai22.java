package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai22 {
	public static void lietKeUoc(int n)
	{
		ArrayList<Integer> uoc=new ArrayList<Integer>();
		ArrayList<Integer> uocnt=new ArrayList<Integer>();
		int dem=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) 
				{
				uoc.add(i);
				dem++;
				int du=0;
				for(int j=1;j<i;j++)
					{
					if(i%j==0) du+=j;
					}
				if(du==1||i==1) uocnt.add(i); 
				}	
		}
		System.out.println(dem+" Ước của "+n+ " là: ");
		for(int i:uoc)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("Các ước là số nguyên tố là ");
		for(int i:uocnt)
		{
			System.out.print(i+"\t");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("mời bạn nhập n=");
		int n=sc.nextInt();
		lietKeUoc(n);
	}

}
