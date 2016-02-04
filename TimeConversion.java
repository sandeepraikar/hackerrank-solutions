import java.util.Scanner;

public class TimeConversion{

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		String time = reader.nextLine();
		reader.close();
		// String time = "12:05:45AM";s
		String temp = null;

		int hours = 0;
		temp = time.substring(time.length() - 2);
		time = time.substring(0, time.length() - 2);
		String arr[] = time.split(":");
		if (temp.equals("PM")) {
			hours = Integer.parseInt(arr[0]);
			if (hours < 12) {
				hours = hours + 12;
				arr[0] = Integer.toString(hours);
			}

		} else if (temp.equals("AM")) {
			hours = Integer.parseInt(arr[0]);
			if (hours == 12) {
				arr[0] = "00";
			}
		}

		System.out.println(arr[0] + ":" + arr[1] + ":" + arr[2]);
	}

}
