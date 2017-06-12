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
    this.knight = new Knight(5, 5, Color.WHITE);
  }

  @Test
  public void canMove () throws Exception {
    assertEquals(true, this.knight.canMove(4, 3));
    assertEquals(true, this.knight.canMove(3, 2));
    assertEquals(true, this.knight.canMove(4, 2));
    assertEquals(false, this.knight.canMove(3, 3));
    assertEquals(false, this.knight.canMove(5, 0));
  }

}