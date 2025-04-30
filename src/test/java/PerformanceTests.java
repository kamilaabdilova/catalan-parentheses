import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerformanceTests {
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
