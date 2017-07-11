package ctci.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int m = in.nextInt();
	        int n = in.nextInt();
	        String magazine[] = new String[m];
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	            magazine[magazine_i] = in.next();
	        }
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next();
	        }
	        in.close();
	        System.out.println(validate(magazine, ransom)?"Yes":"No");
	    }
	    
	    public static boolean validate(String[] magazine, String[] ransomNote){
	        Map<String,Integer> magazineMap = new HashMap<>();
	        boolean isValid = true;
	        for(String word:magazine){
	            Integer i = magazineMap.get(word);
	            if(i==null){
	                magazineMap.put(word,1);
	            }else{
	                magazineMap.put(word,i+1);
	            }
	        }
	        for(String note : ransomNote){
	            Integer i = magazineMap.get(note);
	            if(i==null || i==0){
	                isValid = false;
	                break;
	            }else{
	                magazineMap.put(note, i-1);
	            }
	        }
	         
	       return isValid;
	        
	    }

}
