/*  Ryan Donald           While Loop Projects Problem5          Section 01
    This program continues to roll two dice until their sum is equivalent to what the user input*/
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		//declared and user input variables
		Scanner in = new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		int userNum = in.nextInt();
		diceSum(userNum);
		in.close();
	}
	//method to calculate two dice rolling, and the sum of the two dice
	public static void diceSum(int desiredSum) {
		//declared variables
		int rollOne = getRandInt(1,6);
		int rollTwo = getRandInt(1,6);
		// while the desired sum is not equal to the sum of the two dice rolls, it prints out what the two dice were and their sum, then re calculates the rolls
		while (desiredSum != rollOne + rollTwo) {
			System.out.println(rollOne + " and " + rollTwo + " = " + (rollOne + rollTwo));
			rollOne = getRandInt(1,6);
			rollTwo = getRandInt(1,6);
		}
		// prints out the roll that provides the correct sum
		System.out.println(rollOne + " and " + rollTwo + " = " + (rollOne + rollTwo));
	}
//generate and return a random number between min and mix
	public static int getRandInt(int min, int max)
	{
	return (int)(Math.random() * ((max - min) + 1)) + min;
	}
}
