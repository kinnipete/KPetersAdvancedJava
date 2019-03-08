/**
 * *  The Stock Service program provides data and dependencies for a Stock Tracking program
 * *
 * * @author  Kinni Peters
 * * @version 1.8
 * * @since 2/6/2019
 */
package com.KPetersAdvancedJava.java.Model;

import org.apache.http.annotation.Immutable;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 *   Create a container class for StockQuote data
 */

@Immutable

public class StockQuote {

    private Calendar dateRecorded;

    private BigDecimal stockPrice;

    private String stockSymbol;

    /**
     * Take values from BasicStockService
     * @param dateRecorded
     * @param stockPrice
     * @param stockSymbol
     */

    public StockQuote(Calendar dateRecorded, BigDecimal stockPrice, String stockSymbol) {

        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        this.dateRecorded = dateRecorded;
    }

    /**
     *
     * @return the dateRecorded
     */

     public Calendar getDate() {
        return dateRecorded;
    }

    /**
     *
     * @return the stockPrice
     */

     public BigDecimal getStockPrice() {
        return stockPrice;
    }

    /**
     *
     * @return the stockSymbol
     */

     public String getStockSymbol() {
        return stockSymbol;
    }
}




