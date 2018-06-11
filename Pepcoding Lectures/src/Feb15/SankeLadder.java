package Feb15;

public class SankeLadder {

	public static void main(String[] args) {
		int[] moves = { 6,1, 2, 2, 2, 2, 2, 2, 4, 2, 2, 2, 2, 2 };
		int[] board = new int[21];
		board[2] = 19;
		board[5] = 13;
		board[11] = 7;
		board[17] = 3;

		int count = 0;
		boolean start = false;

		for (int i = 0; i < moves.length; i++) {
			if (moves[i] == 1 || moves[i] == 6) {
				start = true;

				continue;
			}
			if (start == true) {
				if (board[count] != 0) {
					count = board[count];
					
				
				if ((count + moves[i]) < board.length) {
					count = count + moves[i];}

					 else {

						count = count+0;
					}
				} else {
					count = count + moves[i];
				}}

				if (count == board.length - 1) {

					System.out.println("win");
					return;

				}
			}

			// TODO Auto-generated method stub
		if(start==false){
			System.out.println(0);
		}
			
		else{
			
		
		System.out.println(count);
		}

	}
	}
		
	
