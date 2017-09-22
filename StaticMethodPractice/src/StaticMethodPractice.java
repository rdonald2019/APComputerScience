//added to git
public class StaticMethodPractice {

	public static void main(String[] args) {
		myBox(); //Prints Top Box
		myBox(); //Prints Bottom Box
	}

	public static void myBox() {
		//Prints out 1 box
		solidLine();
		brokenLine();
		brokenLine();
		brokenLine();
		solidLine();
	}
	
	public static void solidLine() {
		//Prints top and bottom line of each box
		System.out.println("***********");
	}
	
	public static void brokenLine() {
		//Prints the sides of the boxes
		System.out.println("*         *");
	}
}
