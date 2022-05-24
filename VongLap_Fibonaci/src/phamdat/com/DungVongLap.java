package phamdat.com;

import java.util.Scanner;

public class DungVongLap {

	public static void main(String[] args) {
    System.out.println("Mời bạn nhập vị trí trong dãy Fibonaci");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a[]= new int[n];
    if(n==1) a[0]=1; System.out.println("Giá trị tại vị trí đó là 1");
    if(n==2) a[0]=1;a[1]=1; System.out.println("Giá trị tại vị trí đó là 1");
   if(n>2) {
	   a[0]=1;
  	 a[1]=1;
    for(int i=2; i<a.length; i++)
    {
    	
    	a[i]=a[i-1]+a[i-2];
    }
    System.out.println("Giá trị tại vị trí đó là "+a[n-1]);
   }
    System.out.println("Dãy số đến vị trí đó là");
    for(int i :a) System.out.print(i+"\t");
   
	}
}
