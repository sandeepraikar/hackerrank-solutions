package datastructures.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, AtomicInteger> mapper= new HashMap<String, AtomicInteger>();
        
        for(int i =0;i<n;i++){
            String item = in.next();
            AtomicInteger val = mapper.get(item);
            if(val==null){
                mapper.put(item, new AtomicInteger(1));
            }else{
                val.incrementAndGet();
            }
        }
        
        int q = in.nextInt();
        for(int j=0;j<q;j++){
            String query= in.next();
            if(mapper.containsKey(query)){
                System.out.println(mapper.get(query));
            }else{
                System.out.println(0);
            }
        }
        in.close();
    }
}