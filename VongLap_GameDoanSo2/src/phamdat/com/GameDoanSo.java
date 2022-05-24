package phamdat.com;

import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {

	public static void main(String[] args) {
		char dk;
		Random rd= new Random();
		do {
	    
		int diem=5;
		
		while(diem>0 && diem<10) {
		int somay=1+rd.nextInt(5);
		System.out.println("Máy đã chọn từ 1 đến 5 số mời bạn đoán");
		while(diem>0 && diem<10) {
			int songuoi= new Scanner(System.in).nextInt();
			if(songuoi==somay)
			{
				System.out.println("Bạn đoán đúng ròi. Bạn được cộng 1 điểm nhé!");
				diem++;
				System.out.println("Điểm của bạn bây giờ là "+ diem);
				System.out.println("Mời bạn đoán tiếp");
				System.out.println("-------------------------------------------------");
				break;
			}
			else {
				System.out.println("Bạn đoán sai ròi. Bạn bị trừ 1 điểm");
				diem--;
				System.out.println("Điểm của bạn bây giờ là "+ diem);
				System.out.println("Mời bạn đoán tiếp");
			}
			
		}
	}
		if(diem==0) System.out.println("Bạn thua rồi. Chúc bạn may mắn lần sau");
		if(diem>=10) System.out.println("Congratulations! Bạn thắng rồi");
		System.out.println("-----------------------------------------------");
		System.out.println("Bạn có muốn chơi tiếp không ??(c/k)");
	    dk= new Scanner(System.in).nextLine().charAt(0);
		}while(dk== 'c');
		
		System.out.println("Cảm ơn bạn đã chơi. Hẹn gặp lại bạn ");

	}

}
