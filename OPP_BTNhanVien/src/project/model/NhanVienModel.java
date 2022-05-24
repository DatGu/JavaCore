package project.model;

import java.util.Scanner;

public class NhanVienModel {
	private String hoTen;
	private String gioiTinh;
	private String queQuan;
	private String chucVu;
	private double luong;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	public NhanVienModel() {
	};
	
	public NhanVienModel(String hoTen, String gioiTinh, String queQuan, String chucVu, double luong) {
		this.hoTen=hoTen;
		this.gioiTinh=gioiTinh;
		this.queQuan=queQuan;
		this.chucVu=chucVu;
		this.luong=luong;
		}
	
	public void nhap()
	{
		System.out.println("Mời bạn nhập Họ tên Nhân Viên ");
		String hoTen=new Scanner(System.in).nextLine();
		this.hoTen=hoTen;
		System.out.println("Mời bạn nhập Giới tính Nhân Viên ");
		String gioiTinh=new Scanner(System.in).nextLine();
		this.gioiTinh=gioiTinh;
		System.out.println("Mời bạn nhập Quê quán Nhân Viên ");
		String queQuan=new Scanner(System.in).nextLine();
		this.queQuan=queQuan;
		System.out.println("Mời bạn nhập Chức vụ Nhân Viên ");
		String chucVu=new Scanner(System.in).nextLine();
		this.chucVu=chucVu;
		System.out.println("Mời bạn nhập lương Nhân Viên ");
		double luong=new Scanner(System.in).nextDouble();
		this.luong=luong;
	}
	
	public void xuat() {
		System.out.println("Họ Tên Nhân Viên Là : "+hoTen);
		System.out.println("Giới tính Nhân Viên là "+gioiTinh);
		System.out.println("Quê Quán Nhân Viên đó Tại "+queQuan);
		System.out.println("Chức vụ Nhân Viên đó là "+ chucVu);
		System.out.println("Lương Nhân Viên đó là "+luong);
	}
}
