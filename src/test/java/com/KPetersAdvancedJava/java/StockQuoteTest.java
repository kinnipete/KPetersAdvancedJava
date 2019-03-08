/**
 * Create a basic stock service
 *
 * @author Kinni Peters
 * @version 1.8
 * @since 2/6/2019
 */

package com.KPetersAdvancedJava.java;

import com.KPetersAdvancedJava.java.Model.StockQuote;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Test for StockQuote creation
 */

public class StockQuoteTest {

    @Test
    public void testConstruction()  {
        Calendar when = Calendar.getInstance();
        BigDecimal stockPrice = new BigDecimal(100);
        String stockSymbol = "APPL";
        StockQuote stockQuote = new StockQuote(when, stockPrice, stockSymbol);
        assertEquals("Verify stock price", stockPrice, stockQuote.getStockPrice());
        assertEquals("Verify stock date", when, stockQuote.getDate());
        assertEquals("Verify stock symbol", stockSymbol, stockQuote.getStockSymbol());
    }
}
