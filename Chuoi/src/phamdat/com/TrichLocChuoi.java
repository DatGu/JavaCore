package phamdat.com;

public class TrichLocChuoi {

	public static void main(String[] args) {
		String s="0123456789";
		
		// Trích lọc ra chuỗi bên phải [2...length]
		String s1= s.substring(2);
		System.out.println(s1);
		
		//Trích lọc ra chuỗi [4...). Ví dụ muốn lấy 5 phần tử từ vị trí 4 thì vị trí cuối sẽ là 4+5=9
		String s2=s.substring(4, 9);
		System.out.println(s2);

	}

}
