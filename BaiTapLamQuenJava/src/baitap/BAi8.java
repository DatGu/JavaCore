package baitap;

public class BAi8 {

	public static void main(String[] args) {
		System.out.println("Các số thuận nghịch độc có 6 chữ số là");
		for(int i=100000;i<=999999;i++)
		{
			//Đưa về mảng
			int n=i;
			int a[]=new int[6];
			for(int j=5;j>=0;j--)
			{
				int duoi=n%10;
				n=n/10;
				a[j]=duoi;
			}
			
			//Check số qua mảng
			boolean check=true;
			for(int h=0; h<=2;h++)
			{
				if(a[h]!=a[5-h])
				{
					check=false;
					break;
				}
			}
			if(check==true) System.out.println(i);
			
		}
			

	}

}
