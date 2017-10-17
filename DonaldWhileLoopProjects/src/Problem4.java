/*  Ryan Donald           While Loop Projects Problem4          Section 01
    This program allows the user to guess a random number from 0 to 20, and to continue guessing with feedback*/
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		//declared variables and user inputted variables
		Scanner in = new Scanner(System.in);
		int secretInt = getRandInt(0 , 20);
		System.out.println("Please guess a secret integer from 0 to 20 until you get it right");
		int userInt = in.nextInt();
		//while the user number is not equal to the secret number
		while (userInt != secretInt) {
			// if it is greater than, it provides the user with the proper feedback
			if (userInt > secretInt) {
				System.out.println("Your guess was too high, please guess again");
				userInt = in.nextInt();	
			} 
			// it is less than, and provides the user with the proper feedback
			else { 
				System.out.println("Your guess was too low, please guess again");
				userInt = in.nextInt();
			}
		}
		// tells the user that their guess was correct
		System.out.println("Your guess was correct!");
		
		in.close();
		
	}
	
	//generate and return a random number between min and mix
	public static int getRandInt(int min, int max)
	{
	return (int)(Math.random() * ((max - min) + 1)) + min;
	}

}
