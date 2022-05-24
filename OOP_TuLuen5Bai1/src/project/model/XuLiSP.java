package project.model;

import java.util.ArrayList;

public class XuLiSP {
		
	
	public void xuatDanhMucSP(ArrayList<ThongTinSP> dssp, String danhmuc)
	{
		System.out.println("Các sản phẩm trong danh mục "+danhmuc );
		for(ThongTinSP sp: dssp)
		{
			if(sp.getTenDanhMuc().equalsIgnoreCase(danhmuc))
			{
				System.out.println(sp.getTenSP());
			}
		}
	}
	
	public double tongGiaTriSP (ArrayList<ThongTinSP> dssp)
	{
		double sumGiaTri = 0;
		for(ThongTinSP sp: dssp)
		{
			sumGiaTri+=sp.getGiaSP();
		}
		return sumGiaTri;
	}
	
	public void xuatDanhMucXuatXu(ArrayList<ThongTinSP> dssp, String xuatxu)
	{
		System.out.println("Các sản phẩm có xuất xứ từ "+xuatxu);
		for(ThongTinSP sp: dssp)
		{
			if(sp.getTenDanhMuc().equalsIgnoreCase(xuatxu))
			{
				System.out.println(sp.getTenSP());
			}
		}
	}
}













