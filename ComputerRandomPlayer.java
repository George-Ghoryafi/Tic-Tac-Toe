//Student 1 name: George Ghoryafi 
//Student 2 name:

/**
 * The class <b>ComputerRandomPlayer</b> is the class that controls the computer's plays.
 * 
 * 
 */
import java.util.*;



public class ComputerRandomPlayer implements Player {
	int selection = 3; 
	//generate random position at an empty cell!!
	//call game.play(position)
	public void validPlay(TicTacToeGame t, int a){
		
		if(t.getCellVal(a) == CellValue.EMPTY){
			selection = a;
		}else{
			int j = (int)(Math.random() * 9) + 1;
			validPlay(t, j);
		}
	}



	public void Play(TicTacToeGame t){
		while (t.getGameState() == GameState.PLAYING){
			System.out.println("CPU turn: ");
			int i = (int)(Math.random() * 9) + 1;
			validPlay(t, i);
			t.play(selection);
			System.out.println("CPU Played: " + selection);

			System.out.println(t);
			break;
			
		}
		if (t.getGameState() != GameState.PLAYING){
			System.out.println(t);
			System.out.println("The winner is: " + t.getGameState());
			System.out.println("The game has ended");
		}
	}


}