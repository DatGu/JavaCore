package project.model;

public class HinhTron extends Hinh {
	private double banKinh;
	
	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public HinhTron() {
		super();
	}

	public HinhTron(String mau, double banKinh) {
		super(mau);
		this.banKinh=banKinh;
	}

	@Override
	public double dienTich() {
		return Math.PI*Math.pow(this.banKinh, 2);
	}

	@Override
	public double chuVi() {
		return Math.PI*this.banKinh;
	}

	@Override
	public String thongTin() {
		return "Bán Kính "+this.banKinh;
	}

}
