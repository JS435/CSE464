import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class RootsTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Calculate Roots")
    void calculate_roots()
    {
        //NA
    }

    @DisplayName("Number of Roots")
    @org.junit.jupiter.api.Test
    void num_roots()
    {
        Roots.calculate_roots(5,10,5);
        assertEquals(1, Roots.num_roots());

        Roots.calculate_roots(10,5,10);
        assertEquals(0, Roots.num_roots());

        Roots.calculate_roots(5,15,-5);
        assertEquals(2, Roots.num_roots());
    }

    @DisplayName("First Root")
    @org.junit.jupiter.api.Test
    void first_root()
    {
        Roots.calculate_roots(5,10,5);
        assertEquals((0-10)/(2*5), Roots.first_root());

        Roots.calculate_roots(10,5,10);
        assertEquals(-1, Roots.first_root());

        Roots.calculate_roots(5,15,-5);
        assertEquals(((0-15) + Math.sqrt(325))/(2 * 5), Roots.first_root());
    }

    @DisplayName("Second Root")
    @org.junit.jupiter.api.Test
    void second_root()
    {
        Roots.calculate_roots(5,10,5);
        assertEquals(Roots.first_root(), Roots.second_root());

        Roots.calculate_roots(10,5,10);
        assertEquals(-1, Roots.second_root());

        Roots.calculate_roots(5,15,-5);
        assertEquals(((0-15) - Math.sqrt(325))/(2 * 5), Roots.second_root());
    }
}