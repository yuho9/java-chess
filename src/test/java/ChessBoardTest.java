import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ChessBoardTest {

    @Test
    public void testChessBoardInitialization() {
        ChessBoard chessBoard = new ChessBoard();
        assertNotNull(chessBoard, "ChessBoard should be initialized");
    }
}
