package algortihms.bitmanipulation;

import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int r = in.nextInt();
		in.close();
		int max=0;
		int min=0;

		for(int i=l;i<=r;i++){
			for(int j=l;j<=r;j++){
				min=i^j;
				if(min>max){
					max=min;
				}
			}
		}
		System.out.println(max);		

	}

}
