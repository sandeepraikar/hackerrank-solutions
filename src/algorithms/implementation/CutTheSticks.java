package algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> stickList = new ArrayList<Integer>();
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            stickList.add(arr[arr_i]);
        }
        in.close();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int count=0;
          while (stickList.size() > 0){
        		count = 0;
        		ListIterator<Integer> iter = stickList.listIterator();
                min = Collections.min(stickList);
	        	while (iter.hasNext()) {
	        		int next = iter.next();
	        		count++;
	        		iter.set(next -= min);
	        		if (next <= 0){
	        			iter.remove();
	        		}


	        	}
	        	System.out.println(count);
			}
        
    }
}
