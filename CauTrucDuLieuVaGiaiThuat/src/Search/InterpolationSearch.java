package Search;

public class InterpolationSearch {
	public static int InterpolationSearch(int k, int arr[])
	{
		int left = 0, right = arr.length - 1;
		while(left<=right&&k>=arr[left]&&k<=arr[right]) {	
			//Công thức tìm vị trí gần bằng giá trị của k trong mảng
			int search = left + (right - left) * ((k - arr[left]) / (arr[right] - arr[left]));
			System.out.println(search);
			if (k == arr[search])
				return search;
			else if (k > arr[search])
				left = search + 1;
			else
				right = search - 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,7,9,22,44,55,66,77,88,99,100,111,222,333,444,555,666,777,888,999,1999,2999,3333,4444,5555,6666,7777,8888,9999};
		System.out.println("Vị trí của 5 trong mảng là "+InterpolationSearch(5, arr));
		
	}

}
