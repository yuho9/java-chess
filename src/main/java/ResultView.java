
public class ResultView {

	//체스보드 출력
	public void printLine(int idx, ChessBoard cb) {
		for(int i=0;i<8;i++) {
			System.out.print(cb.getChessBoard()[idx][i]);
		}
		System.out.println();
	}
	public void printBoard(ChessBoard cb) {
		for(int i=0;i<8;i++) {
			printLine(i, cb);
		}
	}
}
