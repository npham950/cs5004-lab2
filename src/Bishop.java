/**
 * Created by Steven on 6/10/17.
 */
public class Bishop implements ChessPiece {
  private int row;
  private int column;
  private Color color;

  public Bishop(int row, int column, Color color) {
    verifyRowandColumn(row, column);
    this.row = row;
    this.column = column;
    this.color = color;
  }

  @Override
  public int getRow() {
    return this.row;
  }

  @Override
  public int getColumn() {
    return this.column;
  }

  @Override
  public Color getColor() {
    return this.color;
  }

  @Override
  public boolean canMove(int row, int column) {
    verifyRowandColumn(row, column);
    return this.row != row && this.column != column && Math.abs(row - this.row) == Math.abs(column - this.column);
  }

  @Override
  public boolean canKill(ChessPiece piece) {
    return !this.color.equals(piece.getColor()) && canMove(piece.getRow(), piece.getColumn());
  }

  public boolean isValid(int n) {
    return (n >= 0 && n <= 7);
  }

  private void verifyRowandColumn (int row, int column) {
    if (!isValid(row) || !isValid(column)) {
      throw new IllegalArgumentException("Non-negative number only");
    }
  }
}
