package ruIC4;

import java.util.Scanner;

public class ServerFarms {

	public static void main(String[] args) {
		final int MAXSERVERS = 10;
		boolean [] isServerRunning;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number of servers from 1 to " + MAXSERVERS + ": ");
		int numServers = Integer.parseInt(userInput.nextLine());
		isServerRunning = new boolean[numServers];
		// initialize the array
		for(int i = 0; i < isServerRunning.length; i++)
		{
			isServerRunning[i] = false;
		}

		if(numServers > MAXSERVERS || numServers < 1) // invalid
		{
			// number is invalid, end
			System.out.println("Incorrect number of servers, quitting.");
			System.exit(0);
		}
		else
		{
			// number is valid, continue
			// prompt for server to enter, and keep prompting until they put in a negative
			int serverIndex;
			do
			{
				System.out.println("Enter server index to turn on (-1 to quit): ");
				serverIndex = Integer.parseInt(userInput.nextLine());
				if (serverIndex >= numServers)
					System.out.println("Error: Index too large. ");
				else if (serverIndex != -1)
					isServerRunning[serverIndex] = true;
			} while(serverIndex > 0);
			
			// print the status
			// for each server in the array
			int count = 0;
			for(int i = 0; i < isServerRunning.length; i++)
			{
				if(isServerRunning[i] == true)
				{
					if (i == numServers - 1)
						System.out.println("o");
					else
						System.out.print("o ");
					count++;
				}
				else
				{
					if (i == numServers - 1)
						System.out.println("x");
					else
						System.out.print("x ");
				}
			}	
			
			System.out.println("Number of servers running: " + count);
			System.out.println("Average number of servers running: " + (float)count / numServers);

		if ((float)count / numServers <= 0.6) 
			{
			System.out.println("Farm quality grade is: C"); 
			}
		else if  (((float)count / numServers >= 0.6) && ((float)count / numServers <= 0.8))
			{
			System.out.println("Farm quality grade is: B");
			}
		else 
			{
			System.out.println("Farm quality grade is: A");
			}
					
			userInput.close();
		}
	}
	
}
		
