package project.model;

public class NhanVien {
	private String ho;
	private String ten;
	private int sp;
	public NhanVien(String ho, String ten, int sp) {
		super();
		this.ho = ho;
		this.ten = ten;
		if(sp<0) this.sp=0;
		if(sp>=0) this.sp=sp;
	}
	public NhanVien() {
		super();
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		if(sp<0) this.sp=0;
		if(sp>=0) this.sp=sp;
	}
	
	public double tinhLuong()
	{
		if(this.sp<=199) return this.sp*0.5;
		else if(this.sp<=399) return this.sp*0.55;
		else if(this.sp<=599) return this.sp*0.6;
		return this.sp*0.65;
	}
	
	public boolean lonHon(NhanVien nv2)
	{
		if(this.sp>nv2.sp) return true;
		return false;
	}
}





