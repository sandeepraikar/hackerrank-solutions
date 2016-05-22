package algorithms.misc;

public class ArrayRotationProblem {

	public static void main(String args[]){
		int[] arr ={11,12,14,17,19,2,8,9,10};
		//int[] arr ={1,2,8,9,10};
		System.out.println("The array is rotated : "+findRotationCount(arr)+" times");
	}

	private static int findRotationCount(int[] arr) {
		int low =0;
		int high=arr.length-1;
		while(low<=high){
			int mid =(low+high)/2;
			if(arr[low]<=arr[high]){
				return low; //Case 1: when the array is sorted!
			}
			int next=(mid+1)%arr.length;
			int prev=(mid-1)%arr.length;
			if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
				return mid; //Case2: when adjacent elements of the mid element are smaller
			}
			if(arr[mid]<=arr[high]){
				high=mid-1;
			}else if(arr[low]<=arr[mid]){
				low=mid+1;
			}
			
		}
		return -1;
	}
	
}
