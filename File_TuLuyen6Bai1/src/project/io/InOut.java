package project.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import project.model.SanPham;

public class InOut {
	public static void luuFile(ArrayList<SanPham> dssv,String path)
	{
		try {
			FileOutputStream fos=new FileOutputStream(path);
			OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw=new BufferedWriter(osw);
			for(SanPham str:dssv)
			{
				bw.write(str.toString());
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception ex) {
			ex.printStackTrace();		
		}
	}
	
	public static void docFile(ArrayList<SanPham> dssv,String path)
	{
		try {
			FileInputStream fis=new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
			BufferedReader br=new BufferedReader(isr);
			String line=br.readLine();
			while(line!=null)
			{
				String arr[]=line.split(":;");
				SanPham sp=new SanPham();
				sp.setMaSanPham(Integer.parseInt(arr[1]));
				sp.setTenSanPham(arr[3]);
				dssv.add(sp);
				line=br.readLine();
				
			}
			br.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
