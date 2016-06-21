package thirtydaysofcode;

import java.util.Scanner;


public class BitWise {

	public static void main(String args[]){
		/*int max=-1;
		int secondMax=-1;
		int k=5;
		for(int i=0;i<=5;i++){
			if(i>max &&i<=k ){
				secondMax=max;
				max=i;
			}
		}*/
		//System.out.println(max & secondMax);
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		scan.close();
		int a  = k - 1;
		System.out.println("a"+ a);
		System.out.println(~a);
		System.out.println(-(~a));
		
		int b = (~a) & -(~a);
		System.out.println(b);
		if ((a | b) > 5){
					System.out.println(a - 1);
		}else{
					System.out.println(a);
				}
	}
}
