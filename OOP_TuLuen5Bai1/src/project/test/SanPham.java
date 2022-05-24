package project.test;

import java.util.ArrayList;

import project.model.ThongTinSP;

public class SanPham {
	public static void xuatDanhMucSP(ArrayList<ThongTinSP> dssp, String danhmuc)
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
	
	public static double tongGiaTriSP (ArrayList<ThongTinSP> dssp)
	{
		double sumGiaTri = 0;
		for(ThongTinSP sp: dssp)
		{
			sumGiaTri+=sp.getGiaSP();
		}
		return sumGiaTri;
	}
	
	public static void xuatDanhMucXuatXu(ArrayList<ThongTinSP> dssp, String xuatxu)
	{
		System.out.println("Các sản phẩm có xuất xứ từ "+xuatxu);
		for(ThongTinSP sp: dssp)
		{
			if(sp.getXuatXuSP().equalsIgnoreCase(xuatxu))
			{
				System.out.println(sp.getTenSP());
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<ThongTinSP> dssp=new ArrayList<ThongTinSP>();
		ThongTinSP sp1=new ThongTinSP(1, "Đồ Điện Tử", 12, "Chuột Không Dây", 100, "Trung Quốc");
		dssp.add(sp1);
		ThongTinSP sp2=new ThongTinSP(1, "Đồ Điện Tử", 13, "Bàn Phím Không Dây", 130, "Việt Nam");
		dssp.add(sp2);
		ThongTinSP sp3=new ThongTinSP(2, "Học Tập", 25, "Giáo Trình", 300, "Trung Quốc");
		dssp.add(sp3);
		ThongTinSP sp4=new ThongTinSP(1, "Học Tập", 27, "Vở", 10, "Việt Nam");
		dssp.add(sp4);
		xuatDanhMucSP(dssp, "Đồ Điện Tử");
		xuatDanhMucXuatXu(dssp, "Trung Quốc");
		System.out.println("Tổng giá trị các sp là "+tongGiaTriSP(dssp));
	}

}
