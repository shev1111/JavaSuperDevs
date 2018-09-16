package com.shev.area_calculator;

import com.shev.area_calculator.circle.Circle;
import com.shev.area_calculator.parent_shape.Shape;
import com.shev.area_calculator.square.Square;
import com.shev.area_calculator.triangle.Triangle;
import java.util.logging.Logger;

public class MainShape {
    private static Logger logger = Logger.getLogger(Shape.class.getSimpleName());
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        Triangle triangle = new Triangle (20,30,20);
        shapes[0] = triangle;
        Circle circle = new Circle(10);
        shapes[1] = circle;
        Square square = new Square(2, 3);
        shapes[2] = square;
        for(Shape shape:shapes) {
            logger.info(shape.getClass()+" Area = "+String.valueOf(shape.getArea()+"\n"));
        }

    }
}
