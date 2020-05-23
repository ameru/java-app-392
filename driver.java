import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		MagicEightBall myball = new MagicEightBall();
		String userQuestion = "";
		do
		{
			System.out.println("What is your question? Enter \"exit\" to stop.");
			Scanner keyboard = new Scanner(System.in);
			userQuestion = keyboard.nextLine();
			
			if (!userQuestion.equalsIgnoreCase("exit"))
			{
				System.out.println("The answer is " + myball.shake());
			}
		}while(!userQuestion.equalsIgnoreCase("exit"));	

	}

}
