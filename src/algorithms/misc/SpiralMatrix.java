package algorithms.misc;

public class SpiralMatrix {

	public static void main(String[] args) {
		int numbers[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int rows = numbers.length;
		int cols = numbers[0].length;
		int i=0;
		int r_l=0;
		int r_m=rows;
		int c_l=0;
		int c_m=cols;
		
		while(r_l<r_m && c_l<c_m){
			for(i=c_l;i<c_m;i++){
				System.out.print(numbers[r_l][i]+" ");
			}
			r_l++;
			for(i=r_l;i<r_m;i++){
				System.out.print(numbers[i][c_m-1]+" ");
			}
			c_m--;
			if(r_l<r_m){
				for(i=c_m-1;i>=r_l;--i){
					System.out.print(numbers[r_m-1][i]+" ");
				}
				r_m--;
			}
			
			if(c_l<c_m){
				for(i=r_m;i>=c_l+1;--i){
					System.out.print(numbers[i][c_l]+" ");
				}
				c_l++;
			}
		}
	}

}
