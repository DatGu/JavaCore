/*
 1.Lớp abstract là một lớp trừu tượng không thể khởi tạo nó bằng toán tử new
 2.Trong lớp có tồn tại abstract method thì lớp cũng phải định nghĩa là abstract class
 3.abstract method chỉ định nghĩa tên hàm và các đối số, KHÔNG CÓ NỘI DUNG HÀM
 4.Bất cứ class nào kế thừ abstract method đều phải định nghĩa lại các  abstract method 
 của của lớp mà nó kế thừa. Không định nghĩa thì cũng phải ghi lại abstract method đó
 */

package project.model;

//Khai báo abstract class đúng với ý 2
public abstract class NhanVien {
	protected int ma;
	protected String ten;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	
	//Khai báo một abstract method theo đúng ý 3
	public abstract void tinhLuong();
}















