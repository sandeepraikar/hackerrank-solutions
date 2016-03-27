package javapack.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArrayEasy {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] inpArray = new int[n];
        for(int i=0;i<n;i++){
            inpArray[i]=read.nextInt();
        }
        read.close();
        int count=0,sum;
        for(int j=0;j<n;j++){
            
            for(int k=j+1;k<=n;k++){
                sum=0;
                int[] newArr = Arrays.copyOfRange(inpArray,j,k);
                for(int z=0;z<newArr.length;z++){
                    sum+=newArr[z];
                }
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}