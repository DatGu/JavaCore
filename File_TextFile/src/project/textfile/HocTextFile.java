package project.textfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class HocTextFile {
	//Hàm lưu một list vào đường dẫn path.Kiểm tra có lưu thành công hay không
	public static void luuFile(ArrayList<String> dssv,String path)
	{
		try {
			FileOutputStream fos=new FileOutputStream(path);
			OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw=new BufferedWriter(osw);
			for(String str:dssv)
			{
				bw.write(str);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception ex) {
			ex.printStackTrace();		
		}
	}
	
	public static void docFile(ArrayList<String> dssv,String path)
	{
		try {
			FileInputStream fis=new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
			BufferedReader br=new BufferedReader(isr);
			String line=br.readLine();
			while(line!=null)
			{
				if(line.length()>0)
				{
					dssv.add(line);
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
	
	public static void main(String[] args) {
		ArrayList<String> dsdata1=new ArrayList<String>();
		ArrayList<String> dsdata2=new ArrayList<String>();
		
		dsdata1.add("Dòng 1");
		dsdata1.add("Dòng 2");
		dsdata1.add("Dòng 2");
		dsdata1.add("Dòng 4");
		
		luuFile(dsdata1, "C:\\Users\\DatGuu\\Desktop\\CoDe\\Java\\File_TextFile\\src\\project\\textfile\\data1.txt");
		System.out.println("Lưu File Thành Công");
		docFile(dsdata2, "C:\\Users\\DatGuu\\Desktop\\CoDe\\Java\\File_TextFile\\src\\project\\textfile\\data1.txt");
		System.out.println("Đọc File data1 vào List thành công");
		for(String str:dsdata2)
		{
			System.out.println(str);
		}
	}

}
