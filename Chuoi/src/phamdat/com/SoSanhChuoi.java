package phamdat.com;

public class SoSanhChuoi {

	public static void main(String[] args) {
		String s1="Phạm Tiến Đạt";
		String s2="Phạm Huy Hoàng";
		String s3="phạm TIẾN ĐẠt";
		String s4="Phạm Tiến Đạt";
		
		//Hàm compareTo so sánh s1 với s2. kết quả trả về là > ỏ < ỏ = 0;
		//So sánh phân biệt chữ hoa với chữ thường
		int ss12=s1.compareTo(s2); System.out.println(ss12);
		int ss14 = s1.compareTo(s4); System.out.println(ss14);

		
		//Hàm compareToIgnoreCase so sánh s1 với s3. kết quả trả về là > ỏ < ỏ = 0;
		//So sánh phân biệt chữ hoa với chữ thường
		int ss13= s1.compareToIgnoreCase(s3); System.out.println(ss13);
		
		
		////Hàm equals so sánh s1 với s4. kết quả trả về là true or false
		//So sánh phân biệt chữ hoa với chữ thường
			if(s1.equals(s4)) System.out.println("s1 bằng s4");
			else System.out.println("s1 không bằng s4");
			
			
		//Hàm equalsIgnoreCase so sánh s1 với s4. kết quả trả về là true or false
			//So sánh không phân biệt chữ hoa với chữ thường
				if(s1.equalsIgnoreCase(s3)) System.out.println("s1 bằng s3");
				else System.out.println("s1 không bằng s3");
	}

}
