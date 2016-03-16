package algortihms.bitmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class LonelyInteger_v2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		Map<String, AtomicInteger> mapper= new HashMap<String, AtomicInteger>();
		if(N%2==1){			
			for(int i=0;i<N;i++){
				String item = in.next();
				AtomicInteger val = mapper.get(item);
				if(val==null){
					mapper.put(item, new AtomicInteger(1));
				}else{
					val.incrementAndGet();
				}
			}
			for(String key : mapper.keySet()){	
				
				if(mapper.get(key).toString().equals("1") ){
					System.out.println(key);
				}
			}
			
			
		}
		in.close();
		
	}

}
