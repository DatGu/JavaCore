package phamdat.com;

import java.util.Scanner;

public class ToiUuChuoi {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập chuỗi ");
		String s=new Scanner(System.in).nextLine();
		
		//Xóa khoảng trắng
		s=s.trim();
		while(s.contains("  "))
		{
		    s=s.replace("  ", " ");
		}
		
		//Tối ưu chữ hoa thường
		String word= new String();
		StringBuilder sb= new StringBuilder();
	    s=s.toLowerCase();
		String []arr= s.split(" ");
		for (int i=0; i<arr.length; i++)
		{
			word=arr[i].replaceFirst((arr[i].charAt(0)+""), (arr[i].charAt(0)+"").toUpperCase()); // +"" để chuyển về chuỗi
			sb.append(word);
			sb.append(" ");
		}
		s=sb.toString();
		s=s.trim();
		System.out.println(s);
				
	

	}

}
