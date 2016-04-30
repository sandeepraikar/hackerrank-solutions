package algorithms.search;

import java.util.Scanner;

public class IceCreamParlor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0;i<t;i++){
            int m = read.nextInt();
            int flavors = read.nextInt();
            int[] cost = new int[flavors];
            for(int j=0;j<flavors;j++){
                cost[j]=read.nextInt();
            }
            
            int temp=m;
            for (int k = 0; k < flavors; k++) {
                for (int l = k; l < flavors; l++) {
                    if (k == l)
                        continue;
                    else {
                        if (cost[k] + cost[l] > temp)
                            continue;
                        else if (cost[k] + cost[l] == temp) {
                            System.out.print((k+1) + " " + (l+1));
                        }
                    }
                }

            }

            System.out.println();
        }
        read.close();
    }
}