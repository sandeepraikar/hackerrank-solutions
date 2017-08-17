package algorithms.misc;

public class FirstNonRepeatingCharcter {

	public static void main(String[] args) {
		String test ="ABBCDDA";
		int index = firstNonRepeatedCharacter(test);
		System.out.println(index);
		//System.out.println(test.charAt(index));
	}

	private static int firstNonRepeatedCharacter(String test) {
		
		if(test==null || test.isEmpty()){
			return -1;
		}
		int[] charIndex = new int[256];
		
		//initialize the charIndex array to -1;
		for(int i=0;i<256;i++){
			charIndex[i]=-1;
		}
		for(int i=0;i<test.length();i++){
			if(charIndex[test.charAt(i)]==-1){
				charIndex[test.charAt(i)]=i;
			}else{
				charIndex[test.charAt(i)]=-2;
			}
		}
		
		//iterate over the char index array to find the first non repeating character
		int minIndex = test.length();
		for(int i=0;i<256;i++){
			int val = charIndex[i];
			if(val>=0 && val<minIndex){
				minIndex= val;
			}
		}
		return minIndex;
	}

}
