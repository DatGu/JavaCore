package phamdat.com;

import java.util.ArrayList;
import java.util.Collections;

public class Bt8 {

	public static void main(String[] args) {
		ArrayList<Integer> ds= new ArrayList<Integer>();
		//Thêm
		ds.add(28);
		ds.add(8);
		ds.add(2003);
		//Sửa
		ds.set(1, 88);
		//Xóa 
		ds.remove(2);
		//Tìm Kiếm
		int vitri= ds.indexOf(88);
		System.out.println("Vị trí của số 88 là "+vitri);
		//Sắp xếp
		Collections.sort(ds);
		System.out.println("Sau khi sắp xếp là ");
		for(int i:ds) System.out.println(i+"\t");
		

	}

}
