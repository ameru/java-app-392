import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		public void boardState () 
		{
			//print the board
			for(int row = 0; row <= 2; row++) {
				System.out.println(" | | ");
				System.out.println(" " + board[row][0] + " | " + 
						board[row][1] + " | " + board[row][2]);
				System.out.println(" | | "); if(row != 2)
				System.out.println("---|---|---");
	}
	
		}
		public boolean winner
		{
			//check for winner
            //check rows
            for(int row = 0; row <= 2; row++) {
            	if(board[row][0] == board[row][1] && 
            			board[row][0] == board[row][2])
            		{
            		winner = true;
            		winnerChar = board[row][0];
            		}
            }
            //check col
            for(int col = 0; col <= 2; col++)

            {
            	if(board[0][col] == board[1][col] &&
            			board[0][col] == board[2][col])
                  {
            		winner = true;
            		winnerChar = board[0][col];
                  }
            }
            //check diagonal
            if(board[0][0] == board[1][1] && board[0][0] == 
            		board [2][2])
            {
            	winner = true;
            	winnerChar = board[0][0];
            }
            else if(board[0][2] == board[1][1] && board[0][2] ==
            		board[2][0])
            {
            	winner = true;
            	winnerChar = board[0][2];
            }
            //check for tie
            if(winner == false && turn == 9) {
            	tie = true; 
            }
            turn++;

		}while(tie == false && winner == false);
		if (winner)
			System.out.println("Congratulations player " +
					winnerChar);
		else if(tie)
			System.out.println("Sorry, you two are evenly matched.");
	}
			
				static boolean tie = false;
				boolean winner = false;
				static int turn = 1;
				char currentPlayer = ' ';
				static char[][] board = new char[3][3];
				Scanner keyboard = new Scanner(System.in); 
				int spot;
				static char winnerChar = ' ';
			           
				//initialize the board to numbers 1 - 9
				int val = (int) '1'; {
				for(int row = 0; row < 3; row++) 
					for(int col = 0; col < 3; col++) {
						board[row][col]=(char) val; 
						val++;
					}
				
				//perform each turn
				do
				{
					//figure out who's turn it is
					if(turn % 2 == 0) 
						currentPlayer = 'O';
					else
						currentPlayer = 'X';
					
			        //have user elect a spot
					do
					{
						System.out.print("Pick an empty spot 1-9: "); 
						spot = keyboard.nextInt();
					}while(board[(spot-1)/3][(spot-1)%3] == 'X' || 
							board[(spot-1)/3][(spot-1)%3] == 'O' || spot < 1 || spot > 9);
			                board[(spot-1)/3][(spot-1)%3] = currentPlayer;
		
			}
		}
}
					
	


