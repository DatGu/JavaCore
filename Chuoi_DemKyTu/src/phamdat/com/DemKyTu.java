package phamdat.com;

public class DemKyTu {

	public static void main(String[] args) {  
		String s="a  bc123xy**zeUoiHg  sfsjkgig+-jkbjigu8*guiwBjg  uitujkbI  tg9Jnsiv79g9";
		//Chuyển chuỗi thành mảng ký tự
		char []ch =s.toCharArray();
		
		//Đếm chữ in hoa
		int demhoa=0;
		for(int i=0; i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i])) demhoa++;			
		}
		System.out.println("Có "+demhoa+" chữ cái in Hoa"); 
		
		//Đếm chữ thường
		int demthuong=0;
		for(int i=0; i<ch.length;i++)
		{
			if(Character.isLowerCase(ch[i])) demthuong++;			
		}
		System.out.println("Có "+demthuong+" chữ cái in thường");
		
		
		//Đếm số
		int demso=0;
		for(int i=0; i<ch.length;i++)
		{
			if(Character.isDigit(ch[i])) demso++;			
		}
		System.out.println("Có "+demso+" chữ số");
		
		//Đếm kí tự đặc biệt 
		int demdb=0;
		for(int i=0; i<ch.length;i++)
		{
			if(Character.isLetter(ch[i])==false && Character.isDigit(ch[i])==false && Character.isWhitespace(ch[i])==false) demdb++;			
		}
		System.out.println("Có "+demdb+" Ký tự đặc biệt");
		
		//Đếm khoảng trắng 
		int demkt=0;
		for(int i=0; i<ch.length;i++)
		{
			if(Character.isWhitespace(ch[i])) demkt++;			
		}
		System.out.println("Có "+demkt+" khoảng trắng");
		
		
		//Đếm nguyên âm
		int demna=0;
		char []na= {'a','e','o','u','i'};
		for(int i=0; i<ch.length;i++)
		{
		for(int j=0;j<na.length;j++) 
	
	     	if(Character.toString(ch[i]).equalsIgnoreCase(Character.toString(na[j]))) demna++;
		}
		System.out.println("Có "+demna+" nguyên âm");
		
		//Đếm phụ âm
		int phuam=s.length()-demso-demdb-demna-demkt;
		System.out.println("Có "+phuam+" phụ âm");

	}

}
