package baitap;

import java.util.Scanner;

public class BAi27 {
	public static void nhapMang(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("Mời bạn nhập phần tử thứ " + (i + 1) + " =");
			a[i] = sc.nextInt();
			boolean check = true;
			while (check) {
				if (a[i] < 0 && a[i] > 100) {
					System.out.println("Vui lòng nhập từ 1 đến 99. Nhập lại =");
					a[i] = sc.nextInt();
					check = true;
				} else
					check = false;
			}
		}
	}

	public static void xuatMang(int a[]) {
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void chenMang(int a[], int k) {
		int vitri=a.length;
		int n = a.length+1;
		int m[] = new int[n];
		m[vitri]=66;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < k) {
				vitri = i;
				m[vitri] = k;
				break;
			}else m[vitri]=k;
		}
		int i = 0;
		int j = 0;
		while (i < m.length && j < a.length) {
			if (i != vitri) {
				m[i] = a[j];
				i++;
				j++;
			} else
				i++;
		}
		xuatMang(m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời bạn nhập số phần tử của mảng");
		int n = sc.nextInt();
		int a[] = new int[n];
		nhapMang(a, n);
		System.out.println("Mảng vừa nhập là ");
		xuatMang(a);
		bubbleSort(a);
		System.out.println("Hai phần tử lớn nhất và lớn nhì là " + a[0] + " " + a[1]);
		System.out.println("Phần tử cần chèn là ");
		int k = sc.nextInt();
		chenMang(a, k);
	}

}
