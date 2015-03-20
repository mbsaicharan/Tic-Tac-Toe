package Tictactoe;

public class game
{

	public void print(char[][] tictactoe)
	{
		
		System.out.println("\tColumn1\tColumn2\tColumn3");
		System.out.println("Row1\t"+tictactoe[0][0]+"\t"+tictactoe[0][1]+"\t"+tictactoe[0][2]+"\t\n\nRow2\t"+tictactoe[1][0]+"\t"+tictactoe[1][1]+"\t"+tictactoe[1][2]+"\t\n\nRow3\t"+tictactoe[2][0]+"\t"+tictactoe[2][1]+"\t"+tictactoe[2][2]+"\t\n\n\n");

	}
	
	public boolean checkWin(char[][] tictactoe)

	{
		if(tictactoe[0][0] == tictactoe[0][1] &&tictactoe[0][1]== tictactoe[0][2] && tictactoe[0][0] == 'X')		//X WIN
		{
			return true;
		}
		else if(tictactoe[1][0] == tictactoe[1][1] &&tictactoe[1][1]== tictactoe[1][2] && tictactoe[1][0] == 'X')
		{
			return true;
		}
		else if(tictactoe[2][0] == tictactoe[2][1] &&tictactoe[2][1]== tictactoe[2][2] && tictactoe[2][0] == 'X')
		{
			return true;
		}
		else if(tictactoe[0][0] == tictactoe[1][0] &&tictactoe[1][0]== tictactoe[2][0] && tictactoe[0][0] == 'X')
		{
			return true;
		}
		else if(tictactoe[0][1] == tictactoe[1][1] &&tictactoe[1][1]== tictactoe[2][1] && tictactoe[0][1] == 'X')
		{
			return true;
		}
		else if(tictactoe[0][2] == tictactoe[1][2] &&tictactoe[1][2]== tictactoe[2][2] && tictactoe[0][2] == 'X')
		{
			return true;
		}
		else if(tictactoe[0][0] == tictactoe[1][1] &&tictactoe[1][1]== tictactoe[2][2] && tictactoe[0][0] == 'X')
		{
			return true;
		}
		else if(tictactoe[2][0] == tictactoe[1][1] &&tictactoe[1][1]== tictactoe[0][2] && tictactoe[2][0] == 'X')
		{
			return true;
		}
		else if(tictactoe[0][0] == tictactoe[0][1] &&tictactoe[0][1]== tictactoe[0][2] && tictactoe[0][0] == 'O')	//O WIN
		{
			return true;
		}
		else if(tictactoe[1][0] == tictactoe[1][1] &&tictactoe[1][1]== tictactoe[1][2] && tictactoe[1][0] == 'O')
		{
			return true;
		}
		else if(tictactoe[2][0] == tictactoe[2][1] &&tictactoe[2][1]== tictactoe[2][2] && tictactoe[2][0] == 'O')
		{
			return true;
		}
		else if(tictactoe[0][0] == tictactoe[1][0] &&tictactoe[1][0]== tictactoe[2][0] && tictactoe[0][0] == 'O')
		{
			return true;
		}
		else if(tictactoe[0][1] == tictactoe[1][1] &&tictactoe[1][1]== tictactoe[2][1] && tictactoe[0][1] == 'O')
		{
			return true;
		}
		else if(tictactoe[0][2] == tictactoe[1][2] &&tictactoe[1][2]== tictactoe[2][2] && tictactoe[0][2] == 'O')
		{
			return true;
		}
		else if(tictactoe[0][0] == tictactoe[1][1] &&tictactoe[1][1]== tictactoe[2][2] && tictactoe[0][0] == 'O')
		{
			return true;
		}
		else if(tictactoe[2][0] == tictactoe[1][1] &&tictactoe[1][1]== tictactoe[0][2] && tictactoe[2][0] == 'O')
		{
			return true;
		}
		else
			return false;
	}
	
}