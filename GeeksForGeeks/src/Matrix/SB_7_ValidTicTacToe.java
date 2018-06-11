package Matrix;

public class SB_7_ValidTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] board = {'O', 'X', 'X', 
                'O', 'X', 'X',
                'O', 'O', 'X'};
		
		boolean diff=count(board);
		if(diff==false){
			System.out.println("Invalid  Moves");
			return;
		}
		else{
			boolean x=isXwinning(board);
			boolean o=isOwinning(board);
			
			if(x==true && o==true){
				System.out.println("Invalid as Both Winning");
				return;
			}
			System.out.println("Valid");
		}

	}

	public static boolean count(char[] board) {
		int x = 0;
		int o = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 'X')
				
				x++;
			else
				o++;
		}
		if (Math.abs(x - o) > 1)
			return false;

		return true;
	}

	public static boolean isXwinning(char board[]) {

		for (int i = 0; i < board.length; i++) {
			if (board[i] == 'X') {
				if (i == 0) {
					if (board[4] == 'X' && board[8] == 'X')
						return true;
					if (board[1] == 'X' && board[2] == 'X')
						return true;

				}
				if (i == 0 || i == 1 || i == 2) {
					if (board[i + 3] == 'X' && board[i + 6] == 'X')
						return true;
				}
				if(i%3==0){
					if(board[i+1]=='X'&& board[i+2]=='X')
						return true;
				}
				if(i==2){
					if(board[4]=='X'&&board[6]=='X')
						return true;
				}

			}
		}
		return false;

	}

	public static boolean isOwinning(char board[]) {
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 'O') {
				if (i == 0) {
					if (board[4] == 'O' && board[8] == 'O')
						return true;
					if (board[1] == 'O' && board[2] == 'O')
						return true;

				}
				if (i == 0 || i == 1 || i == 2) {
					if (board[i + 3] == 'O' && board[i + 6] == 'O')
						return true;
				}
				if(i%3==0){
					if(board[i+1]=='O'&& board[i+2]=='O')
						return true;
				}
				if(i==2){
					if(board[4]=='O'&&board[6]=='O')
						return true;
				}

			}
		}
		return false;



	}

}
