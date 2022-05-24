package phamdat.com;

import java.util.Scanner;

public class ThaoTacMangTuLuyen7 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Mời bạn nhập số phần tử của mảng");
		int n= sc.nextInt();
		int m[]= new int[n];
		
		//Nhập Mảng
		for(int i=0; i<m.length; i++)
		{
		    System.out.print("Mời bạn nhập giá trị củ phần tử "+(i+1)+" :");
			m[i]=sc.nextInt();
		}
		
		//Xuất Mảng
		System.out.println("Mảng bạn vừa nhập là ");
		for(int i : m) System.out.print(i+"\t");
		System.out.println("");
		//Tính tổng các phần tử của mảng
		int sum = 0;
		for(int i :m) sum+=i;
		System.out.println("Tổng các phần tử của mảng là "+sum);
		
		//Số lần xuất hiện của 1 số
		int dem=0;
		System.out.println("Mời bạn nhập số cần tìm ");
		int k= sc.nextInt();
		for(int i=0; i<m.length; i++)
		{
			if(m[i]==k) dem++;
		}
		if(dem!=0) System.out.println("Số bạn vừa nhập xuất hiện "+dem+ " lần trong mảng");
        if(dem==0) System.out.println("Số bạn vừa nhập không có trong mảng");
		
        //Tìm số lớn nhất
        int max=m[0];
        for(int i=0; i<m.length; i++)
        {
        	if(m[i]>max) max=m[i];
        }
        System.out.println("Số lớn nhất trong mảng là "+max);
        
        //Tìm số nhỏ nhất
        int min=m[0];
        for(int i=0; i<m.length; i++)
        {
        	if(m[i]<min) min=m[i];
        }
        System.out.println("Số nhỏ nhất trong mảng là "+min);
        
        //Sắp xếp mảng tăng dần
        for(int i=0; i<m.length-1;i++)
        {
        	for(int j=i+1; j<m.length; j++)
        	{
        		if(m[i]>m[j])
        		{
        			int temp=m[i];
        			m[i]=m[j];
        			m[j]=temp;
        		}
        	}
        }
        System.out.println("Mảng theo chiều tăng dần là ");
        for(int i : m) System.out.print(i+"\t");
        System.out.println("");
        
        //Sắp xếp mảng giảm dần
        for(int i=0; i<m.length-1;i++)
        {
        	for(int j=i+1; j<m.length; j++)
        	{
        		if(m[i]<m[j])
        		{
        			int temp=m[i];
        			m[i]=m[j];
        			m[j]=temp;
        		}
        	}
        }
        System.out.println("Mảng theo chiều giảm dần là ");
        for(int i : m) System.out.print(i+"\t");
        System.out.println("");
        
        //Xuất số nguyên tố 
        System.out.println("Các số nguyên tố có trong mảng là");
        for(int i=0; i<m.length; i++)
        {
        	int sumuoc=0;
        	for(int j=1; j<=m[i];j++)
        	{
        		if(m[i]%j==0) sumuoc+=j;
        	}
        	if(m[i]==1) System.out.print(m[i]+ "\t");
        	if (sumuoc==(m[i]+1)) System.out.print(m[i]+ "\t");
        	
        }
	}

}
