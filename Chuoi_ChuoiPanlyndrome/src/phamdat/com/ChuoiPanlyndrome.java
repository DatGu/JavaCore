package phamdat.com;

import java.util.Scanner;

public class ChuoiPanlyndrome {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập chuỗi cần kiểm tra ");
		String s=new Scanner(System.in).nextLine();
		StringBuilder sb= new StringBuilder();
		for(int i=s.length()-1; i>=0;i--)
		{		
			sb.append(s.charAt(i));
		}
		String s1= sb.toString();
		
		if(s.equalsIgnoreCase(s1)) System.out.println("Chuỗi đó là Panlyndrome");
		else System.out.println("Chuỗi đó không là Panlyndrome");
		
		  
	}

}
