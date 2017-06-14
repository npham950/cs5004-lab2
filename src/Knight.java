/**
 * Created by Steven on 6/10/17.
 */
public class Knight extends ChessPieceAbs {

  public Knight (int row, int column, Color color) {
    super(row, column, color);
  }

  @Override
  public boolean canMove(int row, int column) {
    return super.canMove(row, column) && Math.abs(this.getRow() - row) * Math.abs(this.getColumn() - column) == 2 ;
  }

  @Override
  public boolean canKill(ChessPiece piece) {
    return super.canKill(piece) && canMove(piece.getRow(), piece.getColumn());
  }
}
