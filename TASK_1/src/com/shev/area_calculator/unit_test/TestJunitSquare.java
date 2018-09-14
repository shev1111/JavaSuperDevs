package com.shev.area_calculator.unit_test;


import com.shev.area_calculator.square.Square;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestJunitSquare {
    //test data
    private int testA = 2;
    private int testB = 3;
    private int area = 6;
    Square square_1 = new Square(2, 3);

    @Test
    public void testAssertions(){
        assertNotNull(square_1);
        assertTrue(testA == square_1.getA());
        assertTrue(testB == square_1.getB());
        assertTrue(square_1.getA() > 0);
        assertTrue(square_1.getB() > 0);
    }

    @Test
    public void testSquareGetAreaMethod() {
        assertEquals(area, square_1.getArea());
    }
}