import java.util.Scanner;

public class Funny {

	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for (int x = 0; x < t; x++) {
			String process = read.next();
			System.out.println(process);
			
			int diff = 0;
			int n,reverse=0;
			boolean result=false;
			int len =process.length();
			for(int j=1;j<=len-1;j++){
				n=len-j;
				diff = Math.abs((int)process.charAt(j)-(int)process.charAt(j-1));
				reverse = Math.abs((int)process.charAt(n-1) - (int)process.charAt(n)); 
				if(diff!=reverse){
					result =true;
					System.out.println("Not Funny");
					break;
				}				
			}
			if(result==false){
				System.out.println("Funny");				
			}
		}read.close();
	}

}
