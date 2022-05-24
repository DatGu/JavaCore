package phamdat.com;

import java.util.Arrays;

public class SapXep {

	public static void main(String[] args) {
		int m[]= {1,5,3,2,7,4,6,8,9,44,33,32,31,20,15};
		
		//Cách BubbleSort
		for(int i=0; i<m.length-1;i++)
		{
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i]>m[j])
				{
					int temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
			}
		}
		for (int i : m)
		{
			System.out.println(i);
		}
		
		System.out.println("----------------------------------------------");
		//Cách 2
		int n[]= {1,5,3,2,7,4,6,8,9,44,33,32,31,20,15};
		Arrays.sort(n);
		
		for (int i : n)
		{
			System.out.println(i);
		}
		

	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
