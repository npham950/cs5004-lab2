import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nypham on 6/13/17.
 */
public class PawnTest {
    private Pawn pawn;
    @Before
    public void setUp() throws Exception {
        this.pawn = new Pawn (3, 4, Color.WHITE);
    }

    @Test
    public void canMove() throws Exception {
        assertEquals(true, this.pawn.canMove(4, 4));
        assertEquals(false, this.pawn.canMove(5, 4));
        assertEquals(false, this.pawn.canMove(4, 3));
        assertEquals(false, this.pawn.canMove(2, 3));
    }

    @Test
    public void canKill() throws Exception {
        assertEquals(true, this.pawn.canKill(new Pawn (4, 3, Color.BLACK)));
        assertEquals(true, this.pawn.canKill(new Queen (4, 5, Color.BLACK)));
        assertEquals(false, this.pawn.canKill(new Bishop (4,3, Color.WHITE)));
        assertEquals(false, this.pawn.canKill(new Bishop (3, 4, Color.BLACK)));
        assertEquals(false, this.pawn.canKill(new Pawn (4, 4, Color.WHITE)));
    }

}