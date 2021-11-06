package CalculatorTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int result = Calculator.add(3,4);
        assertEquals(7,result);
    }

    @Test
    void sub() {
        int result = Calculator.sub(3,2);
        assertEquals(1,result);
    }

    @Test
    void mult() {
        int result = Calculator.mult(7,7);
        assertEquals(49,result);
    }

    @Test
    void div() {
        int result = Calculator.div(8,2);
        assertEquals(4,result);
    }
}