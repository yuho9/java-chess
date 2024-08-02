
public class ChessBoard {
	
	private String[][] chessBoard = new String[8][8];
	
	public void ChessBoard() {
		setBlack();
		for(int i=0;i<4;i++) {
			setBlank(i);
		}
		setWhite();
	}
	
	public void setBlack() {
		chessBoard[0] = new String[] {"R", "N", "B", "Q", "K", "B", "N", "R"};
		chessBoard[1] = new String[] {"P", "P", "P", "P", "P", "P", "P", "P"};
	}
	
	public void setBlank(int idx) {
		for(int i=0;i<8;i++) {
			chessBoard[idx][i] = ".";
		}
	}
	
	public void setWhite() {
		chessBoard[6] = new String[] {"p", "p", "p", "p", "p", "p", "p", "p"};
		chessBoard[7] = new String[] {"r", ",n", "b", "q", "k", "b", "n", "r"};
	}
	

}
