/**
 * Created by Steven on 6/10/17.
 */
public class Queen extends ChessPieceAbs {
    public Queen (int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int column) {
        verifyRowandColumn(row, column);
        return Math.abs(this.getRow() - row) == Math.abs(this.getColumn() - column) || this.getRow() == row || this.getColumn() == column;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        return this.getColor() != piece.getColor() && canMove(piece.getRow(), piece.getColumn());
    }
}
