package project.model;

//Overloading Method xảy ra trong cùng một lớp, có các method cùng tên nhưng khác nhau về đối số
// Các method cùng tên gọi là overloading method
public class SinhVien {
	private int ma;
	private String hoTen;
	private double diem;
	
	//các contuctor là dạng overloading method đặc biệt có thể tái sử dụng
	//Ví dụ thể hiện tính tái sử dụng
	public SinhVien()
	{
		
	}
	
	public SinhVien(int ma)
	{
		this();//kế thừa hay gọi lại contructor không đối số 
		this.ma=ma;
	}
	
	public SinhVien(int ma, String hoTen)
	{
		this(ma);//kế thừa hay gọi lại contructor đối số ma
		this.hoTen=hoTen;
	}
	
	public SinhVien(int ma, String hoTen, double diem)
	{
		this(ma,hoTen);//kế thừa hay gọi lại contructor đối số ma, hoTen
		this.diem=diem;
	}

	
	//Với method thường. không có tái sử dụng
	public void xetTotNghiep()
	{
		if(this.diem>=5) System.out.println("Bạn đủ điều kiện tốt nghiệp");
		else System.out.println("Bạn không đủ điều khiện xét tốt nghiệp");
	}
	public void xetTotNghiep(double diem)
	{
		System.out.println("Điểm xết tốt nghiệp của bạn là "+ diem);
		
	}
	
	
	//Parameter List
	//Là trường hợp đặc biệt của overloading method
	//tạo ra một mảng, ta có thể truyền bao nhiêu đối số cũng được
	//Ví dụ với hàm tính tổng
		//ta truyền bao nhiêu đối số vào cũng được
	public int sum(int ...arr)
	{
		int s=0;
		for(int i : arr)
		{
			s+=i;
		}
		return s;
	}
}













