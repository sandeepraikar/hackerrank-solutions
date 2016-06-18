package thirtydaysofcode;

import java.util.Scanner;

public class Day26_NestedLogic_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int dayReturned = scan.nextInt();
        int monthReturned = scan.nextInt();
        int yearReturned = scan.nextInt();

        int dayExpected = scan.nextInt();
        int monthExpected = scan.nextInt();
        int yearExpected = scan.nextInt();
        scan.close();
        int monthDiff = (monthReturned>monthExpected)?(monthReturned-monthExpected):0;
        int dayDiff = (dayReturned>dayExpected)?(dayReturned-dayExpected):0;
        int yearDiff = (yearReturned<=yearExpected)?0:1;
        
        System.out.println( (yearDiff!=0)?10000:
                            ((monthDiff>0) && (yearReturned-yearExpected==0))?500*monthDiff:
                            ((dayDiff>0 && (yearReturned-yearExpected==0)))?15*dayDiff:0);
	}

}
