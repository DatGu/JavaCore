package baitap;

import java.util.Scanner;

public class Bai33 {
	public static void main(String[] args) {
		// HoDemTen--> TenHoDem
		String s1 = new String();
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		String[] array = s1.split(" ");
		System.out.println("Tên Họ Đệm là: " + array[2] + array[0] + array[1]);
		System.out.println("a");
		sc.close();
	}
}
