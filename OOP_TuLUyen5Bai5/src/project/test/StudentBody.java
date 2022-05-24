package project.test;

import project.model.Student;

public class StudentBody {

	public static void main(String[] args) {
		Student sv1=new Student();
		sv1.setName("Phạm Tiến Đạt");
		sv1.setHomeAddress("Cổ Chất", "Nam Định", "Việt Nam", 1234);
		sv1.setSchoolAddress("Lê Hồng Phong-Phủ Lý","Hà Nam","Việt Nam",5678);
		System.out.println(sv1);
		

	}

}
