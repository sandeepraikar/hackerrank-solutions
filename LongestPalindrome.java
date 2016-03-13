package test;

public class LongestPalindrome {

	public static void main(String args[]){
		String test = "aaaabbaa";
		String longestPalindromeString =null;
		int maxPalindromeLength=0;
		
		for (int i = 0; i < test.length(); i++) {
			for (int j = i + 1; j < test.length(); j++) {
				int len = j - i;
				String curr = test.substring(i, j + 1);
				if (isPalindrome(curr)) {
					if (len > maxPalindromeLength) {
						longestPalindromeString = curr;
						maxPalindromeLength = len;
					}
				}
			}
		}
		System.out.println(longestPalindromeString);
		System.out.println(maxPalindromeLength);
	}
	
	public static boolean isPalindrome(String val){
		for(int i=0;i<val.length()-1;i++){
			if(val.charAt(i)!=val.charAt(val.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	
}
