package phamdat.com;

public class DoiChuHoaVaChuThuong {

	public static void main(String[] args) {
		//Chuyển cả chuỗi về in HOA
		String s1="phamdat".toUpperCase(); System.out.println(s1);
		
		//Chuyển cả chuỗi về in thường
		String s2="PHAMDAT".toLowerCase(); System.out.println(s2);
		
		//Đổi Ký tự đầu thành in hoa
		s1="phamdat";
		s1=s1.replaceFirst((s1.charAt(0)+""), (s1.charAt(0)+"").toUpperCase()); // +"" để chuyển về chuỗi
		System.out.println(s1);

	}

	
	}


