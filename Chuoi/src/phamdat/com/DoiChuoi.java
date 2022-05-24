package phamdat.com;

public class DoiChuoi {
     public static void main(String[] args) {
		String s1= " Ê ae, Chào ae ";
		String s2= " Ê ae, Chào ae ";
		
		//Đổi chuỗi ae thành chuỗi mọi người.Đổi thành chuỗi mới nên cần phải gán lại
		s1=s1.replace("ae", "mọi người");
		System.out.println(s1);
		
		//Đuổi chuỗi ae đầu tiền thành chuỗi mọi người
		s2=s2.replaceFirst("ae", "mọi người");
		System.out.println(s2);
		
		
	}
}
