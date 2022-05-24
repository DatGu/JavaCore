package project.test;

import project.model.SinhVien;

public class SinhVienTest {

	public static void main(String[] args) {
		//Tạo ô nhớ và khởi tạo cho sv1
		SinhVien sv1=new SinhVien(328,"Phạm Tiến Đạt");
		//Tạo ô nhớ và khỏi tạo cho sv2
		SinhVien sv2=new SinhVien(123, "Phạm Huy Hoàng");
		
		//Alias là đặc điểm mà trên dung một ô nhớ có nhiều biến đối tượng cùng trỏ tới
		/*Ví dụ sau
		Khi đó đối tượng sv1 sẽ trỏ đến vùng nhớ của đối tượng sv2.  
		sv1 và sv2 sẽ cùng quản lí 1 ô nhớ. khi ta thay đổi sv1 thì sv2 thay đổi theo và ngược lại
		Theo cơ chế gom rác tự động,ô nhớ sv1 cũ không được đối tượng nào tham chiếu sẽ
		 tự động bị thu hồi hay là bị xóa đi */
		sv1=sv2;
		
		//Ta làm lại vd với sv3 và sv4 
		SinhVien sv3=new SinhVien(328,"Phạm Đạt");
		SinhVien sv4=new SinhVien(322,"Phạm Taa");
		//Khi đó sẽ tạo ra 1 ô nhớ mới giống ô nhớ của sv4 cho sv3 trỏ vào
		//sv3 và sv4 sẽ trỏ về 2 ô nhớ khác nhau 
		sv3=sv4.copy();
		System.out.println(sv3.getHoTen());
	}

}
