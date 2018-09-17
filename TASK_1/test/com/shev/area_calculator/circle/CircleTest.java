package com.shev.area_calculator.circle;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testGetArea() {
        int testRadius = 1;
        int expectCircleArea = 3;
        Circle testCircle = new Circle(testRadius);
        assertTrue(testCircle.getArea()>0);
        assertEquals(expectCircleArea, testCircle.getArea());
    }

}