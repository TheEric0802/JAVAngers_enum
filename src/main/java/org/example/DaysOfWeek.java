package org.example;

public enum DaysOfWeek {
    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDAY("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true),
    SUNDAY("Sunday", true);

    private final String name;
    private final boolean isWeekend;

    DaysOfWeek(String name, boolean isWeekend) {
        this.name = name;
        this.isWeekend = isWeekend;
    }

    public String getName() {
        return name;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}
