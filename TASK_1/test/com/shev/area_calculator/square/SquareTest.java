package com.shev.area_calculator.square;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testGetArea() {
        int testSquareA = 2;
        int testSquareB = 3;
        int expectSquareArea = 6;
        Square testSquare = new Square(testSquareA, testSquareB);
        assertTrue( testSquare.getArea() > 0);
        assertEquals(expectSquareArea, testSquare.getArea());
    }

}