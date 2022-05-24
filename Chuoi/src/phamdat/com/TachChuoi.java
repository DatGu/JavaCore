package phamdat.com;

public class TachChuoi {

	public static void main(String[] args) {
		// Có thể dùng StringTokenizes (vs jdk ver<14)
		
		//Dùng hàm splip
		
		String s1="Phạm;Tiến;Đạt";
		
		     //Tạo Mảng array lưu các phần tử đã tách theo dấu ;
		String []array=s1.split(";");
		//Nếu phải tách một kí tự đặc biệt nào đó thì ta dùng như sau
		// ví dụ ếu tách dấu . thì  String []array= s1.split("\\.")
		
		System.out.println("Họ "+array[0]);
		System.out.println("Tên Đệm "+array[1]);
		System.out.println("Tên "+array[2]);
		
		System.out.println("------------------");
		
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("------------------");
		
		for(String x : array)
			System.out.println(x);

	}

}
