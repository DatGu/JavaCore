package project.model;

public class SinhVien implements Cloneable {
	private String hoTen;
	private int ma;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	
	public SinhVien(int ma, String hoTen)
	{
		this.hoTen=hoTen;
		this.ma=ma;
	}

	/*Trong ví dụ ở phần test
	 Để cho sv1 giống vs sv2 mà không alias ta phải clone 1 ô nhớ giống với ô nhớ của sv2
	 và cho sv1 trỏ tới. Khi đó 2 đối tượng sẽ quản lí 2 ô nhớ khác nhau
	 Để làm như vậy ta dùng implements Clonable như sau
	 */
	public SinhVien copy()
	{
		     
		try {
			      //Ép Kiểu
			return (SinhVien) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}










