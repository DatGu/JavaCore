package Recursion;

public class BTSumChuSo {
	public static int sum(int n)
	{	
		if(n<10) return n;
		int a=n%10;
		return a+sum(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1234));
	}

}
