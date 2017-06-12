import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Steven on 6/10/17.
 */
public class ChessPieceAbsTest {
  private ChessPieceAbs chesspiece;

  @Before
  public void setUp() throws Exception {
    this.chesspiece = new Bishop(0, 0 , Color.WHITE);
  }

  @Test
  public void getRow() throws Exception {
    assertEquals(0, this.chesspiece.getRow());
  }

  @Test
  public void getColumn() throws Exception {
    assertEquals(0, this.chesspiece.getColumn());
  }

  @Test
  public void getColor() throws Exception {
    assertEquals(Color.WHITE, this.chesspiece.getColor());
  }

  @Test
  public void isValid() throws Exception {
    try {
      new Bishop(-1, 9, Color.WHITE);
      fail("Exception was not thrown when row is negative");
    } catch (IllegalArgumentException e) {}

    try {
      this.chesspiece.canMove(-8,-3);
      fail("Exception was not thrown when canMove's parameters are negative");
    } catch (IllegalArgumentException e) {}

    try {
      new Bishop(12, 5, Color.BLACK);
      fail("Exception was not thrown when row is out of bound");
    } catch (IllegalArgumentException e) {}
  }
}
