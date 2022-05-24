package project.model;

public class StaticStudy {
	//Static
	/*Khai báo static là chia sẻ 1 vùng ô nhớ. Các đối tượng sẽ dùng chung ô nhớ này
	 Khởi tạo 1 lần duy nhất trong chương trình. Được khởi tạo trước khi được khởi tạo
	 Muốn truy xuất tới các static ta lấy trực tiếp tên lớp chấm tên Thuộc Tính hoặc Phương Thức
	 mà không cần khởi tạo đối tượng
	 Static cho thuộc tính gọi là Class member
	 Static cho phương thức gọi là Class Method
	 */
	
	private static int a;

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		StaticStudy.a = a;
	}
	
	public static void fn1()
	{
		System.out.println("Đây là hàm static của class");
	}
	
	public void fn2()
	{
		System.out.println("Đây là hàm bình thường của class");
	}
}













