package project.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import project.model.KhachHang;

public class InOut {
	public static void luuFile(ArrayList<KhachHang> dskh ,String path)
	{
		try {
			FileOutputStream fos=new FileOutputStream(path);
			OutputStreamWriter osw=new OutputStreamWriter(fos);
			BufferedWriter bw=new BufferedWriter(osw);
			for(KhachHang str:dskh)
			{
				String stri=str.toString();
				bw.write(stri);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void docFile(ArrayList<KhachHang> dskh,String path)
	{
		try {
			FileInputStream fis=new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
			BufferedReader br=new BufferedReader(isr);
			String line=br.readLine();
			while(line!=null)
			{
				String arr[]=line.split(";");
				if(arr.length==3)
				{
					KhachHang kh=new KhachHang(Integer.parseInt(arr[0]),arr[1] , Integer.parseInt(arr[2]));
					dskh.add(kh);
				}
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

