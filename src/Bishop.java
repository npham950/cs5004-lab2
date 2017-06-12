/**
 * Created by Steven on 6/10/17.
 */
public class Bishop extends ChessPieceAbs {
  private int row;
  private int column;
  private Color color;

  public Bishop(int row, int column, Color color) {
    super(row, column, color);
  }

  @Override
  public boolean canMove(int row, int column) {
    verifyRowandColumn(row, column);
    return this.row != row && this.column != column && Math.abs(row - this.row) == Math.abs(column - this.column);
  }

  @Override
  public boolean canKill(ChessPiece piece) {
    return !this.getColor().equals(piece.getColor()) && canMove(piece.getRow(), piece.getColumn());
  }

}
