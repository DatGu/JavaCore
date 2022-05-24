package phamdat.com;


public class StringTokenizer {

	public static void main(String[] args) {
		String s1="Pham Tien Dat";
		
		//tạo đối tượng token1 xử lí tách mặc định khoảng trắng,
		java.util.StringTokenizer token1= new java.util.StringTokenizer(s1);
		while(token1.hasMoreTokens())// trong khi còn token
		{
			//Trả về token tiếp theo dựa trên dấu phân tách. Pham là token đầu Tien là token 2 Dat là token 3
			String value= token1.nextToken();
			System.out.print(value);
		}
		
		String s2="Pham;Tien;Dat";
        //tạo đối tượng token2 xử lí tách dấu chấm phẩy
		java.util.StringTokenizer token2 =new java.util.StringTokenizer(s2, ";");
		
			     while(token2.hasMoreTokens())// trong khi còn phần tử
				{
					//Trả về token tiếp theo dựa trên dấu phân tách.
					String value2= token2.nextToken();
					System.out.print(value2);
				}
		String s3="Pham  ;   ! Tien;  !  Dat  !";
        //tạo đối tượng token3 xử lí tách dấu chấm phẩy, chấm than, khoảng trắng
		java.util.StringTokenizer token3 =new java.util.StringTokenizer(s3, ";! ");
		
				while(token3.hasMoreTokens())// trong khi còn phần tử
				{
					//Lấy dữ liệu và chuyển qua phần tử kế tiếp
					String value3= token3.nextToken();
					System.out.print(value3);
				}	
	}

}
