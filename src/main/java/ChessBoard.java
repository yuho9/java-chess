import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
	
	private final List<List<String>> chessBoard;
	
	public ChessBoard() {
		chessBoard = new ArrayList<>();
		setBlack();
		for(int i=2;i<6;i++) {
			setBlank(i);
		}
		setWhite();
	}
	
	
	//체스 보드 초기화
	private void setBlack() {
        chessBoard.add(List.of("R", "N", "B", "Q", "K", "B", "N", "R"));
        chessBoard.add(List.of("P", "P", "P", "P", "P", "P", "P", "P"));
    }
	 private void setBlank(int idx) {
		 List<String> blankRow = new ArrayList<>();
	     for (int i = 0; i < 8; i++) {
	    	 blankRow.add(".");
	     }
	     chessBoard.add(blankRow);
	 }
	 private void setWhite() {
	        chessBoard.add(List.of("p", "p", "p", "p", "p", "p", "p", "p"));
	        chessBoard.add(List.of("r", "n", "b", "q", "k", "b", "n", "r"));
	    }
	
	//체스보드 출력
	public void printLine(List<String> Line) {
		for (String Element : Line) {
            System.out.print(Element + " ");
        }
        System.out.println();
	}
	public void printBoard() {
		for (List<String> line : chessBoard) {
            printLine(line);
        }
	}
	
	
}
