package phamdat.com;

public class StringBuilder {

	public static void main(String[] args) {
		//Tao đối tượng sb xử lí chuỗi
		java.lang.StringBuilder sb= new java.lang.StringBuilder();
		
		//Nối chuỗi
	    sb.append("1234567");
	    sb.append("789");
	    
	    //Lấy chuỗi ra
	    String s= sb.toString(); 
	    System.out.println(s);
	    //Chèn chuỗi xxx vào vị trí thứ 3 (chuỗi đếm từ 0)
	    sb.insert(3, "xxx");
	    s= sb.toString();
	    System.out.println(s);
	    
	    //Xóa chuỗi từ vị trí 3 đến vị trí 6 [3...6)
	    sb.delete(3, 6);
	    s= sb.toString();
	    System.out.println(s);
	    
	    
	    
		

		

	}

}
