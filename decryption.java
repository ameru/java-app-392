import java.util.Scanner;

public class decryption {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter (e)ncoder or (d)ecoder: ");
		String userType = userInput.nextLine();
		
		System.out.print("Enter key: ");
		Integer userKey = Integer.parseInt(userInput.nextLine());
		
		System.out.print("Enter phrase: ");
		String userPhrase = userInput.nextLine();
		
		
		// convert the ASCII value back to a character using type casting
		String finalPhrase = "";
		char convertLetter;
		char encodedLetter;
		switch (userType.charAt(0)) {
			case 'e':
				int e = 0;
				while (e < userPhrase.length()){
					convertLetter = userPhrase.charAt(e);
					encodedLetter = (char)((int)convertLetter - userKey);
					finalPhrase += encodedLetter;
					e += 1;
				}	
				break;
			case 'd':
				int d = 0;
				while (d < userPhrase.length()){
					convertLetter = userPhrase.charAt(d);
					encodedLetter = (char)((int)convertLetter + userKey);
					finalPhrase += encodedLetter;
					d += 1;
				}
				break;
			default:
				System.out.println("Please enter a valid user type.");
		}
		
		System.out.println("The final phrase is: " + finalPhrase);
		
		userInput.close();
	
	}

}
