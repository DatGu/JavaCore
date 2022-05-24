package project.model;

public class HinhChuNhat extends HinhHoc {

	
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}


	public HinhChuNhat(double chieuRong, double chieuDai) {
		super(chieuRong, chieuDai);
		// TODO Auto-generated constructor stub
	}


	public double chuVi() {
		return (chieuDai+ chieuRong)*2;
	}

	
	public double dienTich() {
		return chieuDai*chieuRong;
	}

}
