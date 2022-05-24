package project.model;

public class DanhMucSP  {
	private int maDanhMuc;
	private String tenDanhMuc;
	public DanhMucSP(int maDanhMuc, String tenDanhMuc) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
		
	}
	public DanhMucSP() {
		super();
	}
	public int getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	
	
	
}
