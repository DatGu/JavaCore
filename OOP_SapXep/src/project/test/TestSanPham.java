package project.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import project.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham> dssp=new ArrayList<SanPham>();
		dssp.add(new SanPham(11, "CoCa", 12));
		dssp.add(new SanPham(15, "PepSi", 19));
		dssp.add(new SanPham(9, "Panta", 9));
		dssp.add(new SanPham(7, "RedBull", 5));
		
		System.out.println("Danh sách sản phẩm là");
		for(SanPham sp : dssp)
			System.out.println(sp);
		
		System.out.println("Danh sách sản phẩm sắp xếp theo giá là ");
		Collections.sort(dssp);
		for(SanPham sp : dssp)
			System.out.println(sp);
		
		

	}

}
