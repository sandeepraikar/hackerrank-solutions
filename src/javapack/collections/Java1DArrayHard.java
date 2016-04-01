package javapack.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArrayHard {

    private static boolean result = false;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner read = new Scanner(System.in);        
        int t = read.nextInt();
        for(int i=0;i<t;i++){
            int n = read.nextInt();
            int m = read.nextInt();
            boolean[] visited = new boolean[n];
            Arrays.fill(visited,false);
            int[] inpArray = new int[n];
            for(int j=0;j<n;j++){
                inpArray[j]=read.nextInt();                
            }
            result = false;

			validate(inpArray, visited, m, n, 0);
            if(result){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
        read.close();
    }
	private static void validate(int[] arr, boolean[] visitedArray, int m, int n, int i) {
		if (i > n || i + m >= n || i == n - 1) {
			result = true;
			return;
		}
		if (visitedArray[i] == true) {
			return;
		}
		visitedArray[i] = true;
		if (i + 1 < n && arr[i + 1] == 0) {
			validate(arr, visitedArray, m, n, i + 1);
		}
		if (i - 1 >= 0 && arr[i - 1] == 0) {
			validate(arr, visitedArray, m, n, i - 1);
		}
		if (i + m < n && arr[i + m] == 0) {
			validate(arr, visitedArray, m, n, i + m);
		}
	}
    
}