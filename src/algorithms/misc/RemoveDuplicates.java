package algorithms.misc;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String args[]){
		int[] inputArray = {4,6,7,7,7,8,9,9,1,2,2,3};
		Set<Integer> temp =new LinkedHashSet<>();
		for(int x : inputArray){
			temp.add(x);
		}
		Integer[] result =temp.toArray(new Integer[temp.size()]);
		for (Integer integer : result) {
			System.out.print(integer+", ");
		}
		System.out.println();
		
		//without using collection api
		int i=1;
		int j=0;
		if(inputArray.length<2){
			System.out.println("No duplicates");
		}
		while(i<inputArray.length){
			if(inputArray[i]==inputArray[j]){
				i++;
			}else{
				inputArray[++j]=inputArray[i++];
			}
		}
		
		int[] output = new int[j+1];
		for(int k=0;k<output.length;k++){
			output[k]=inputArray[k];
		}
		for (int k : output) {
			System.out.print(k+",");
		}
	}
}
