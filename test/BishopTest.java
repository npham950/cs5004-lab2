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
  public void canMove() throws Exception {
    assertEquals(false, this.bishop.canMove(0,4));
    assertEquals(true, this.bishop.canMove(7,7));
    assertEquals(false, this.bishop.canMove(2,0));
    assertEquals(false, this.bishop.canMove(1, 3));
  }

  @Test
  public void canKill() throws Exception {
    assertEquals(true, this.bishop.canKill(new Bishop(3, 3, Color.BLACK)));
    assertEquals(false, this.bishop.canKill(new Bishop(1, 1, Color.WHITE)));
    assertEquals(false, this.bishop.canKill(new Bishop(5, 1, Color.WHITE)));
    assertEquals(false, this.bishop.canKill(new Bishop(6, 4, Color.BLACK)));
  }
}