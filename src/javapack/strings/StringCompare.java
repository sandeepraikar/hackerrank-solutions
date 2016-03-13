package javapack.strings;


import java.util.Scanner;
import java.util.TreeSet;

public class StringCompare {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String target = reader.next();
		int limit = reader.nextInt();
		
		reader.close();

		TreeSet<String> subs = new TreeSet<>();
		for(int i=0;i<target.length();i++){
			if(limit+i<=target.length()){
				subs.add(target.substring(i,i+limit));
			}
		}
		System.out.println(subs.first());
		System.out.println(subs.last());
		
	}

}
