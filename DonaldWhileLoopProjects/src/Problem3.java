/*  Ryan Donald           While Loop Projects Problem3          Section 01
    This program finds the value for 2 to the number entered by the user, and ends if the power is less than 0*/
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		//declares variables and asks the user for input
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a positive power of 2: ");
		int power = in.nextInt();
		int answer = 1;
		// if the user followed the directions and entered a positive integer, continue
		if (power >= 0) {
			// multiplies answer times 2, and uses the inputted number as a counter, then decrements the counter by 1
			while (power > 0) {
				answer *= 2;
				power--;
			}
			//prints the answer out
		System.out.println(answer);
		}
		in.close();
	}

}
