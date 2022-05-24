package project.model;

public class HinhVuong extends HinhChuNhat {
	private double doDai;
	public HinhVuong() {
		super();
	}
	public HinhVuong(String mau,double doDai) {
		super(mau, doDai,doDai);
		this.doDai=doDai;	
	}
	public double getDoDai() {
		return doDai;
	}
	public void setDoDai(double doDai) {
		this.chieuDai=doDai;
		this.chieuRong=doDai;
		this.doDai = doDai;
	}

	public String thongTin() {
		return "Độ dài hình vuông là "+this.doDai;
	}
	
	
}
