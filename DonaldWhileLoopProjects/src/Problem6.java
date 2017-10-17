/*  Ryan Donald           While Loop Projects Problem6          Section 01
    This program outputs each number in the collatz sequence starting with a user inputted number*/
import java.util.Scanner;
public class Problem6 {
	public static void main(String[] args) {
		// declared and user input variables
		Scanner in = new Scanner(System.in);
		System.out.print("Starting number: ");
		int userNum = Math.abs(in.nextInt());
		in.close();
		// while the user input number isnt equal to one, continue
		while (userNum != 1) {
			// prints the current number with a tab
			System.out.print(userNum+"\t");
			// if it is even, divide it by two
			if (userNum % 2 == 0) {
				userNum /= 2;
			}
			// if it is odd, multiply by 3 and add 1
			else {
				userNum = userNum * 3 + 1;
			}
			
		}
		// print out the number when it is equal to one
		System.out.print(userNum);
	}

}
