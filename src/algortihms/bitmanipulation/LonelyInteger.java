package algortihms.bitmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		Map<String, Integer> mapper= new HashMap<String, Integer>();
		if(N%2==1){
			int val=1;
			
			for(int i=0;i<N;i++){
				String item = in.next();
				if(mapper.containsKey(item)){
					val = mapper.get(item);
					val++;
					mapper.put(item, val);
				}else{
					mapper.put(item, 1);
				}
			}
			
			for(Map.Entry<String,Integer> entry : mapper.entrySet()){				
				if(entry.getValue()==1){
					System.out.println(entry.getKey());
				}
			}
		}
		in.close();
		
	}

}
