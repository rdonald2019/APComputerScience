public class IfStatementPractice {

	public static void main(String[] args) {
		
		// used for max of two integers
		
		System.out.println(max(2,-4));
		
		// used for project 4-1 
		
		int num1 = 4;
		int num2 = 3;
		System.out.println(simpleDivisionPart1(num1, num2)+"r. " + simpleDivisionPart2(num1, num2));
		
		// used for project 4-2
		
		double side1 = 3;
		double side2 = 4;
		double side3 = 5;
		if (rightTriangleChecker(side1,side2,side3) == true) {
			System.out.println("The triangle is a right triangle");
		} else {
			System.out.println("The triangle is not a right triangle");
		}
		
		//used for project 4-3
		
	}
	
	public static int max(int num1, int num2){
		int max;
		if (num1 > num2) {
		max = num1;
		} else { 
		max = num2;
		}
		return max;
	}
	
	public static int simpleDivisionPart1(int num1, int num2) {
		int dividend = Math.max(num1, num2);
		int divisor = Math.min(num1, num2);
		int quotient = dividend / divisor;
		return(quotient);
		
	}
	
	public static int simpleDivisionPart2(int num1, int num2){
		int dividend = Math.max(num1, num2);
		int divisor = Math.min(num1, num2);
		int remainder = dividend % divisor;
		return(remainder);
	}
	
	public static boolean rightTriangleChecker(double side1, double side2, double side3){
		if (Math.sqrt((side1 * side1)+(side2 * side2)) == side3){
			return true;
		}
		return false;
	}
	
	public static double phoneCallCost(int length) {
		
	}
	
}
