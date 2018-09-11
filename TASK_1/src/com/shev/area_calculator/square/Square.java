package com.shev.area_calculator.square;

import com.shev.area_calculator.parent_shape.AbstractShape;
import com.shev.area_calculator.parent_shape.Shape;

public class Square extends AbstractShape  implements Shape {

	private Double a;
	private Double b;
	

	public Square(Double a, Double b) {
		
		if (a>0 & b>0) {
			this.a = a;
			this.b = b;
		}else {
			System.out.println("You can’t build square with this parameters\nplease read geometry rules\n");
		}
	}


	@Override
	public void getArea() {
		if (a!=null & b!=null) {
			Double area;
			area = a*b;
			System.out.println("Area of square: "+area);
		}else {
			System.err.println("getArea method does not work for this square instace:"+this);
		}
		
		
	}

}
