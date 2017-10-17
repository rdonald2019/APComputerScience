/*  Ryan Donald           While Loop Projects Problem2          Section 01
    This program calculates expected expected population growth given the original population, 
    the growth rate, the amount of hours required to get that much growth, and the total amount of hours*/
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// declares variables and asks the user for input
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the initial population: ");
		int initialPopulation = in.nextInt();
		System.out.println();
		System.out.print("Please input the rate of population increase: ");
		int rate = in.nextInt();
		System.out.println();
		System.out.print("Please input the number of hours required to acheive that rate: ");
		int hoursForRate = in.nextInt();
		System.out.println();
		System.out.print("Please input the total number of hours: ");
		int totalHours = in.nextInt();
		int finalPopulation = initialPopulation;
		int counter = totalHours / hoursForRate;
		//while the counter (how many times the population increases by the rate) is > 0 the final population equals itself times the rate, then decrements the counter
		while (counter > 0) {
			finalPopulation *= rate;
			counter--;
		}
		//prints the final population
		System.out.println("The final population is predicted to be: " + finalPopulation);
		in.close();

	}

}
