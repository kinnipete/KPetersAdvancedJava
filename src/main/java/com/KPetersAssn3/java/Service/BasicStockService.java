/**
 * Create a basic stock service
 *
 * @author Kinni Peters
 * @version 1.8
 * @since 2/6/2019
 */

package com.KPetersAssn3.java.Service;

import com.KPetersAssn3.java.Model.IntervalEnum;
import com.KPetersAssn3.java.Model.StockQuote;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Dummy class for a basic stock service
 */
class BasicStockService implements StockService {

    /**
     *
     * @param symbol the stock symbol of the company you want a quote for e.g. APPL for APPLE
     * @return a new StockQuote
     */

    public StockQuote getQuote(@NotNull String symbol) {
        return new StockQuote(Calendar.getInstance(), new BigDecimal(100), symbol);
    }

    /**
     *
     * @param symbol the stock symbol to search for
     * @param from   the date of the first stock quote
     * @param until  the date of the last stock quote
     * @return a list of StockQuotes
     */

    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until, IntervalEnum interval) {
        List<StockQuote> returnValue = new ArrayList<>();
        returnValue.add(getQuote("APPL"));
        return returnValue;
        }
    }



