package baitap;

import java.util.ArrayList;

public class Bai13 {

	public static void main(String[] args) {
		int []a1= {1,4,5,6,8,33,55,77,88};
		int []a2= {0,2,3,7,9,10,66,100,111};
		int[] a3=new int[a1.length+a2.length];
		int i=0,j=0,h=0;
		while(true)
		{
			while(a1[i]<a2[j])
			{
				a3[h]=a1[i];
				if(i<a1.length-1)i++;
			}
			while(a1[i]>a2[j])
			{
				a3[h]=a2[j];
				if(j<a2.length-1)j++;
			}
			if(i==8&&j==8) break;
		}
		for(int l=0;l<a3.length; l++)
			{
			System.out.print(a3[l]+"\t");
			}
	}
		
	}


