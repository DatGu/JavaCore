package Search;

public class BinarySearch {

	public static int BinarySearchx(int k,int arr[]) {
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid =left+(right-left)/2;
			//int mid=(left+right)/2;
			System.out.println(mid);
			if(arr[mid]==k) return mid;
			else if(arr[mid]<k) left=mid+1;
			else right=mid-1;		
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,7,9,22,44,55,66,77,88,99,100,111,222,333,444,555,666,777,888,999,1999,2999,3333,4444,5555,6666,7777,8888,9999};
		System.out.println("Vị trí của 5 trong mảng là "+BinarySearchx(5, arr));
	}

	}


