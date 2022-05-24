package baitap;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập một số các số nguyên tố đầu tiên ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dem=0;
		System.out.println(n+" Số nguyên tố đầu tiên là");
		for(int i=1;dem<n;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) sum=sum+j;
			}
			if(i==1) 
				{
				System.out.print("1"+"\t");
				dem++;
				}
			if(sum==i+1) 
				{
				System.out.print(i+"\t");
				dem++;
				}
			
		}

}
}
