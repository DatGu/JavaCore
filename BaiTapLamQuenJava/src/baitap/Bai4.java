package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {
	public static void phanTich(int n)
	{
		int ndau=n;
		StringBuilder str=new StringBuilder();
		ArrayList<Integer> thuaso=new ArrayList<Integer>();
		while(n>=2) {
		for(int i=2;i<=n;i++)
		{
			int du=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)du+=j;
			}
			if(du==1)
			{
				if(n%i==0)
				{
					thuaso.add(i);
					n=n/i;
					break;
				}			
			}			
		}	
		}
			for(int i:thuaso) str.append(i+"x");
			str.deleteCharAt(str.length()-1);
			String dayphantich=str.toString();
			System.out.println(dayphantich);
	}
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số cần phân tích");
		int n=new Scanner(System.in).nextInt();
		phanTich(n);
	}

}
