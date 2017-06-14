import sun.jvm.hotspot.oops.CheckedExceptionElement;

/**
 * Created by Steven on 6/10/17.
 */
public class Pawn extends ChessPieceAbs {
    public Pawn(int row, int column, Color color) {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int column) {
        verifyRowandColumn(row, column);
        return this.getColumn() == column && row - this.getRow() == 1 ;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        return this.getColor() != piece.getColor() && piece.getRow() - this.getRow() == 1 && Math.abs(this.getColumn() - piece.getColumn()) == 1;
    }
}
