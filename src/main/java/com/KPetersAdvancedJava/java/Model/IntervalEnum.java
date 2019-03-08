/**
 * *  The Stock Service program provides data and dependencies for a Stock Tracking program
 * *
 * * @author  Kinni Peters
 * * @version 1.8
 * * @since 2/6/2019
 */

package com.KPetersAdvancedJava.java.Model;


public enum IntervalEnum {

    /**
     * Enums to use in calculating intervals for the stock service
     * This includes a message variable and a count variable
     */

    MINUTE("Quote every minute", 1440),
    HOUR("Quote every hour", 24),
    DAY("Quote every day", 1);

    private String message;
    private int count;

    /**
     * Constructor for IntervalEnum
     * @param message
     * @param count
     */

    IntervalEnum(String message, int count) {
        this.message = message;
        this.count = count;
    }

    /**
     * getter for the interval count
     * @return count
     */

    public int getCount() {
        return count;
    }

    /**
     * getter for the enum message
     * @return message
     */

    public String getMessage() {
        return message;
    }
}

