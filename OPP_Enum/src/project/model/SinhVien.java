package project.model;
	
/*Enum là một dạng đạc biệt của Class, nó chủ yếu dể lưu trữ tập dữ liệu dạng liệt kê có giới hạn\
Dùng enum rất khoa học trong việc kiểm tra trạng thái của đối tượng
Khi nào ta biết đượn giới hạn của trường hợp thì mời nên dùng enum*/
public class SinhVien {
	private int ma;
	private String ten;
	private double dtb;
	private XepLoai loai;
	public SinhVien(int ma, String ten, double dtb) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.dtb = dtb;
		this.loai = getLoai();
	}
	public SinhVien() {
		super();
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public XepLoai getLoai() {
		if(this.dtb>=8.0) this.loai=XepLoai.Gioi;
		else if (this.dtb>=6.5) this.loai=XepLoai.Kha;
		else if(this.dtb>=5.0) this.loai=XepLoai.TrungBinh;
		else if(this.dtb<5.0) this.loai=XepLoai.Yeu;
		return loai;	
	}

	@Override
		public String toString() {
			return this.ma+"\t"+this.ten+"\t Điểm Trung Bình là "+this.dtb+"\t Xếp loại "+this.loai.description();
		}
	
}
