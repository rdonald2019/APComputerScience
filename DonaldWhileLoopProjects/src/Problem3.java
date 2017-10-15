import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a positive power of 2: ");
		int power = in.nextInt();
		int answer = 1;
		if (power >= 0) {
			while (power > 0) {
				answer *= 2;
				power--;
			}
		System.out.println(answer);
		}
		in.close();
	}

}
