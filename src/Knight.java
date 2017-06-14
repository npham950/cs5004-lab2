/**
 * Created by Steven on 6/10/17.
 */
public class Knight extends ChessPieceAbs {

  public Knight (int row, int column, Color color) {
    super(row, column, color);
  }

  @Override
  public boolean canMove(int row, int column) {
    verifyRowandColumn(row, column);
    return Math.abs(this.getRow() - row) * Math.abs(this.getColumn() - column) == 2 ;
  }

  @Override
  public boolean canKill(ChessPiece piece) {
    return this.getColor() != piece.getColor() && canMove(piece.getRow(), piece.getColumn());
  }
}
