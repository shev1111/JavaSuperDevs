package com.shev.area_calculator.service;

import com.shev.area_calculator.circle.Circle;
import com.shev.area_calculator.parent_shape.Shape;
import com.shev.area_calculator.square.Square;
import com.shev.area_calculator.triangle.Triangle;

import java.util.Random;

public class ShapeService {

    public static Shape getRandomShape (){
        int rundomShape = getRandomNumberInRange(1,3);
        switch (rundomShape){
            case 1: return new Circle(getRundomShapeSide());
            case 2: return new Square(getRundomShapeSide(), getRundomShapeSide());
            case 3: return new Triangle(getRundomShapeSide(), getRundomShapeSide(), getRundomShapeSide());
        }
        return null;
    }

    private static int getRundomShapeSide(){
        return getRandomNumberInRange(10,300);
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
