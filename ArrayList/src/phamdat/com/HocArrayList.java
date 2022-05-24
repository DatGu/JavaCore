package phamdat.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HocArrayList {

	public static void main(String[] args) {
		ArrayList<String> ds1= new ArrayList<String>();
		ArrayList<Integer> ds2= new ArrayList<Integer>();
		ArrayList<Double> ds3 =new ArrayList<Double>();
		
		//Add theo thứ tự 
		ds1.add("hello");
		ds1.add("xin chào");
		
		// Xuất
		//cách 1
		for(String i: ds1) System.out.println(i);
		//Cách 2
		for(int i=0; i<ds1.size();i++) System.out.println(ds1.get(i));
		
		//Chèn thêm phần tử vào vị trí 1
		ds1.add(1, "Hí Hí");
		for(String i: ds1) System.out.println(i);
		
		//Xóa vị trí số 1
		ds1.remove(1);
		for(String i: ds1) System.out.println(i);
		
		//Đổi vị trí số 1 thành haha
		ds1.set(1, "haha");
		for(String i: ds1) System.out.println(i);
		
		//Kiểm tra xem phần tử có trong mảng hay k
				System.out.println("Có phần tử haha trong đó không : "+ ds1.contains("haha"));
		
		//Tìm vị trí phần tử
			    System.out.println("Vị trí của haha trong mảng là "+ ds1.indexOf("haha"));
			    
			    
		//Xóa hết phần tử
		ds1.clear();
		System.out.println("Số phần tử của ds1 còn lại là "+ ds1.size());
		
		//Kiểm tra xem có rỗng hay không
		System.out.println("Danh sách có rỗng hay không "+ ds1.isEmpty());
		
		
		//Thao Tác Tập Hợp
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(3); a1.add(4);
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(4); a2.add(5);
		
		//Hợp a2 vào a1
		a1.addAll(a2);
		for(int i: a1) System.out.print(i);
		System.out.println();
		
		//Tìm giao 2 tập hợp
		a1.retainAll(a2);
		for(int i: a1) System.out.print(i);
		System.out.println();
		
		//Hiệu 2 tập hợp
		a1.removeAll(a2);
		for(int i: a1) System.out.print(i);
		
		//Kiểm tra sự tồn tại a2 trong a1
		a1.containsAll(a2);
		
		//Chuyển đổi sang mảng
		a1.toArray();
		
		//Collections
		//Tráo đổi vị trí
		Collections.swap(a1, 1, 2);
		//Hoán Vị Ngẫu nhiên
		Collections.shuffle(a1);
		//Sắp xếp tăng dần
		Collections.sort(a1);
		//Đảo ngược
		Collections.reverse(a1);
		

	}

}
