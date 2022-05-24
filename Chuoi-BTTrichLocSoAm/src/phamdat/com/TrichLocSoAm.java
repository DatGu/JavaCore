package phamdat.com;

public class TrichLocSoAm {

	public static void main(String[] args) {
		String s="abc-5xyz-12gb9df---100----pf-15-66-77";
		while(s.contains("--")) s=s.replace("--", "-");
		String []arr= s.split("-");
		for(int i=0; i<arr.length; i++)
		{
			
			// In ra dấu -
			switch (arr[i].charAt(0))
			{
			case '0': System.out.print("-"); break;
			case '1': System.out.print("-"); break;
			case '2': System.out.print("-"); break;
			case '3': System.out.print("-"); break;
			case '4': System.out.print("-"); break;
			case '5': System.out.print("-"); break;
			case '6': System.out.print("-"); break;
			case '7': System.out.print("-"); break;
			case '8': System.out.print("-"); break;
			case '9': System.out.print("-"); break;
			default: break;
			}
			
			
			
			//In ra các số sau dấu -
			for(int j=0; j<arr[i].length();j++)
			{
				int dk=0;
			switch (arr[i].charAt(j))
			{
			case '0': System.out.print(arr[i].charAt(j)); break;
			case '1': System.out.print(arr[i].charAt(j)); break;
			case '2': System.out.print(arr[i].charAt(j)); break;
			case '3': System.out.print(arr[i].charAt(j)); break;
			case '4': System.out.print(arr[i].charAt(j)); break;
			case '5': System.out.print(arr[i].charAt(j)); break;
			case '6': System.out.print(arr[i].charAt(j)); break;
			case '7': System.out.print(arr[i].charAt(j)); break;
			case '8': System.out.print(arr[i].charAt(j)); break;
			case '9': System.out.print(arr[i].charAt(j)); break;
			default : dk++;
			}
			 if (dk!=0) break;
		    }
		
			System.out.println("");

	    }
	}

}
