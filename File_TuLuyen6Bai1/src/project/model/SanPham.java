package project.model;

public class SanPham {
	
	private int maSanPham;
	private String tenSanPham;
	public SanPham(int maSanPham, String tenSanPham) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
	}
	
	public SanPham() {
		super();
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	@Override
	public String toString() {
		return "Mã: "+this.maSanPham+"; Tên: "+this.tenSanPham;
	}
}
