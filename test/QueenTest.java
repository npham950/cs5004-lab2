import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nypham on 6/13/17.
 */
public class QueenTest {
    private Queen queen;
    @Before
    public void setUp() throws Exception {
        this.queen = new Queen (3, 3, Color.WHITE);
    }

    @Test
    public void canMove() throws Exception {
        assertEquals(true, this.queen.canMove(7, 7));
        assertEquals(true, this.queen.canMove(3, 2));
        assertEquals(true, this.queen.canMove(6, 3));
        assertEquals(false, this.queen.canMove(2, 1));
        assertEquals(false, this.queen.canMove(2, 5));
    }

    @Test
    public void canKill() throws Exception {
        assertEquals(true, this.queen.canKill(new Queen (7, 7, Color.BLACK)));
        assertEquals(true, this.queen.canKill (new Rook (3, 2, Color. BLACK)));
        assertEquals(false, this.queen.canKill( new Bishop (6, 3, Color.WHITE)));
        assertEquals(false, this.queen.canKill(new Rook (2, 5, Color.BLACK)));
    }

}