package phamdat.com;

import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {

	public static void main(String[] args) {
		
		Random rd= new Random();
		int somay= rd.nextInt(101);
		
		Scanner sc= new Scanner(System.in);
		
		int landoan=0; boolean dk=true;
		do
		{
			System.out.println("Máy đã chọn một số [0...100] Mời bạn đoán ");
			landoan=0;
		while(landoan<7)
		{
			landoan++;
			System.out.print("Lần đoán thứ "+landoan+" " );
			int songuoi=sc.nextInt();
			
			if(songuoi==somay) {
				System.out.println("Chúc mừng!! Bạn đoán đúng rồi ");
				break;
			}
			if(songuoi>somay) System.out.println("Bạn đoán sai rồi. Số máy nhỏ hơn cơ");
			if(songuoi<somay) System.out.println("Bạn đoán sai rồi. Số máy lớn hơn cơ");
		
		}
		landoan++;
		if(landoan==8) System.out.println("Bạn thua rồi");
		else System.out.println("Bạn thật là giỏi ");
		
		System.out.println("Bạn có muốn thử sức tiếp không ?? (c/k)");
		char h= new Scanner(System.in).nextLine().charAt(0);
		if(h=='c') dk=true;
		if(h=='k') dk=false;
		} while(dk);
		System.out.println("Cảm ơn bạn đã chơi. Tạm biệt bạn !!!");
	}
}
