package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDay(DaysOfWeek.MONDAY));
        System.out.println(getDay(DaysOfWeek.SUNDAY));
    }

    public static String getDay(DaysOfWeek day) {
        if (day.isWeekend()) {
            return "Wochenende";
        } else {
            return day.getName();
        }
    }

}