/**
 * Created by Steven on 6/10/17.
 */
public class Knight extends ChessPieceAbs implements ChessPiece {
  private int row;
  private int column;
  private Color color;

  public Knight (int row, int column, Color color) {
    super(row, column, color);
  }

  @Override
  public boolean canMove(int row, int column) {
    verifyRowandColumn(row, column);
    return !((Math.abs(this.row - row) == Math.abs(this.column - column))) && Math.abs(this.row - row) <= 2 && Math.abs(this.column - column) <= 2;
  }

  @Override
  public boolean canKill(ChessPiece piece) {
    return !(this.color == piece.getColor()) && canMove(piece.getRow(), piece.getColumn());
  }
}
