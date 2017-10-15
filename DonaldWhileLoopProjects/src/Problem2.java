import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
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
		while (counter > 0) {
			finalPopulation *= rate;
			counter--;
		}
		System.out.println("The final population is predicted to be: " + finalPopulation);
		in.close();

	}

}
