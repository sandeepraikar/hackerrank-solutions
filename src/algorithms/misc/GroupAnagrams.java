package algorithms.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagrams {


	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		ArrayList<String> sample = new ArrayList<>();
		for(int i =0;i<n;i++){
			sample.add(read.next());
		}
		read.close();
		Map<String, Integer> mapper = new HashMap<>();
		
		for (String word : sample) {
			char[] text = word.toCharArray();
			int total =0;
			for(int i=0;i<text.length;i++){
				total+=text[i]-'a';
			}
			mapper.put(word, total);
		}
		
		for (Map.Entry<String, Integer> entry  : mapper.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
		Map<Integer, ArrayList<String>> reverseMap = new HashMap<>();

		for (Map.Entry<String,Integer> entry : mapper.entrySet()) {
		    if (!reverseMap.containsKey(entry.getValue())) {
		        reverseMap.put(entry.getValue(), new ArrayList<String>());
		    }
		    ArrayList<String> keys = reverseMap.get(entry.getValue());
		    keys.add(entry.getKey());
		    reverseMap.put(entry.getValue(), keys);
		}
		
		for(ArrayList<String> keys: reverseMap.values()){
			for (String string : keys) {
				System.out.print(string+" ");
			}
			System.out.println();
		}
	}


}
