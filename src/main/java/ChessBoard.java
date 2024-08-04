import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessBoard {
    
    private final List<List<String>> chessBoard;
    
    public ChessBoard() {
        chessBoard = new ArrayList<>();
        setBlack();
        for (int i = 2; i < 6; i++) {
            setBlank(i);
        }
        setWhite();
    }
    
    // 체스 보드 초기화
    private void setBlack() {
        chessBoard.add(new ArrayList<>(Arrays.asList("R", "N", "B", "Q", "K", "B", "N", "R")));
        chessBoard.add(new ArrayList<>(Arrays.asList("P", "P", "P", "P", "P", "P", "P", "P")));
    }
    
    private void setBlank(int idx) {
        List<String> blankRow = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            blankRow.add(".");
        }
        chessBoard.add(blankRow);
    }
    
    private void setWhite() {
        chessBoard.add(new ArrayList<>(Arrays.asList("p", "p", "p", "p", "p", "p", "p", "p")));
        chessBoard.add(new ArrayList<>(Arrays.asList("r", "n", "b", "q", "k", "b", "n", "r")));
    }
    
    // 체스보드 출력
    public void printLine(List<String> line) {
        for (String element : line) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public void printBoard() {
        for (List<String> line : chessBoard) {
            printLine(line);
        }
    }
    
    // 체스말 위치 변환
    public List<Integer> change(String s) {
        List<Integer> location = new ArrayList<>();
        char col = s.charAt(0);
        int colIdx = col - 'a'; // 'a'를 0으로 변환
        location.add(colIdx);
        
        char row = s.charAt(1);
        int rowIdx = row - '1'; // '1'을 0으로 변환
        location.add(rowIdx);
        
        return location;
    }
    
    // 체스말 이동
    public void movePiece(String source, String target) {
        List<Integer> s = change(source);
        List<Integer> t = change(target);
        
        String piece = chessBoard.get(7 - s.get(1)).get(s.get(0));
        chessBoard.get(7 - t.get(1)).set(t.get(0), piece);
        chessBoard.get(7 - s.get(1)).set(s.get(0), ".");
    }
    
    public void move(String command) {
    	String[] mst = command.split(" ");
    	if(mst[0].equals("move")) {
            movePiece(mst[1], mst[2]);
            printBoard();
        }
    }
}

