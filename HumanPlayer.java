import java.util.Scanner;

//Student 1 name: George Ghoryafi 
//Student 2 name:
/**
 * The class <b>HumanPlayer</b> is the class that controls the human's plays.
 * 
 * 
 */

public class HumanPlayer implements Player {
	//read a position to play from the console and call 
	// game.play(position): if the level was advanced after the call, then finish, otherwise repeat and get another position
	public void Play(TicTacToeGame t){
		
		Scanner user = new Scanner(System.in);
		while (t.getGameState() == GameState.PLAYING){
        	System.out.println("Human Turn: ");
			System.out.println(t);

        	System.out.println("Input a position between 1 and 9: ");
        	int input = user.nextInt();
        	System.out.println("Human to play: " + input);
            
            t.play(input);
			break;
		}

		if (t.getGameState() != GameState.PLAYING){
			System.out.println(t);
			System.out.println("The winner is: " + t.getGameState());
			System.out.println("The game has ended");
		}
	
	}




}