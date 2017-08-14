package algorithms.search;

import java.util.Scanner;

/**
 * Consider a matrix with  rows and  columns, where each cell contains either a  or a  and any cell containing a is called a filled cell. Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally; in other words, cell  is connected to cells , , , , , , , and , provided that the location exists in the matrix for that .

If one or more filled cells are also connected, they form a region. Note that each cell in a region is connected to zero or more cells in the region but is not necessarily directly connected to all the other cells in the region.

Task 
Given an  matrix, find and print the number of cells in the largest region in the matrix. Note that there may be more than one region in the matrix.

Input Format

The first line contains an integer, , denoting the number of rows in the matrix. 
The second line contains an integer, , denoting the number of columns in the matrix. 
Each line  of the  subsequent lines contains  space-separated integers describing the respective values filling each row in the matrix.

Constraints

Output Format

Print the number of cells in the largest region in the given matrix.

Sample Input

4
4
1 1 0 0
0 1 1 0
0 0 1 0
1 0 0 0
Sample Output

5
Explanation

The diagram below depicts two regions of the matrix; for each region, the component cells forming the region are marked with an X:

X X 0 0     1 1 0 0
0 X X 0     0 1 1 0
0 0 X 0     0 0 1 0
1 0 0 0     X 0 0 0
The first region has five cells and the second region has one cell. Because we want to print the number of cells in the largest region of the matrix, we print .
 * @author Sandeep
 *
 */
public class ConnectedCellsInAGrid {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int row = in.nextInt();
	        int column = in.nextInt();
	        int[][] matrix = new int[row][column];
	        for(int i=0;i<row;i++){
	            for(int j=0;j<column;j++){
	                matrix[i][j]=in.nextInt();
	            }
	        }
	        int maxRegion =0;
	        //System.out.println(Arrays.deepToString(matrix));
	        for(int i=0;i<matrix.length;i++){
	            for(int j=0;j<matrix[i].length;j++){
	                if(matrix[i][j]==1){
	                    int size = getMaxRegion(matrix,i,j);
	                    maxRegion= Math.max(size, maxRegion); 
	                }   
	            }
	        }
	        System.out.println(maxRegion);
	    }

	    public static int getMaxRegion(int[][] matrix, int row, int column){
	        //boundary check
	        if(row<0 || column<0 || row>= matrix.length || column>= matrix[row].length){
	            return 0;
	        }
	        if(matrix[row][column]==0){
	            return 0;
	        }
	        int size =1;
	        matrix[row][column]=0;
	        for(int r=row-1;r<=row+1;r++){
	            for(int c=column-1;c<=column+1;c++){
	               if ( r!=row || c!=column) {
	                    size+=getMaxRegion(matrix,r,c);
	                }
	            }
	        }
	        return size;
	    }
}
