package project.model;

public abstract  class HinhHoc {
	protected double chieuRong;
	protected double chieuDai;
	
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public HinhHoc(double chieuRong, double chieuDai) {
		super();
		this.chieuRong = chieuRong;
		this.chieuDai = chieuDai;
	}
	public HinhHoc() {
		super();
	}
	
	public abstract double chuVi();
	public abstract double dienTich();
	
}
