package phamdat.com;

import java.util.Scanner;

public class SoHoanThien {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số để kiểm tra");
		Scanner sc= new Scanner(System.in);
		int sum=0,n= sc.nextInt();
		
		for(int i=1; i<n; i++)
		{
			int sodu=n%i;
			if(sodu==0) sum=sum+i;
		}
		if(sum==n) System.out.println("Là số hoàn thiện");
		else System.out.println("Không là số hoàn thiện");

	}

}
