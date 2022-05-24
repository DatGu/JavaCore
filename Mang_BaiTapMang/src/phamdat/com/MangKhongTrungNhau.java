package phamdat.com;

import java.util.Scanner;

public class MangKhongTrungNhau {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số phần tử của mảng ");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[]=new int[n];
		boolean ktra=false;
		for(int i=0; i<a.length; i++)
		{
			System.out.print("Mời bạn nhập phần tử thứ "+(i+1)+ " : ");
			a[i]=sc.nextInt();
			do {
		    ktra=false;
			
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print("Bạn nhập trùng rồi. Mời bạn nhập lại phần tử thứ "+(i+1)+" : ");
					a[i]=sc.nextInt();
					ktra=true;
					break;
				}
			}
			}while(ktra==true); //Nếu cần nhập lại thì chạy kiểm tra lại từ đầu
		}
		System.out.println("Mảng vừa nhập là");
		for(int i:a) System.out.print(i+ "\t");

	}

}
