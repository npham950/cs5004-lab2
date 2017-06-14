/**
 * Created by Steven on 6/10/17.
 */
public abstract class ChessPieceAbs implements ChessPiece {
  private int row;
  private int column;
  private Color color;

  protected ChessPieceAbs (int row, int column, Color color) {
    verifyRowandColumn(row, column);
    this.row = row;
    this.column = column;
    this.color = color;
  }

  public int getRow() {
    return this.row;
  }

  public int getColumn() {
    return this.column;
  }

  public Color getColor() {
    return this.color;
  }

  protected boolean isValid (int n) {
    return n >= 0 && n <= 7;
  }

  protected void verifyRowandColumn (int row, int column) {
    if (!isValid(row) || !isValid(column)) {
      throw new IllegalArgumentException ("Non-negative number only");
    }
  }

  public boolean canMove(int row, int column) {
    verifyRowandColumn(row, column);
    return true;
  }

  public boolean canKill(ChessPiece piece) {
    return piece.getColor() != this.getColor();
  }
}
