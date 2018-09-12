package com.shev.area_calculator.triangle;
import com.shev.area_calculator.parent_shape.AbstractShape;

public class Triangle extends AbstractShape{
	private int a;
	private int b;
	private int c;
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	@Override
	public int getArea() {
		int semiPerimeter = (a+b+c)/2;
		double area = Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
		return ((int) area);
	}


	

}
