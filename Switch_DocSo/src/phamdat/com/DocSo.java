package phamdat.com;

import java.util.Scanner;

public class DocSo {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số cần đọc ");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
		int hangchuc=n/10;
		int hangdonvi= n-(hangchuc*10);
		if(n>=100) System.out.println("Tôi Không Biết");
		else if (n==5) System.out.println("Năm");
		else if (n==0) System.out.println("Không");
		else {
		
		switch(hangchuc)
		      { 
			  case 0: System.out.print("Mươi "); break;
		      case 1: System.out.print("Mười "); break;
		      case 2: System.out.print("Hai Mươi "); break;
		      case 3: System.out.print("Ba Mươi "); break;
		      case 4: System.out.print("Bốn Mươi "); break;
		      case 5: System.out.print("Năm Mươi "); break;
		      case 6: System.out.print("Sáu Mươi "); break;
		      case 7: System.out.print("Bảy Mươi "); break;
		      case 8: System.out.print("Tám Mươi "); break;
		      case 9: System.out.print("Chín Mươi "); break;
		}
		switch(hangdonvi)
		{
		      case 0: System.out.print(" "); break;
		      case 1: System.out.print("Một "); break;
		      case 2: System.out.print("Hai "); break;
		      case 3: System.out.print("Ba "); break;
		      case 4: System.out.print("Bốn "); break;
		      case 5: System.out.print("Năm "); break;
		      case 6: System.out.print("Sáu "); break;
		      case 7: System.out.print("Bảy "); break;
		      case 8: System.out.print("Tám"); break;
		      case 9: System.out.print("Chín"); break;
	}
	}
		

	}

}
