package project.model;

public class PhuongThucOPP {
 
	/*Có 2 loại
	 Service Method là các phương thức public để cung cấp ra ngoài cho các đối tượng sử dụng
	 Support Method là các phương thức private dùng để hỗ trợ cho Service Method. Các đối tượng 
	 ở ngoài không thể truy xuất hay sử dụng các Support Method
	*/
	//Ví dụ với bài tập về tam giác
	
	public PhuongThucOPP(double canhA,double canhB,double canhC) {
		this.canhA=canhA;
		this.canhB=canhB;
		this.canhC=canhC;
	}
	
	private double canhA;
	private double canhB;
	private double canhC;
	public double getCanhA() {
		return canhA;
	}
	public void setCanhA(double canhA) {
		this.canhA = canhA;
	}
	public double getCanhB() {
		return canhB;
	}
	public void setCanhB(double canhB) {
		this.canhB = canhB;
	}
	public double getCanhC() {
		return canhC;
	}
	public void setCanhC(double canhC) {
		this.canhC = canhC;
	}
	
	//Service Method
	public double chuVi()
	{
		return canhA+canhB+canhC;
	}
	
	//Support Method
	private double nuaChuVi() {
		return chuVi()/2;
	}
	
	//Service Method với hỗ trợ của SupportMethod
	public double dientich() {
		double p=nuaChuVi();
		return Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
	}
}















