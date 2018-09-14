package com.shev.area_calculator.unit_test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRanner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunitSquare.class);


        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
