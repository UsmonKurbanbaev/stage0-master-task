package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int digit1 = number % 10;
        int divied = number / 10;
        int digit2 = divied % 10;
        int divided2 = divied / 10;
        int digit3 = divided2 % 10;
        int digit4 = divided2 / 10;

        System.out.println(digit1 + digit2 + digit3 + digit4);
    }

    public static void main(String[] args) {
        DigitsSumCalculator calculator = new DigitsSumCalculator();

        calculator.calculateSum(1111);
    }
}
