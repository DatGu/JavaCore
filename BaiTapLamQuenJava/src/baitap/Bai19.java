package baitap;

import java.util.Scanner;

public class Bai19 {
	
	  public static void main(String[] args) {
	 System.out.println("Nhập tổng các chữ số trong số nguyên tố cần tìm ");
	 int ss=new Scanner(System.in).nextInt();
	 System.out.println("Số bạn cần tìm là ");
	 for (int i = 10000; i < 99999; i++) {
		 	int sum=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) sum=sum+j;
			}
			if(sum!=i+1) continue;
			int n=i;
			int summ=0;
			for(;n>0;)
			{
				int du=n%10;
				n=n/10;
				summ=summ+du;
			}
			if(summ==ss) System.out.println(i);
			
			
	 }
	 }
	 
}
