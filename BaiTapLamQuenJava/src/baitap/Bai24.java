package baitap;

import java.util.Scanner;
	
	
public class Bai24 {
	public static void nhapMang(int a[][],int m,int n) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)			
			{
				boolean check=true;
				while (check) {
					System.out.print("Mời bạn nhập giá trị hàng " + i + " cột " + j + " =");
					a[i][j] = sc.nextInt();
					check=false;
					if(a[i][j]<0||a[i][j]>100) check=true;
				}
			}
		}
	}
	public static void xuatMang(int a[][],int m, int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void max(int a[][], int m, int n)
	{
		int max=a[0][0];
		int hangmax=0,cotmax=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]>max) 
				{
					max=a[i][j];
					hangmax=i;
					cotmax=j;
				}
			}	
		}
		System.out.println("Giá trị max là "+max+" Tại hàng "+hangmax+" Tại cột "+cotmax);
		
	}
public static void xuatMangNT(int a[][],int m, int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int du=0;
				for(int h=1;h<a[i][j];h++)
				{
					if(a[i][j]%h==0) du++;
				}
				if(du==1|| a[i][j]==1) System.out.print(a[i][j]+"\t");
				else System.out.print("0\t");
			}
			System.out.println();			
		}
	}

public static void sapxepcot(int[][] a, int m, int n)
{
	for(int j=0;j<n;j++)
	{
		for(int i=0;i<m-1;i++)
		{
			for (int h=i+1;h<m;h++)
			{
				
				if(a[i][j]>a[h][j])
				{
					int temp=a[i][j];
					a[i][j]=a[h][j];
					a[h][j]=temp;
				}
			}
		}
	}
}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Mời bạn nhập m= ");
		int m=sc.nextInt();
		System.out.print("Mời bạn nhập n= ");
		int n=sc.nextInt();
		int ar[][]=new int[m][n];
		nhapMang(ar,m,n);
		System.out.println("Mảng vừa nhập là ");
		xuatMang(ar,m,n);
		max(ar,m,n);
		xuatMangNT(ar, m, n);
		sapxepcot(ar, m, n);
		System.out.println("Mảng sau sắp xếp là ");
		xuatMang(ar, m, n);
		
	}

}
