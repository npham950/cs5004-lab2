import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Steven on 6/10/17.
 */
public class BishopTest {
  private Bishop bishop;

  @Before
  public void setUp() throws Exception {
    this.bishop = new Bishop(0,0, Color.WHITE);
  }

  @Test
  public void getRow() throws Exception {
    assertEquals(0, this.bishop.getRow());
  }

  @Test
  public void getColumn() throws Exception {
    assertEquals(0, this.bishop.getColumn());
  }

  @Test
  public void canMove() throws Exception {
    assertEquals(false, this.bishop.canMove(0,4));
    assertEquals(true, this.bishop.canMove(7,7));
    assertEquals(false, this.bishop.canMove(2,0));
    assertEquals(false, this.bishop.canMove(1, 3));
  }

  @Test
  public void getColor() throws Exception {
    assertEquals(Color.WHITE, this.bishop.getColor());
  }

  @Test
  public void isValid() throws Exception {
    try {
      new Bishop(-1, 9, Color.WHITE);
      fail("Exception was not thrown when row is negative");
    } catch (IllegalArgumentException e) {}

    try {
      this.bishop.canMove(-8,-3);
      fail("Exception was not thrown when canMove's parameters are negative");
    } catch (IllegalArgumentException e) {}

    try {
      new Bishop(12, 5, Color.BLACK);
      fail("Exception was not thrown when row is out of bound");
    } catch (IllegalArgumentException e) {}
  }

  @Test
  public void canKill() throws Exception {
    assertEquals(true, this.bishop.canKill(new Bishop(3, 3, Color.BLACK)));
    assertEquals(false, this.bishop.canKill(new Bishop(1, 1, Color.WHITE)));
    assertEquals(false, this.bishop.canKill(new Bishop(5, 1, Color.WHITE)));
    assertEquals(false, this.bishop.canKill(new Bishop(6, 4, Color.BLACK)));
  }

}