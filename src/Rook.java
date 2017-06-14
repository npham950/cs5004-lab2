/**
 * Created by Steven on 6/10/17.
 */
public class Rook extends ChessPieceAbs {
    public Rook (int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove (int row, int column) {
        return super.canMove(row, column) && (this.getRow() == row || this.getColumn() == column);
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        return super.canKill(piece) && canMove(piece.getRow(), piece.getColumn());
    }

}
