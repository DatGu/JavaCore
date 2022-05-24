package Recursion;

public class BTChuyenCoSo10sang2 {
	public static void chuyen(int n)
	{
		int a=0;
		if(n>0)
		{
		if(n%2==0) a=0;
		else a=1;
		n=n/2;
		chuyen(n);
		System.out.println(a);
		}
		
		
	}
	public static void main(String[] args) {
		chuyen(581);

	}

}
