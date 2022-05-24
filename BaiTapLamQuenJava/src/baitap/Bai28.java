package baitap;

import java.util.Scanner;
public class Bai28 {
	public static void nhapMang(int a[][],int n,int m)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print("Mời bạn nhập phần tử dòng "+(i+1)+" cột "+(j+1)+"=");
				a[i][j]=sc.nextInt();
				boolean check=true;
				while(check)
				{
					if(a[i][j]<0||a[i][j]>100)
					{
						System.out.println("Nhập từ 0 đến 100 thôi thanh niên êii");
						System.out.print("Nhập lại =");
						a[i][j]=sc.nextInt();
					}else check=false;
				}
			}
		}
	}
	public static void xuatMang(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void max12(int a[][],int n, int m)
	{
		int max=a[0][0];
		int indexi=0,indexj=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
					indexi=i;
					indexj=j;

				}
			}
		}
		System.out.println("Giá trị max là "+max+" tại dòng "+(indexi+1)+" cột "+(indexj+1));	
	}
	public static boolean SNT(int a)
	{
		if(a<2) return false;
		int lan=0;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0) lan++;
		}
		if(lan==1)return true;
		return false;
	}
	public static void timSNT(int a[][],int n, int m) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(SNT(a[i][j])==false) a[i][j]=0;
			}
		}
		xuatMang(a, n, m);
	}
	public static void hangSNT(int a[][],int n,int m) {
		int hangmax=0;
		int demmax=0;
		for(int i=0;i<n;i++)
		{
			int dem=0;
			for(int j=0;j<m;j++)
			{
				if(a[i][j]>0) dem++;
			}
			if(dem>demmax)
			{
				demmax=dem;
				hangmax=i;
			}
		}
		System.out.println("Hàng nhiều SNT nhất là hàng "+(hangmax+1));
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Mời bạn nhập số dòng = ");
		int n=sc.nextInt();
		System.out.print("Mời bạn nhập số cột = ");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		nhapMang(a, n, m);
		System.out.println("Mảng vừa nhập là ");
		xuatMang(a, n, m);		
		System.out.println("Mảng theo Snt là");
		timSNT(a, n, m);
		hangSNT(a, n, m);
	}
	
}
