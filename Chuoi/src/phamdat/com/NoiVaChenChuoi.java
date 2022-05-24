package phamdat.com;

public class NoiVaChenChuoi {

	public static void main(String[] args) {
		//Nên Dùng StringBuilder
		
		//Nhược điểm dùng dấu + là mỗi lần sẽ tạo ra một đối tượng lưu trữ khác nhau.
		//Gây ra nặng Ram, chạy rất châm;
		//Còn StringBuilder chỉ tạo ra một đối tượng, nhẹ và nhanh
		
		String s="hehe";
		String s1=s+"haha";System.out.println(s1);
		String s2=s+1+2+3;System.out.println(s2);
		String s3=s+(1+2+3);System.out.println(s3);
		
	

	}

}
