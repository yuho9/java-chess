
public class PlayChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputView Input = new InputView();
		
		Input.startMessage();
		boolean start = Input.start();
		
		ChessBoard cb = new ChessBoard();
		ResultView Result = new ResultView();
		
		while(start) {
			Result.printChessBoard(cb);
			start = Input.start();
		}

	}

}
