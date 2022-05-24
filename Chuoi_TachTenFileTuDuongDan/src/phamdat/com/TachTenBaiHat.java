package phamdat.com;

public class TachTenBaiHat {

	public static void main(String[] args) {
		String s="C:/Users/Administrator/Downloads/baihat.mp3";
		String []arr= s.split("/");
		 s= arr[arr.length-1];
		 
		 String []arr1= s.split("\\.");
		 s= arr1[0];
		 System.out.println(s);
		 	

	}

}
