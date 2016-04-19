package algorithms.misc;
/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)
and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars 
before small bars. Return -1 if it can't be done.

make_chocolate(4, 1, 9) → 4
make_chocolate(4, 1, 10) → -1
make_chocolate(4, 1, 7) → 2
*/

public class MakeChocolateProblem {

	public static void main(String[] args) {
		//Sample test 
		int res =makeChocolate(4,1,9);
		System.out.println(res);
	}

	private static int makeChocolate(int small, int big, int goal) {
		if(big*5+small<goal){
			return -1;			
		}else if(goal%5>small){
			return -1;
		}else{
			if(goal/5>big){
				return goal - (big*5);
			}else{
				return goal%5;
			}
		}
	}

}
