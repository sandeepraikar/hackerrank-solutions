package algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GemStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Set<Character>> mapper = new HashMap<>();
        
        for(int i=0;i<n;i++){            
            String rockName = in.next();
            Set<Character> temp = new HashSet<Character>();
            for(char x: rockName.toCharArray()){
                temp.add(x);
            }
            mapper.put(i+1,temp);
        }
        in.close();
        Set<Character> first = mapper.get(1);
        for(Set<Character> obj: mapper.values()){
            first.retainAll(obj);
        }
        System.out.println(first.size());
        
    }
}