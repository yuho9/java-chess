
public class ChessBoard {
	
	private String[][] chessBoard = new String[8][8];
	
	public ChessBoard() {
		setBlack();
		for(int i=2;i<6;i++) {
			setBlank(i);
		}
		setWhite();
	}
	
	
	//체스 보드 초기화
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
		chessBoard[7] = new String[] {"r", "n", "b", "q", "k", "b", "n", "r"};
	}
	
	//체스보드 출력
	public void printLine(int idx) {
		for(int i=0;i<8;i++) {
			System.out.print(chessBoard[idx][i]);
		}
		System.out.println();
	}
	public void printBoard() {
		for(int i=0;i<8;i++) {
			printLine(i);
		}
	}
	
	
}
