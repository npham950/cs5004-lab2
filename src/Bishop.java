/**
 * Created by Steven on 6/10/17.
 */
public class Bishop extends ChessPieceAbs {


  public Bishop(int row, int column, Color color) {
    super(row, column, color);
  }

  @Override
  public boolean canMove(int row, int column) {
    return super.canMove(row, column) && this.getRow() != row && this.getColumn() != column && Math.abs(row - this.getRow()) == Math.abs(column - this.getColumn());
  }

  @Override
  public boolean canKill(ChessPiece piece) {
    return !this.getColor().equals(piece.getColor()) && canMove(piece.getRow(), piece.getColumn());
  }

}
