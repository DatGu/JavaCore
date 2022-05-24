package baitap;
import java.util.Scanner;

public class Bai20 {
	
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số n=");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Dãy số nguyên tố fibonaci nhỏ hơn n là: ");
		for(int i=1;fib(i)<=n;i++)
		{
			int du=0;
			for(int j=1;j<fib(i);j++)
			{
			if(fib(i)%j==0) du+=j;
			}
			if(du==1||fib(i)==1) System.out.println(fib(i)+"\t");
		}
		
	}
	public static int fib(int n)
	{
		if(n<=2) return 1;
		return fib(n-1)+fib(n-2);
	}
	

}
