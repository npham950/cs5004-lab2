/**
 * Created by Steven on 6/10/17.
 */
public interface ChessPiece {
  int getRow();
  int getColumn();
  Color getColor();
  boolean canMove(int row, int column);
  boolean canKill(ChessPiece piece);
}
