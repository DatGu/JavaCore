package baitap;

import java.util.Scanner;

public class bai18 {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập chuỗi ");
		String s=new Scanner(System.in).nextLine();
		s=s.trim();
		while(s.contains("  "))
		{
		    s=s.replace("  ", " ");
		}
		String arr[]= s.split(" ");
		System.out.println("Số từ trong chuỗi là "+arr.length);
	}

}
