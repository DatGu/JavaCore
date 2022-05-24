package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai21 {
	
	public static int tongCacSo(int n)
	{
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			n/=10;
			sum+=a;			
		}
		return sum;
	}
	
	public static void phanTichThuaSoNguyenTo(int n)
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
		Scanner sc =new Scanner(System.in);
		System.out.println("Mời bạn nhập n=");
		int n=sc.nextInt();
		System.out.println("Tổng các chữ số là "+tongCacSo(n));
		phanTichThuaSoNguyenTo(n);
	}

}
