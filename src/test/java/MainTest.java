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

    @Test
    void performanceTest() {
        long start = System.nanoTime();
        int result = Main.countWellFormedParenthesis(15);
        long end = System.nanoTime();
        long durationMs = (end - start) / 1_000_000;

        System.out.println("Результат для n=15: " + result);
        System.out.println("Время выполнения: " + durationMs + " мс");

        // Проверяем что результат правильный
        assertEquals(9694845, result);

        // Проверяем что уложились по времени
        assertTrue(durationMs < 500, "Слишком долгое выполнение");
    }
}
