
package Demystifying;
import java.util.Scanner;

public class Demystifying {

	public static void main(String[] args) {
		// TODO code application logic here
		String myVariable1 = "I'm slowly figuring this out.";
		int myVariable2 = 14;
		System.out.println(myVariable1);
		System.out.print("Enter a number: ");
		Scanner myObject1 = new Scanner(System.in);
		int myVariable3 = myObject1.nextInt();
		System.out.println("Much sooner than a sideways " + (myVariable2 - 6)
				+ " it will be easy as " + myVariable3);
		myObject1.close();
	}

}
