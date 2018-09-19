package com.shev.area_calculator;
import java.util.logging.Logger;

public class MainTask5 {

    private static Logger logger = Logger.getLogger(MainTask5.class.getSimpleName());
    public static void main(String[] args) {

        int number1 = 12345;
        int sum = 0;

        while (number1 > 0) {
            sum += number1 % 10;
            number1 = number1 / 10;
        }
        logger.info("method 'remainder of division' sum of number "+number1+" digits is "+String.valueOf(sum));


        int number2 = 12345;
        String stringNumber = String.valueOf(number2);
        int stringApproachSum = 0;
        for (int cursor=0; cursor < stringNumber.length();cursor++) {
            stringApproachSum += Character.getNumericValue(stringNumber.charAt(cursor));

        }
        logger.info("method 'divide to symbols' sum of number "+number2+" digits is "+String.valueOf(stringApproachSum));
        int minFourDigitNubmber = 1000;
        int maxminFourDigitNubmber = 9999;
        int biggestPalindrome = 0;

        for(int cursor=0;cursor <= maxminFourDigitNubmber-minFourDigitNubmber;cursor++){
            int startValue1 = minFourDigitNubmber+cursor;
            for(int iterator=0;iterator <= maxminFourDigitNubmber-minFourDigitNubmber;iterator++){
                int startValue2 = minFourDigitNubmber+iterator;
                int multiplicationDigit = startValue1*startValue2;
                if(isPalindrome(multiplicationDigit) && biggestPalindrome<multiplicationDigit){
                    biggestPalindrome = multiplicationDigit;
                }
            }
        }
        logger.info("The biggest palindrome multiplication result of for all four number digit is "+String.valueOf(biggestPalindrome));
    }

    private static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return integer == reverse;
    }
}
