package com.shev.area_calculator.service;

import com.shev.area_calculator.parent_shape.Shape;

import java.util.Comparator;

public class CustomComparatorOfShapeList implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        return Integer.compare(shape1.getArea(),shape2.getArea());
    }
}
