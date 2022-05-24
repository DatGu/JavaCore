package phamdat.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NgayThangNamHeThong {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year= cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH);
		int day= cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(day);
		
		Date t= cal.getTime();// Lấy time hiện tại gán cho biến t vs dạng date
		// Tạo sdf dùng để chuyển biến về định dạng 
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(t));
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		System.out.println(sdf2.format(t));
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss");
		System.out.println(sdf3.format(t));
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss  aaa");
		System.out.println(sdf4.format(t));
		

	}

}
