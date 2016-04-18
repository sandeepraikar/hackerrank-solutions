package algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int p = n/c;
            int totalChocs = p;
            while(p>=m){
                p=p-m;
                totalChocs++;
                p=p+1;
            }
            System.out.println(totalChocs);            
        }
        in.close();
    }
}
