package project.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhMucSanPham {
	private int maDanhMuc;
	private String tenDanhMuc;
	public ArrayList<SanPham> dssp=new ArrayList<SanPham>();
	
	public DanhMucSanPham(int ma, String tenDanhMuc) {
		super();
		this.maDanhMuc = ma;
		this.tenDanhMuc = tenDanhMuc;
	}
	public int getMa() {
		return maDanhMuc;
	}
	public void setMa(int ma) {
		this.maDanhMuc = ma;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public void addSanPham(int masp,String tensp)
	{
		this.dssp.add(new SanPham(masp, tensp));
	}
	public void xuatDssp()
	{
		for(SanPham sp:dssp)
		{
			System.out.println(sp);
		}
	}
	public void timSanPhamTheoMa(int ma)
	{
		for(SanPham sp:dssp)
		{
			if(sp.getMaSanPham()==ma) 
				{
				System.out.println("Ở vị trí thứ "+dssp.indexOf(sp));
				System.out.println(sp);
				}
		}
	}
	public void timSanPhamTheoTen(String ten)
	{
		for(SanPham sp:dssp)
		{
			System.out.println("Ở vị trí thứ "+dssp.indexOf(sp));
			if(sp.getTenSanPham().equalsIgnoreCase(ten)) System.out.println(sp);
		}
	}
	
	public void xoaSanPhamTheoMa(int ma)
	{
		for(SanPham sp:dssp)
		{
			if(sp.getMaSanPham()==ma) 
				{
				int vitri=dssp.indexOf(sp);
				dssp.remove(vitri);
				}
		}
	}
	public void xoaSanPhamTheoTen(String ten)
	{
		for(SanPham sp:dssp)
		{
			if(sp.getTenSanPham()==ten) 
			{
			int vitri=dssp.indexOf(sp);
			dssp.remove(vitri);
			}
		}
	}
	public void sapXepTheoMa()
	{
		Collections.sort(this.dssp,	new Comparator<SanPham>() {

			@Override
			public int compare(SanPham o1, SanPham o2) {
				if(o1.getMaSanPham()<o2.getMaSanPham()) return 1;
				else if(o1.getMaSanPham()>o2.getMaSanPham()) return -1;
				else return 0;
			}
		});
	}
	
	public void sapXepTheoTen()
	{
		Collections.sort(this.dssp,	new Comparator<SanPham>() {

			@Override
			public int compare(SanPham o1, SanPham o2) {
				return o1.getTenSanPham().compareTo(o2.getTenSanPham());
			}
		});
}
	public void add(int ma,String ten)
	{
		dssp.add(new SanPham(ma, ten));
	};
	public void suaTheoMa(int ma)
	{
		Scanner sc=new Scanner(System.in);
		for(SanPham sp:dssp)
			if(sp.getMaSanPham()==ma) 
			{
				System.out.println("1.Sửa tên ");
				System.out.print("2.Sửa mã");
				int hd=sc.nextInt();
				switch(hd) {
				case(1):
					System.out.print("Mã Mới ");
					int mamoi=sc.nextInt();
					sp.setMaSanPham(mamoi);
					break;
				case(2):
					System.out.print("Tên Mới ");
					String tenmoi=sc.nextLine();
					sp.setTenSanPham(tenmoi);
					break;
				
				}
			}
	}
	public void suaTheoTen(String ten)
	{
		Scanner sc=new Scanner(System.in);
		for(SanPham sp:dssp)
			if(sp.getTenSanPham().equalsIgnoreCase(ten)) 
			{
				System.out.println("1.Sửa tên ");
				System.out.print("2.Sửa mã");
				int hd=sc.nextInt();
				switch(hd) {
				case(1):
					System.out.print("Mã Mới ");
					int mamoi=sc.nextInt();
					sp.setMaSanPham(mamoi);
					break;
				case(2):
					System.out.print("Tên Mới ");
					String tenmoi=sc.nextLine();
					sp.setTenSanPham(tenmoi);
					break;
				
				}
			}
	}
}
