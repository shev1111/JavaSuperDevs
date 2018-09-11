package com.shev.area_calculator;
import com.shev.area_calculator.circle.Circle;
import com.shev.area_calculator.parent_shape.Shape;
import com.shev.area_calculator.square.Square;
import com.shev.area_calculator.triangle.Triangle;
public class RunAreaCalculator {
	
	public static void main (String[] args) {
		
		Shape[] shapes = new Shape[3];
		Triangle triangle = new Triangle (2.0,3.0,2.0);
		shapes[0] = triangle;
		Circle circle = new Circle(10.0);
		shapes[1] = circle;
		Square square = new Square(2.0, 3.0);
		shapes[2] = square;
		for(Shape shape:shapes) {
			shape.getArea();
			System.out.println("Test finished");
		}
		


		
	}
}