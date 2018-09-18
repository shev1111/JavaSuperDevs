package com.shev.area_calculator;

public class MainTask5 {
    public static void main(String[] args) {

        int number1 = 12345;
        int sum = 0;

        while (number1 > 0) {
            sum += number1 % 10;
            number1 = number1 / 10;
        }


        int number2 = 12345;
        String stringNumber = String.valueOf(number2);
        int stringApproachSum = 0;
        for (int cursor=0; cursor < stringNumber.length();cursor++) {
            stringApproachSum += Character.getNumericValue(stringNumber.charAt(cursor));

        }

        int minFourDigitNubmber = 1000;
        int maxminFourDigitNubmber = 9999;

        for(int cursor=0;cursor <= maxminFourDigitNubmber-minFourDigitNubmber;cursor++){
            int startValue1 = minFourDigitNubmber+cursor;
            for(int iterator=0;iterator <= maxminFourDigitNubmber-minFourDigitNubmber;iterator++){
                int startValue2 = minFourDigitNubmber+iterator;
                int multiplicationDigit = startValue1*startValue2;
                System.out.println(startValue1 +" * "+startValue2+" = "+multiplicationDigit);
            }
        }
    }
}
