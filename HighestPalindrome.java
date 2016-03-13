package test;


public class HighestPalindrome {

	public static void main(String[] args) {
		int start=100;
		int end=1000;
		int n=0,rev;
		for(int i =end;i>start;i--){
			if(isPrime(i)){
				n=i;
				rev=0;
				while(n>0){
					rev=rev*10+n%10;
					n=n/10;
				}
				if(i==rev){
					System.out.println(i);
					break;
				}
			}
		}
		
	}
	
	static boolean isPrime(int n){
		if(n%2==0)
			return false;
		
		for(int i=3;i<n;i+=2){
			if(n%i==0)
				return false;
		}
		return true;
	}

}
