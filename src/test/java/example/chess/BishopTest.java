package example.chess;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.Set;

/**
 * Unit test for the Bishop class.
 */
public class BishopTest extends TestCase {

    private Position origin;
    private Bishop bishop;

    @Before
    public void setUp() {
        bishop = new Bishop();
        origin = new Position('c', 3);
    }

    /**
     * Rigourous Test :-)
     */
    public void testDestinationsNotNull() {
        Set<Position> destinations = bishop.getDestinations(origin);
        assertNotNull("getDestinations must never return null", destinations);
    }
}
