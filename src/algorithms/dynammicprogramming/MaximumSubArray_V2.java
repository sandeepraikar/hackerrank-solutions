package algorithms.dynammicprogramming;

public class MaximumSubArray_V2 {

	public static void main(String[] args) {
		int arr[]= {-5,-3,-2,-3,-4,-5};
		//int arr[]= {-1};
		printMaxSumSubArray(arr);
	}

	private static void printMaxSumSubArray(int[] arr) {
		int n = arr.length;
		int result =0;
		int sum =0;
		for(int i=0;i<n;i++){
			if(result+arr[i]>0){
				sum+=arr[i];
			}else{
				result =0;
			}
			result = Math.max(sum, result);
			if (arr[arr.length - 1] <= 0) {				
				sum = arr[arr.length - 1];
				
			} else {
				for (int x : arr) {
					if (x > 0)
						sum += x;
				}
			}
		}
		System.out.println(result+" " + sum);
		
	}

}
