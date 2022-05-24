package baitap;

public class Bai26 {
	public static boolean snt(int n)
	{
		int du=0;
		for(int i=1;i<n;i++)
		{
			if(du==2) break;
			if(n%i==0) du++;
		}
		if(du==1||n==1) return true;
		return false;
	}
	public static boolean stn(int k) 
	{
		int n=k;
		int a[]=new int[7];
		for(int j=6;j>=0;j--)
		{
			int duoi=n%10;
			n=n/10;
			a[j]=duoi;
		}
		
		//Check số qua mảng
		boolean check=true;
		for(int h=0; h<=2;h++)
		{
			if(a[h]!=a[6-h])
			{
				check=false;
				break;
			}
		}
			
		if(check) return true;
		return false;
	}
	
	public static boolean sumstn(int v)
	{
		int n=v;
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			n=n/10;
			sum+=a;
		}
		if(snt(sum)) return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println("All number ");
		for(int i=1000000;i<=9999999;i++)
		{
			if(snt(i)&&stn(i)&&sumstn(i)) System.out.println(i);
		}
		System.out.println("Done");
	}

}
