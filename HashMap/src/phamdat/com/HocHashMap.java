package phamdat.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HocHashMap {

	public static void main(String[] args) {
		// HashMap cho phép truy xuất trực tiếp tới 1 đối tượng nào đó bằng khóa chính của nó

		//Khai báo hashmap với khóa chính là kiểu int và đối tượng kiểu string
		HashMap<Integer, String> dssv= new HashMap<Integer, String>();
		
		//Thêm phần tử với khóa chính và đối tượng
		//Khi put trùng khóa chính thì values sẽ được update lại
		dssv.put(1, "Phạm Tiến Đạt");
		dssv.put(366, "Nguyễn Văn A");
		dssv.put(22, "Nguyễn Thị B");
		
		//Xuất values theo khóa chính. Còn nhiều phương thức khác như xóa, tìm,...
		System.out.println(dssv.get(366));
		
		//Xuất Values
		//Tạo 1 collection lấy ra values
		Collection<String> tensv=dssv.values();
		for(String ten: tensv ) System.out.println(ten);
		
		//Xuất Khóa Chính
		Set<Integer> masv=dssv.keySet();
		for(int ma: masv) System.out.println(ma);
		
	}

}
