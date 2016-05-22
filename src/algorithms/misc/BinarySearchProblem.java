package algorithms.misc;


public class BinarySearchProblem {
	static int[] arr = {1,3,10,10,10,18,20};
	public static void main(String args[]){
		//Computing first and last occurrence of an element using BinarySearch
		System.out.println(find(arr,10));
	}

	private static int find(int[] arr,int key) {
		int low =0;
		int high = arr.length-1;
		int result =-1;
		while(low<=high){
			int mid = (low+high)/2;
			if(arr[mid]==key){
				result =mid;
				//high=mid-1;
				low=mid+1;
			}else if(key<arr[mid]){
				high=mid-1;				
			}else {
				low = mid+1;
			}
		}
		return result;
	}

	
}
