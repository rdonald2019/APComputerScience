/*  Ryan Donald           While Loop Projects Problem1          Section 01
    This program calculates the first value for n in the series 1 + 2 + 3 ... + n that makes the series greater than 1 million*/
public class Problem1 {

	public static void main(String[] args) {
		//declared variables
		int sum = 0;
		int counter = 1;
		//while the sum is less than 1 million, add counter to sum, and increments the counter by 1
		while (sum < 1000000) {
			sum += counter;
			counter++;
		}
		// print the value of first counter that equals a number of over 1 million
		System.out.println(counter);
	}

}
