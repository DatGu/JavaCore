package project.model;

import java.io.Serializable;

public class KhachHang implements Serializable{
	private int ma;
	private String hoTen;
	public KhachHang(int ma, String hoTen) {
		super();
		this.ma = ma;
		this.hoTen = hoTen;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	

}
