package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            String str1 = in.next();
            String str2 = in.next();
            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();
            for(char x : str1.toCharArray()){
                set1.add(x);
            }
            for(char y : str2.toCharArray()){
                set2.add(y);
            }
            set1.retainAll(set2);
            if(set1.size()>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}