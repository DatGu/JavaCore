package Recursion;

import java.util.Scanner;

public class ThapHaNoi {
	public static void thapHaNoi(int n, char nguon, char trunggian,char dich )
	{
		if(n==1) System.out.println(nguon+"-->"+dich);
		else {
			thapHaNoi(n-1, nguon,dich,trunggian);
			thapHaNoi(1,nguon, trunggian,dich);
			thapHaNoi(n-1,trunggian,nguon,dich);
		}
	}
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập n=");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		thapHaNoi(n,'A','B','C');

	}

}
