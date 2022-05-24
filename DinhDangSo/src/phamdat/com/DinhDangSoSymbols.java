package phamdat.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DinhDangSoSymbols {

	public static void main(String[] args) {
		int x=1000000000;
		//Tạo đối tượng để xử lí biến về định dạng
		DecimalFormat dcf=new DecimalFormat("#,###");
		
		//tạo đối tượng xử lí
		DecimalFormatSymbols dcfs= new DecimalFormatSymbols(Locale.getDefault());
		
		//Đặt lại ký tự phân cách 
		dcfs.setGroupingSeparator('.');
		
		// Dặt đối tượng dcf xử lí theo đối tượng dcfs
		dcf.setDecimalFormatSymbols(dcfs);
		
		System.out.println(dcf.format(x));
	}

}
