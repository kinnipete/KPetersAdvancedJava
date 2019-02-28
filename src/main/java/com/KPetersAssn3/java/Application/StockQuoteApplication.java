
/**
 * Create a basic stock service
 *
 * @author Kinni Peters
 * @version 1.8
 * @since 2/6/2019
 */

package com.KPetersAssn3.java.Application;

import com.KPetersAssn3.java.Service.StockServiceFactory;
import com.KPetersAssn3.java.Service.StockService;

/**
 *  Main application class for the StockService
 */

public class StockQuoteApplication {

    /**
     *
     * @param args to be taken from user input
     */

    public static void main(String[] args)  {
        StockService stockService = StockServiceFactory.getStockService();
    }
}
