package phamdat.com;

public class XoaKhoangTrangDuThua {

	public static void main(String[] args) {
		String s="             Phạm Tiến Đạt            ";
		String s1="             Phạm Tiến Đạt            ";
		String s2="             Phạm Tiến Đạt            ";
		String s3="      Phạm    Tiến    Đạt     ";
		//Xóa khoảng trắng dư thừa bên Trải và Phải 
		s=s.trim();
		System.out.println(s);
		
		//Xóa mỗi bên trái
		int vtriTrai=0;
		for(int i=0; i<s1.length();i++)
		{
			char c= s1.charAt(i);
			if(c==' ') vtriTrai=i;
			else break;
		}
		s1=s1.substring(vtriTrai+1);
		System.out.println(s1);
		
		
		//Xóa mỗi bên phải
		int vtriPhai=0;
			for(int i=s2.length()-1; i>=0;i--)
			{
				char c= s2.charAt(i);
				if(c==' ') vtriPhai=i;
				else break;
			}
			s2=s2.substring(0, vtriPhai);
			System.out.println(s2);
			
		
		// Xóa ở giữa các từ
			s3=s3.trim();
			while(s3.contains("  "))
			{
			    s3=s3.replace("  ", " ");
			}
			System.out.println(s3);
			

	}

}
