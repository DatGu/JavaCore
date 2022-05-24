package project.model;

public class ThongTinSP extends DanhMucSP {
	private int maSP;
	private String tenSP;
	private double giaSP;
	private String xuatXuSP;
	public ThongTinSP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ThongTinSP(int maDanhMuc, String tenDanhMuc,int maSP, String tenSP, double giaSP,String xuatXuSP) {
		super(maDanhMuc, tenDanhMuc);
		this.maSP=maSP;
		this.tenSP=tenSP;
		this.giaSP=giaSP;
		this.xuatXuSP=xuatXuSP;
		// TODO Auto-generated constructor stub
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(double giaSP) {
		this.giaSP = giaSP;
	}
	public String getXuatXuSP() {
		return xuatXuSP;
	}
	public void setXuatXuSP(String xuatXuSP) {
		this.xuatXuSP = xuatXuSP;
	}
	
}
