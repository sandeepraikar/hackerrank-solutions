package thirtydaysofcode;

import java.util.Calendar;

public class Day26_NestedLogic {

	public static void main(String[] args) {
		String actual = "9 6 2015";
		String expected = "6 6 2015";
		String[] actualArray = actual.split(" ");
		String[] expectedArray = expected.split(" ");
		Calendar actualDate = Calendar.getInstance();
		actualDate.set(Integer.parseInt(actualArray[2]),
				Integer.parseInt(actualArray[1]),
				Integer.parseInt(actualArray[0]));

		Calendar expectedDate = Calendar.getInstance();
		expectedDate.set(Integer.parseInt(expectedArray[2]),
				Integer.parseInt(expectedArray[1]),
				Integer.parseInt(expectedArray[0]));

		if (actualDate.get(Calendar.YEAR) <= expectedDate.get(Calendar.YEAR)) {
			if (actualDate.get(Calendar.MONTH) <= expectedDate
					.get(Calendar.MONTH)) {
				if (actualDate.get(Calendar.DAY_OF_MONTH) > expectedDate
						.get(Calendar.DAY_OF_MONTH)) {
					System.out.println(15 * (actualDate
							.get(Calendar.DAY_OF_MONTH) - expectedDate
							.get(Calendar.DAY_OF_MONTH)));
				}
			} else {
				System.out
						.println(500 * (actualDate.get(Calendar.MONTH) - expectedDate
								.get(Calendar.MONTH)));
			}
		} else {
			System.out.println(10000);
		}

	}

}
