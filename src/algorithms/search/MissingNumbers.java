package algorithms.search;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MissingNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	/*testing
    	int[] arr1 = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
		int[] arr2 = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206,204};
		
    	*/
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        Map<Integer,Integer> map1 = new TreeMap<>();
        Map<Integer,Integer> map2 = new TreeMap<>();
        for(int i=0;i<n;i++){
            int temp = read.nextInt();
            Integer count = map1.get(temp);
            if(count==null){
                count=Integer.valueOf(1);
            }else{
                count++;
            }
            map1.put(temp,count);
        }
        int m = read.nextInt();
        for(int j=0;j<m;j++){
            int temp = read.nextInt();
            Integer count = map2.get(temp);
            if(count==null){
                count=Integer.valueOf(1);
            }else{
                count++;
            }
            map2.put(temp,count);
        }
        read.close();
        Set<Map.Entry<Integer,Integer>> entrySetMap1 = map1.entrySet();
        Set<Map.Entry<Integer,Integer>> entrySetMap2 = map2.entrySet();
        entrySetMap1.removeAll(entrySetMap2);
        for (Map.Entry<Integer, Integer> entry : entrySetMap1) {
			System.out.print(entry.getKey()+" ");
		}
    }
}
