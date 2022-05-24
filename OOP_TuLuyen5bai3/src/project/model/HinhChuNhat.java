package project.model;

public class HinhChuNhat extends Hinh {
	protected double chieuDai;
	protected double chieuRong;
	
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
		super();
	}

	public HinhChuNhat(String mau,double chieuDai,double chieuRong) {
		super(mau);
		this.chieuDai=chieuDai;
		this.chieuRong=chieuRong;
	}

	@Override
	public double dienTich() {	
		return this.chieuDai*this.chieuRong;
	}

	@Override
	public double chuVi() {
		return (this.chieuDai+this.chieuRong)*2;
	}

	@Override
	public String thongTin() {
		return "Chiều dài "+this.chieuDai+" Chiều rộng "+this.chieuRong;
	}

}
