package algorithms.strings;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int count;
        for(int i =0;i<n; i++){
            count=0;
            String curr = read.next();
            if(curr.length()%2!=0){
                System.out.println(-1);
                continue;
            }else{
                char[] s1= curr.substring(0, (curr.length()/2)).toCharArray();
                char[] s2= curr.substring(curr.length()/2, curr.length()).toCharArray();
                int[] letters = new int[26];
                for(int j=0;j<s1.length;j++){
                    int temp = s1[j]-'a';
                    letters[temp]++;
                }
                for(int k=0;k<s2.length;k++){
                    int temp = s2[k]-'a';
                    letters[temp]--;
                }
                
                for(int z=0;z<letters.length;z++){
                    if(letters[z]>0){
                        count+=Math.abs(letters[z]);
                    }
                }
                System.out.println(count);
            }
             
        }
        read.close();
    }
}