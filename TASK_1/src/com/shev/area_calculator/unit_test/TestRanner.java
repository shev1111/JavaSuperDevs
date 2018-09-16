package com.shev.area_calculator.unit_test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.logging.Logger;

public class TestRanner {
    private static Logger logger = Logger.getLogger(TestJunitShape.class.getSimpleName());
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunitShape.class);
        for (Failure failure : result.getFailures()) {
            logger.warning(failure.getTestHeader()+" "+failure.getTrace());
            //System.out.println(failure.toString());
        }
        logger.info(TestJunitShape.class.getSimpleName()+" condition "+result.wasSuccessful());
    }

}
