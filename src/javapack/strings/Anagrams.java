package javapack.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

   static boolean isAnagram(String A, String B) {
      //Complete the function
       if(A.length()!=B.length()){
           return false;
       }
       char[] a_arr = A.toLowerCase().toCharArray();
       char[] b_arr = B.toLowerCase().toCharArray();
       Arrays.sort(a_arr);
       Arrays.sort(b_arr);
       return Arrays.equals(a_arr,b_arr);
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
