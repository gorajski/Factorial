import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests {
    @Test
    @DisplayName("it should return 1 when given 1")
    public void testI1() { assertEquals((Integer) 1, Factorial.i_solve(1)); }

    @Test
    @DisplayName("it should return 2 when given 2")
    public void testI2() { assertEquals((Integer) 2, Factorial.i_solve(2)); }

    @Test
    @DisplayName("it should return 6 when given 3")
    public void testI3() { assertEquals((Integer) 6, Factorial.i_solve(3)); }

    @Test
    @DisplayName("it should return 24 when given 4")
    public void testI4() { assertEquals((Integer) 24, Factorial.i_solve(4)); }

    @Test
    @DisplayName("it should return 120 when given 5")
    public void testI5() { assertEquals((Integer) 120, Factorial.i_solve(5)); }

    @Test
    @DisplayName("it should return 720 when given 6")
    public void testI6() { assertEquals((Integer) 720, Factorial.i_solve(6)); }

    @Test
    @DisplayName("it should return 5040 when given 7")
    public void testI7() { assertEquals((Integer) 5040, Factorial.i_solve(7)); }

    @Test
    @DisplayName("it should return 40320 when given 8")
    public void testI8() { assertEquals((Integer) 40320, Factorial.i_solve(8)); }

    @Test
    @DisplayName("it should return 1 when given 1")
    public void testR1() { assertEquals((Integer) 1, Factorial.r_solve(1)); }

    @Test
    @DisplayName("it should return 2 when given 2")
    public void testR2() { assertEquals((Integer) 2, Factorial.r_solve(2)); }

    @Test
    @DisplayName("it should return 6 when given 3")
    public void testR3() { assertEquals((Integer) 6, Factorial.r_solve(3)); }

    @Test
    @DisplayName("it should return 24 when given 4")
    public void testR4() { assertEquals((Integer) 24, Factorial.r_solve(4)); }

    @Test
    @DisplayName("it should return 120 when given 5")
    public void testR5() { assertEquals((Integer) 120, Factorial.r_solve(5)); }

    @Test
    @DisplayName("it should return 720 when given 6")
    public void testR6() { assertEquals((Integer) 720, Factorial.r_solve(6)); }

    @Test
    @DisplayName("it should return 5040 when given 7")
    public void testR7() { assertEquals((Integer) 5040, Factorial.r_solve(7)); }

    @Test
    @DisplayName("it should return 40320 when given 8")
    public void testR8() { assertEquals((Integer) 40320, Factorial.r_solve(8)); }
}
