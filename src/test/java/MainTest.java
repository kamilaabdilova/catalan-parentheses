import org.example.Main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    @Test
    void testSmallValues() {
        assertEquals(1, Main.countWellFormedParenthesis(1));
        assertEquals(2, Main.countWellFormedParenthesis(2));
        assertEquals(5, Main.countWellFormedParenthesis(3));
        assertEquals(14, Main.countWellFormedParenthesis(4));
        assertEquals(42, Main.countWellFormedParenthesis(5));
    }

    @Test
    void testEdgeCases() {
        assertEquals(0, Main.countWellFormedParenthesis(0));
        assertEquals(132, Main.countWellFormedParenthesis(6));
        assertEquals(429, Main.countWellFormedParenthesis(7));
        assertEquals(4862, Main.countWellFormedParenthesis(9));
    }
    @Test
    void testMaximumInput() {
        // Просто проверить, что метод не падает на максимальном входе
        int result = Main.countWellFormedParenthesis(15);
        assertTrue(result > 0);
    }
}
