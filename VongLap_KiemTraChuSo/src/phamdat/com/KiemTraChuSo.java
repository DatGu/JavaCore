package phamdat.com;

import java.util.Scanner;

public class KiemTraChuSo {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số cần kiểm tra");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
	    boolean check=true;
		while(n>0)
		{
			int a=n%10;
			int du=a%2;
			n=n/10;
			if(du!=0) 
			{ 
				check=false;
				break;		
			}
	    }
		if(check==true) System.out.println("Các chữ số chẵn hết");
		else System.out.println("Các chữ số không chẵn hết");

	}

}
