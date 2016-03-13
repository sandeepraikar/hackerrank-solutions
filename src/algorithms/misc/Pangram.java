package algorithms.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pangram {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		String process = reader.nextLine().toLowerCase();
		reader.close();
		process.toLowerCase();
		process = process.replaceAll("\\s+", "");
		System.out.println(process);
		HashMap<String, Integer> mapper = new HashMap<String, Integer>();
		for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			mapper.put(String.valueOf(alphabet), 0);
		}
		int currentValue = 0;
		for (char c : process.toCharArray()) {
			currentValue = mapper.get(String.valueOf(c));
			currentValue++;
			mapper.put(String.valueOf(c), currentValue);

		}
		// View your map contents
		// for (Map.Entry<String, Integer> entry : mapper.entrySet()) {
		// System.out.println(entry.getKey()+" : "+entry.getValue());
		// }
		boolean result = true;
		for (Map.Entry<String, Integer> entry : mapper.entrySet()) {
			if (entry.getValue() == 0) {
				result = false;
			}
		}
		System.out.println(result == true ? "pangram" : "not pangram");
	}
}
