package phamdat.com;

import java.text.DecimalFormat;

public class DinhDangSo {

	public static void main(String[] args) {
		double x= 5.6666666666667;
		
		//Tạo ra đối tượng dcf để xử lí biến về định dạng
		DecimalFormat dcf= new DecimalFormat("#.##");
		System.out.println(dcf.format(x));
		

	}

}
