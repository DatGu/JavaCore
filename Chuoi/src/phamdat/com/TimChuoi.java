package phamdat.com;

import java.util.StringTokenizer;

public class TimChuoi {

	public static void main(String[] args) {
		String s="Phạm anh Tiến anh Đạt anh";
		
		// Trả về vị trí đầu tiên tìm thấy trong chuỗi. Nếu không thấy trả về -1
		int vtr1= s.indexOf("ạ");
		int vtr2= s.indexOf("Tiến");
		System.out.println("Tìm thấy ạ đầu tiên ở vị trí "+ vtr1);
		System.out.println("Tìm thấy Tiến đầu tiên ở vị trí "+ vtr2);
		
		//Trả về vị trí cuối tìm thấy trong chuỗi. Nếu không thấy trả về -1
		int vtr3= s.lastIndexOf("ạ");
		System.out.println("Tìm thấy ạ cuối cùng ở vị trí "+vtr3);
		
		//Trả về xem chuỗi có chứa phần tử càn tìm không. Trả về True False
		if (s.contains("Đạt")==true)
			System.out.println("Tìm thấy Đạt trong chuỗi");
		else 
			System.out.println("Không tìm thấy Đạt trong chuỗi ");
		
		//Tìm xem phần tử cần tìm xuất hiện bao nhiêu lần trong chuỗi
		StringTokenizer token= new StringTokenizer(s);
		int dem=0;
		while(token.hasMoreTokens())
		{
			String value= token.nextToken();
			if(value.equals("anh")) dem++;
		}
		
		System.out.println("Từ anh được xuất hiện "+dem +" lần");

	}

}
