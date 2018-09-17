package com.shev.area_calculator;

import com.shev.area_calculator.parent_shape.Shape;
import com.shev.area_calculator.service.CustomComparatorOfShapeList;
import com.shev.area_calculator.service.ShapeService;
import java.util.ArrayList;
import java.util.logging.Logger;

public class MainShape {
    private static Logger logger = Logger.getLogger(Shape.class.getSimpleName());
    public static void main(String[] args) {

        int numberOfshapes = 50;
        ArrayList<Shape> shapeList = new ArrayList<>(numberOfshapes);

        for (int cursor = 0;cursor < numberOfshapes; cursor++ ){
            shapeList.add(ShapeService.getRandomShape());
        }
        shapeList.sort(new CustomComparatorOfShapeList());
        Shape biggestShape = shapeList.get(shapeList.size()-1);
        logger.info("The biggest shape figure is " +biggestShape.getClass().getSimpleName()+" with area: "+biggestShape.getArea()+" square units");
        Shape smallestShape = shapeList.get(0);
        logger.info("The smallest shape figure is " +shapeList.get(0).getClass().getSimpleName()+" with area: "+smallestShape.getArea()+" square units");






    }
}
