package algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares_v2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int count=0;
            count=(int)((Math.floor(Math.sqrt(b))) - (Math.ceil(Math.sqrt(a)))+1);                
            System.out.println(count);
        }
    }
}