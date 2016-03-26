package algorithms.strings;

import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for(int i=0;i<n;i++){
            String item = read.next();
            int count=0;
            for(int z=0;z<item.length()-1;z++){
                if(item.charAt(z)==item.charAt(z+1)){
                    count++;
                }
            }
            System.out.println(count);
        }
        read.close();
    }
}