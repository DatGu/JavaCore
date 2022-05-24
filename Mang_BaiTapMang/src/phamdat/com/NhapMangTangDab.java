package phamdat.com;

import java.util.Scanner;

public class NhapMangTangDab {

	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số phần tử của mảng ");
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]= new int [n];
	    boolean ktra=false;
	    for(int i=0; i<a.length; i++)
	    {
	    	System.out.println("Mời bạn nhập phần tử thứ "+(i+1)+" :");
	    	a[i]=sc.nextInt();
	    	
	    	do {
	    	ktra=false;
	    	for(int j=0;j<i;j++)
	    	{
	    		if(a[j]>a[i])
	    		{
	    			System.out.println("Bạn đã nhập không theo thứ tự tăng dần");
	    			System.out.println("Bạn nhập lại phần tử thứ "+(i+1)+ " :");
	    			a[i]=sc.nextInt();
	    			ktra=true;
	    		}
	    	}
	    	}while(ktra==true);
	    }
	    System.out.println("Mảng bạn vừa nhập là ");
	    for(int i : a) System.out.print(i+"\t");

	}

}
