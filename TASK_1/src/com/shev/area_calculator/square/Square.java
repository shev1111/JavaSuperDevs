package com.shev.area_calculator.square;
import com.shev.area_calculator.parent_shape.AbstractShape;

public class Square extends AbstractShape{

	private int a;
	private int b;

	public Square(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int getArea() {
			int area;
			area = a*b;
			return  area;


	}

}
