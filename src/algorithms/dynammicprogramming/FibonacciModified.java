package algorithms.dynammicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        int n = in.nextInt();
        in.close();
        BigInteger[] val = new BigInteger[n];
        val[0]=a;
        val[1]=b;
        for(int i=2;i<n;i++){
            val[i]= (val[i-1].pow(2)).add(val[i-2]);
        }
        System.out.println(val[n-1]);
    }
}