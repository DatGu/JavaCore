package baitap;
	
public class Bai25 {

	public static boolean songuyento(int n)
	{
		
		int sumdu=0;
		int i=1;
		do {
			if(n%i==0) sumdu+=i;
			i++;
		}while(i<n);
		if(sumdu==1) return true;
		return false;
	}
	
	public static boolean sothuannghich(int n)
	{
		StringBuilder sb=new StringBuilder();
		String str=""+n;
		sb.append(str);
		String check=""+sb.reverse();
		if(str.equalsIgnoreCase(check)) return true;
		return false;
	}
	
	public static boolean allsonguyento(int n)
	{
		boolean check=true;
		while(n>0 && check==true)
		{
			int a=n%10;
			n=n/10;
			int sumdu=0;
			int i=1;
			do {
				if(a%i==0) sumdu+=i;
				i++;
			}while(i<a);
			if(sumdu==1) check=true;
			else check=false;
		}
		if(check==true) return true;
		return false;
	}
	
	public static void main(String[] args) {
		for(int i=10000; i<=9999999;i++)
			if(songuyento(i)&&allsonguyento(i)&&sothuannghich(i))
				System.out.println(i);
	}
}
