package Sort;

import java.util.Scanner;

public class BubbleSort {
	public static void nhapMang(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Mời bạn nhập phần tử thứ "+i+": ");
			arr[i]=sc.nextInt();
		}	
	}
	
	public static void xuatMang(int arr[])
	{
		System.out.println("Mảng là ");
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{			
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số phần tử của mảng= ");
		int n=new Scanner(System.in).nextInt();
		int arr[]=new int[n];
		nhapMang(arr);
		xuatMang(arr);
		bubbleSort(arr);
		xuatMang(arr);
	}

}
