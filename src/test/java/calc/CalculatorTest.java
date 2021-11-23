package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

class CalculatorTest {
    private static Calculator calcObj;

    @Test
    void testAdd() {
        assertEquals(3, calcObj.add(1, 2));
    }

    @BeforeAll
    public static void calcCreation() {
        calcObj = new Calculator();
    }
}
