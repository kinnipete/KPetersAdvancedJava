package com.KPetersAssn3.java.Model;

public enum IntervalEnum {

    MINUTE("Quote every minute", 1440),
    HOUR("Quote every hour", 24),
    DAY("Quote every day", 1);

    private String message;
    private int count;

    IntervalEnum(String message, int count)  {
        this.message = message;
        this.count = count;
    }

    public int getCount()  {return count;}
}

