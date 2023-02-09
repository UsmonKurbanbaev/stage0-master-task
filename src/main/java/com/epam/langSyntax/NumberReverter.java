package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int digit1 = number % 10;
        int num1 = number / 10;
        int digit2 = num1 % 10;
        int digit3 = num1 / 10;

        System.out.println(digit1 * 100 + digit2 * 10 + digit3);
    }
}
