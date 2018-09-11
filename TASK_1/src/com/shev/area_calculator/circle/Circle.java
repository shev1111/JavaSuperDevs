package com.shev.area_calculator.circle;

import com.shev.area_calculator.parent_shape.AbstractShape;
import com.shev.area_calculator.parent_shape.Shape;

public class Circle extends AbstractShape  implements Shape   {

	private Double radius;
	
	public Circle(Double radius) {
		
		if (radius>0) {
			this.radius = radius;
		}else {
			System.out.println("You can’t build circle with this parameter\nplease read geometry rules\n");
		}
	}

	@Override
	public void getArea() {
		if (radius!=null) {
			Double area;
			area = Math.PI * radius * radius;
			System.out.println("Area of circle: "+area);
		}else {
			System.err.println("getArea method does not work for this circle instace:"+this);
		}
		
		
	}

	
 
}
