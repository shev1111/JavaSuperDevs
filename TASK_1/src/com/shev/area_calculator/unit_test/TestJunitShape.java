package com.shev.area_calculator.unit_test;

import com.shev.area_calculator.circle.Circle;
import com.shev.area_calculator.square.Square;
import com.shev.area_calculator.triangle.Triangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestJunitShape {

    @Test
    public void testSquareGetAreaMethod() {
        int testSquareA = 2;
        int testSquareB = 3;
        int expectSquareArea = 6;
        Square testSquare = new Square(testSquareA, testSquareB);
        assertTrue( testSquare.getArea() > 0);
        assertEquals(expectSquareArea, testSquare.getArea());
    }

    @Test
    public void testCircleGetAreaMethod(){
        int testRadius = 1;
        int expectCircleArea = 3;
        Circle testCircle = new Circle(testRadius);
        assertTrue(testCircle.getArea()>0);
        assertEquals(expectCircleArea, testCircle.getArea());
    }

    @Test
    public void testTriangleGetAreaMethod(){
        int testTriangleA = 20;
        int testTriangleB = 20;
        int testTriangleC = 30;
        int expectTriangleArea = 198;
        Triangle  testTriangle = new Triangle(testTriangleA, testTriangleB, testTriangleC);
        assertTrue(testTriangle.getArea()>0);
        assertEquals(expectTriangleArea,testTriangle.getArea());
    }
}