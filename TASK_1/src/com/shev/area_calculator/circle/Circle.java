package com.shev.area_calculator.circle;
import com.shev.area_calculator.parent_shape.AbstractShape;

public class Circle extends AbstractShape{

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		double PI = 3;
		double area = PI*radius *radius;
		return ((int) area);
	}

	
 
}
