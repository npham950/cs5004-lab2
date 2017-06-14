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
        return super.canMove(row, column) && this.getColumn() == column && row - this.getRow() == 1 ;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        return super.canKill(piece) && piece.getRow() - this.getRow() == 1 && Math.abs(this.getColumn() - piece.getColumn()) == 1;
    }
}
