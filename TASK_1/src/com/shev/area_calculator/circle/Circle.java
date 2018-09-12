package com.shev.area_calculator.circle;
import com.shev.area_calculator.parent_shape.AbstractShape;

public class Circle extends AbstractShape{

	private int radius;
	private final double PI = Math.PI;
	
	public Circle(Integer radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		double area = PI*radius *radius;
		return ((int) area);
	}

	
 
}
