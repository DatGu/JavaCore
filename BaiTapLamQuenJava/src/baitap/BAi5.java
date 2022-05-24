package baitap;

import java.util.Scanner;

public class BAi5 {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập một số ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Các số nguyên tố bé hơn số vừa nhập là");
		for(int i=1;i<n;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) sum=sum+j;
			}
			if(i==1) System.out.print("1"+"\t");
			if(sum==i+1) System.out.print(i+"\t");
		}

	}

}
