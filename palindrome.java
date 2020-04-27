import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a word with at least five characters: ");
		Scanner userWord = new Scanner(System.in);
		String baseOutput = userWord.nextLine();

		String firstFive = baseOutput.substring(0,5);
		String firstLetter = baseOutput.substring (0,1);
		String secondLetter = baseOutput.substring (1,2);
		String thirdLetter = baseOutput.substring (2,3);
		String fourthLetter = baseOutput.substring (3,4);
		String finalOutput = firstFive + fourthLetter + thirdLetter + secondLetter + firstLetter;
		
		
		System.out.println("The original word is: " + baseOutput);
		System.out.println("The length of the original word is: " + baseOutput.length());
		System.out.println("The new palindrome is: " + finalOutput);
		
		userWord.close();
	}

}
