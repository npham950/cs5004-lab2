import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nypham on 6/12/17.
 */
public class RookTest {
    private Rook rook;

    @Before
    public void setUp() throws Exception {
        this.rook = new Rook (3, 2, Color.WHITE);
    }

    @Test
    public void canMove() throws Exception {
        assertEquals(true, this.rook.canMove(3, 5));
        assertEquals(true, this.rook.canMove(4, 2));
        assertEquals(false, this.rook.canMove(5,6));
    }

    @Test
    public void canKill() throws Exception {
    }

}