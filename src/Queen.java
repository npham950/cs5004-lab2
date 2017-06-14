/**
 * Created by Steven on 6/10/17.
 */
public class Queen extends ChessPieceAbs {
    private Rook rook;
    private Bishop bishop;

    public Queen (int row, int column, Color color) {
        super(row, column, color);
        this.rook = new Rook(row, column, color);
        this.bishop = new Bishop(row, column, color);
    }

    @Override
    public boolean canMove(int row, int column) {
        return super.canMove(row, column) && (rook.canMove(row, column) || bishop.canMove(row, column));
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        return super.canKill(piece) && canMove(piece.getRow(), piece.getColumn());
    }
}
