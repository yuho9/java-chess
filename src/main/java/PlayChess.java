
public class PlayChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputView Input = new InputView();
		
		Input.start();
		
		ChessBoard cb = new ChessBoard();
		ResultView Result = new ResultView();
		
		Result.printBoard(cb);

	}

}
