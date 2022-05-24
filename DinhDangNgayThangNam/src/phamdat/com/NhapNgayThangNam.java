package phamdat.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NhapNgayThangNam {

	public static void main(String[] args) {
		//Lấy time hiện tại
		Calendar cal= Calendar.getInstance();
		int yearNow= cal.get(Calendar.YEAR); // Lấy năm hiện tại
		
		System.out.println("Mời bạn nhập vào ngày tháng năm sinh theo định dạng dd/mm/yyyy");
		String ns= new Scanner(System.in).nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date birthday;
		try {
			
			// Chuyển kiểu String của ns sang kiểu ngày tháng năm
			birthday = sdf.parse(ns);
			
			// đặt time cal lấy là time của birthday
		    cal.setTime(birthday);
		    int yearBirthday= cal.get(Calendar.YEAR);
		    
		    int tuoi= yearNow - yearBirthday;
		    System.out.println("Tuổi của bạn là "+tuoi);
		} catch (ParseException e) {
			System.out.println("Bạn Nhập sai định dạng rồi ạ 1");
			e.printStackTrace();
		}
		
	    
	    
	}

}
