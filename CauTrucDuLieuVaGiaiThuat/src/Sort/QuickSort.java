package Sort;

import java.util.Scanner;

public class QuickSort {

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
	public static void QuickSort(int a[], int left, int right)
	{
		int i=left;
		int j=right;
		int pivot=(left+right)/2;
		while (i<j)
		{
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j++;
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j++;
			}
		}
		QuickSort(a, left, j);
		QuickSort(a, i, right);
	}
	
	public static void main(String[] args) {
		System.out.println("Mời bạn nhập số phần tử của mảng= ");
		int n=new Scanner(System.in).nextInt();
		int arr[]=new int[n];
		nhapMang(arr);
		xuatMang(arr);
		QuickSort(arr, 0, n-1);
		xuatMang(arr);

	}

}
