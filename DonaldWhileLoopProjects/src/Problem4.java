import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int secretInt = getRandInt(0 , 20);
		System.out.println("Please guess a secret integer from 0 to 20 until you get it right");
		int userInt = in.nextInt();
		while (userInt != secretInt) {
			if (userInt > secretInt) {
				System.out.println("Your guess was too high, please guess again");
				userInt = in.nextInt();	
			} 
			else { 
				System.out.println("Your guess was too low, please guess again");
				userInt = in.nextInt();
			}
		}
		System.out.println("Your guess was correct!");
		
		
		
	}
	
	//generate and return a random number between min and mix
	public static int getRandInt(int min, int max)
	{
	return (int)(Math.random() * ((max - min) + 1)) + min;
	}

}
