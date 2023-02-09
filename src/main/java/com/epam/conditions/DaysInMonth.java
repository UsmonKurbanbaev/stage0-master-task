package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month > 12 || month < 1) {
            System.out.println("invalid date");
        } else {
            boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
            if (isLeap && month == 2) {
                System.out.println(29);
            } else {
                switch (month) {
                    case 2 -> System.out.println("28");
                    case 4, 6, 9, 11 -> System.out.println("30");
                    default -> System.out.println("31");
                }
            }

        }

    }
}
