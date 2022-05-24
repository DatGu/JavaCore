package project.model;

import java.util.Set;

//Đặt tên class phải viết hoa chữ cái đầu
public class SinhVien {
	//Thuộc tính
	//Từ đầu tiên viết thường.Chữ cái đầu các từ sau viết hoa
	//Khai báo thuộc tính private
	private String hoTen;
	private double diem;
	
	/*Contructor
	Tên giống y hệt tên lớp. Không có kiểu trả về 
	Tạo giá trị ban đầu cho thuộc tính khí một đói tượng được cấp pháp bộ nhớ
	Thực hiện luôn khi tạo đối tượng
	Có 2 loại*/
	//Loại mặc định 
	public SinhVien() {
		//Code dùng cho khởi tạo ban đầu.Ví dụ tạo mặc định thuộc tính đối tượng như sau
		setHoTen("Phạm Tiến Đạt");
		setDiem(10);
	}
	
	//Loại có đối số
	public SinhVien(String hoTen, double diem)
	{
		//Từ khóa this dùng trỏ về thuộc tính bên trên
		//còn biến bên phải là các giá trị nhập vào trong contructor
		//Khi trùng tên thì cần dùng this để phân biệt 2 biến
		this.setHoTen(hoTen);
		this.setDiem(diem);
	}

	
	/*Getter-Setter
	Để đảm bảo tính đóng gói. Không thể truy xuất trực tiếp vào thuộc tính. Ta cần phải gọi 
	phương thức để xử lí
	setter dùng để thay đổi thuộc tính
	getter dùng truy xuất thuộc tính
	Kí tự đầu viết thường. Chữ cái đầu các từ tiếp theo viết hoa*/
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}	
	
	//Phương thức đặc biệt toString xuất đối tượng
	//Khi ta gọi tên đối tượng thì tự động gọi hàm toString
	public String toString() {
		return "Họ Tên :"+ this.hoTen+"--"+"Điểm :"+this.diem;
	}
	
	

}



















