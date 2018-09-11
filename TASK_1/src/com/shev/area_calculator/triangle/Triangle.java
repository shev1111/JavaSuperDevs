package com.shev.area_calculator.triangle;

import com.shev.area_calculator.parent_shape.AbstractShape;
import com.shev.area_calculator.parent_shape.Shape;
public class Triangle extends AbstractShape  implements Shape {
	private Double a;
	private Double b;
	private Double c;
	
	
	public Triangle(Double a, Double b, Double c) {
		if (a+b>c & a+c>b & b+c>a & a>0 & b>0 & c>0) {
			
			this.a = a;
			this.b = b;
			this.c = c;	
		}else {
			System.out.println("You can’t build triangle with this parameters\nplease read geometry rules\n");
		}
		
	}
	
	


	@Override
	public void getArea() {
		if(a!=null & b!=null & c!=null) {
			Double semiPerimeter = (a+b+c)/2;
			Double area = Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
			System.out.println("Area of triangle: "+area);
		}else {
			System.err.println("getArea method does not work for this triangle instace:"+this);
		}
		
		
	}


	

}
