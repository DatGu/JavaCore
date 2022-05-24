package Search;

public class LinearSearch {
	public static int LinearSearch(int k, int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,7,9,22,44,55,66,77,88,99,100,111,222,333,444,555,666,777,888,999,1999,2999,3333,4444,5555,6666,7777,8888,9999};
		System.out.println("Số 55 ở vị trí "+LinearSearch(55, arr));
	}

}
