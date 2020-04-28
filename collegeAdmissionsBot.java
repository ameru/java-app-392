package ruHW2;

import java.util.Scanner;

public class collegeAdmissionsBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String userName = userInput.nextLine();
		
		System.out.println("Enter your Critical Reading SAT score: ");
		Integer readingSAT = userInput.nextInt();
		
		System.out.println("Enter your Mathematics SAT score: ");
		Integer mathSAT = userInput.nextInt();
		
		System.out.println("Enter your Writing SAT score: ");
		Integer writingSAT = userInput.nextInt();

		System.out.println("Enter your class rank: ");
		Integer classRank = userInput.nextInt();
		
		System.out.println("Enter your class size: ");
		Integer classSize = userInput.nextInt();
		
		
			if ((readingSAT > 800) || (mathSAT > 800) || (writingSAT > 800) 
				|| (readingSAT < 200) || (mathSAT < 200) || (writingSAT < 200)) {
				System.out.println("I'm sorry, " + userName + " you have been rejected due to your scores being invalid.");
			}
			else {
				
				if ((readingSAT == 800) || (mathSAT == 800) || (writingSAT == 800)) {
						System.out.println("Congrats," + userName + " you have been accepted due to your perfect test score.");
				}
				
				else if ((readingSAT < 300) || (mathSAT < 300) || (writingSAT < 300)) {
						System.out.println("I'm sorry, " + userName + " you have been rejected due to your atrocious test scores.");
					}
			
				else if (((((readingSAT + mathSAT + writingSAT)/3) > 650) && (classRank / classSize <= 0.25))) {
					System.out.println("Congrats, " + userName + " you have been accepted due to your high scores/ranking.");
				}
			
				else if (((readingSAT < 400) && (mathSAT < 400)) || ((readingSAT < 400) && (writingSAT < 400)) 
					|| ((mathSAT < 400) && (writingSAT < 400)) || (classRank / classSize > 0.25)) {
					System.out.println("I'm sorry, " + userName + " you have been rejected due to your low scores/ranking.");
				}
				
				else {
					System.out.println("Hello, " + userName + " you have been placed on the waitlist.");	
				}
				
			}
			
		userInput.close();
	}


}
