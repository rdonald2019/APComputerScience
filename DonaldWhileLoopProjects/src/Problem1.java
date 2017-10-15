
public class Problem1 {

	public static void main(String[] args) {
		int sum = 0;
		int counter = 1;
		while (sum < 1000000) {
			sum += counter;
			counter++;
		}
		System.out.println(counter);
	}

}
