package algorithms.strings;

import java.util.Scanner;

public class LoveLetter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int t=0;t<n;t++){
            String input = in.next();
            char[] inputArray = input.toCharArray();
            int total =0;
            int len = input.length();
            for(int i = 0, j = len - 1; i < j; i++, j--) {
                total+=Math.abs(inputArray[j]-inputArray[i]);
            }
        System.out.println(total);
        }
        in.close();
    }
}