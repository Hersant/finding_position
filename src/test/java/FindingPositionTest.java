import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingPositionTest {

    @Test
    void givenStage_whenGetPosition_thenShouldReturnPosition() {
        assertEquals(-4, FindingPosition.getPosition(3));
        assertEquals(-5, FindingPosition.getPosition(100000));
    }
}
