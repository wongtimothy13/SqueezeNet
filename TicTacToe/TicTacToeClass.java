public class TicTacToeClass
{
	// Instance Variables
	private char[][] board;
	private int turns;

	// Constructors
	public TicTacToeClass()
	{
		board = new char[3][3];
		turns = 0;

		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}

	// Accessor Methods

	public boolean isWinner( char p )
	{
		if ( ((board[0][0]==p) && (board[1][0]==p) && (board[2][0]==p)) ||  // The horixzontal cases
				((board[0][1]==p) && (board[1][1]==p) && (board[2][1]==p)) ||
				((board[0][2]==p) && (board[1][2]==p) && (board[2][2]==p)) ||
				
				((board[0][0]==p) && (board[0][1]==p) && (board[0][2]==p)) || // The vertical cases
				((board[1][0]==p) && (board[1][1]==p) && (board[1][2]==p)) ||
				((board[2][0]==p) && (board[2][1]==p) && (board[2][2]==p)) ||

				((board[0][0]==p) && (board[1][1]==p) && (board[2][2]==p)) || // The diagonal cases
				((board[2][0]==p) && (board[1][1]==p) && (board[0][2]==p)) 
				) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull()
	{
		int tmp = 0;
		for ( int r=0; r<3; r++ ) {
			for ( int c=0; c<3; c++ ) {
				if (board[r][c] != ' '){
					tmp++;
				}
			}
		}
		if (tmp >= 9){
			return true;
		} else {
			return false;
		}
	}

	public boolean isCat()
	{
		for ( int r=0; r<3; r++ ) {
			for ( int c=0; c<3; c++ ) {
				if (board[r][c] == ' '){
					return false;
				}
			}
		}
		boolean tmp1 = isWinner('O');
		boolean tmp2 = isWinner('X');
		if ((tmp1 == false) && (tmp2 == false)){
			return true;
		} else {
			return false;	
		}
	}

	public boolean isValid( int r, int c )
	{
		if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
			return true;
		else
			return false;
	}

	public int numTurns()
	{
		return turns;
	}

	public char playerAt( int r, int c )
	{
		if ( isValid(r,c) )
			return board[r][c];
		else
			return '@';
	}

	public void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	// Modifiers
	public void playMove( char p, int r, int c )
	{
		board[r][c] = p;
		setturns();
	}

	public void setturns()
	{
		turns++;
	}

}