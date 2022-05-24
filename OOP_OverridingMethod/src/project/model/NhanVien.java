package project.model;
/*
 Trong một tập các lớp có mối quan hệ huyết thống có các phương thức giống y sì tên và đối số
 nhưng có nội dung khác nhau gọi là các overriding method
 Overriding Method giúp các coder định nghĩa các mục đích giống nhau nhưng hành xử khác nhau với 
 từng đối tượng khác nhau, cùng sử dụng 1 method name
 Ví Dụ: giữa nhân viên chính thức và nhân viên thời vụ sẽ có cùng phuông thức tính lươg
 nhưng cách tính từng đối tượng khác nhau
 */
public class NhanVien {
	protected int id;
	protected String name;
	public NhanVien(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void tinhLuong() {
		
	}
	

}
