import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Steven on 6/11/17.
 */
public class KnightTest {
  private Knight knight;

  @Before
  public void setUp() throws Exception {
    this.knight = new Knight(0, 0, Color.WHITE);
  }

  @Test
  public void canMove () throws Exception {
    assertEquals(false, this.knight.canMove(0, 2));
    assertEquals(false, this.knight.canMove(1, 0));
    assertEquals(true, this.knight.canMove(1, 2));
    assertEquals(false, this.knight.canMove(1, 1));
    assertEquals(false, this.knight.canMove(2, 2));
    assertEquals(false, this.knight.canMove(3,0));
  }

  @Test
  public void canKill() throws Exception {
    assertEquals(false, this.knight.canKill(new Knight (1, 0, Color.BLACK)));
    assertEquals(false, this.knight.canKill(new Knight (0, 2, Color.BLACK)));
    assertEquals(true, this.knight.canKill(new Knight (1, 2, Color.BLACK)));
    assertEquals(false, this.knight.canKill(new Knight (1, 2, Color.WHITE)));
  }

}