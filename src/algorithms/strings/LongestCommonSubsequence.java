package algorithms.strings;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		 String str1 = "ABCDGHLQR";
	     String str2 = "AEDPHR";
	     int result = longestCommonSubsequence(str1,str2);
	     System.out.println(result);
	}

	private static int longestCommonSubsequence(String str1, String str2) {
		int[][] matrix = new int[str1.length()+1][str2.length()+1];
		int max = 0;
		for(int i=1;i<matrix.length;i++){
			for(int j=1;j<matrix[i].length;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					matrix[i][j]= matrix[i-1][j-1]+1;
				}else{
					matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
				
				if(matrix[i][j]>max){
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

}
