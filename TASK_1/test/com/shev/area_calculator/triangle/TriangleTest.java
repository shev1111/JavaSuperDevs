package com.shev.area_calculator.triangle;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testGetArea() {
        int testTriangleA = 20;
        int testTriangleB = 20;
        int testTriangleC = 30;
        int expectTriangleArea = 198;
        Triangle  testTriangle = new Triangle(testTriangleA, testTriangleB, testTriangleC);
        assertTrue(testTriangle.getArea()>0);
        assertEquals(expectTriangleArea,testTriangle.getArea());
    }

}