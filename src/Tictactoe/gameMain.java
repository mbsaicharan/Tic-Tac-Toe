package Tictactoe;
import java.util.*;

public class gameMain
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		game game1 = new game();
		boolean winX = false, winO=false;
		char playOrNot;
		int column, row, counter = 1;
		
		char[][] tictac1 = new char[3][3];
		for(int i = 0; i<3; i++)
		{
			for(int k = 0; k<3;k++)
				tictac1[i][k]='-';
		}
		
		System.out.print("Would you like to play?(Y/N): ");
		playOrNot = input.next().charAt(0);
		if(playOrNot == 'n')
		{
			System.out.println("Okay :(....Goodbye!");
			System.exit(0);
		}
		
		while(counter<10)		//Game
		{
			counter++;
			System.out.println("");
			game1.print(tictac1);
			System.out.println("");
			System.out.print("Player X: Enter row and column \nseperated by a space(1-3): ");
			column = input.nextInt();
			row = input.nextInt();
			tictac1 [column-1][row-1] = 'X';
			winX = game1.checkWin(tictac1);
			if(winX == true)
			{
				game1.print(tictac1);
				break;
			}
			System.out.println("");
			game1.print(tictac1);
			System.out.println("");
			System.out.print("Player O: Enter row and column seperated by a space(1-3): ");
			column = input.nextInt();
			row = input.nextInt();
			tictac1 [column-1][row-1] = 'O';
			winO = game1.checkWin(tictac1);
			
			if(winO == true)
			{
				game1.print(tictac1);
				break;
			}
		}
		
		if(winX == true)
			System.out.println("Player X wins!!!!!!");
		else
			System.out.println("Player O Wins!!!!!!");
		
		
	}
}