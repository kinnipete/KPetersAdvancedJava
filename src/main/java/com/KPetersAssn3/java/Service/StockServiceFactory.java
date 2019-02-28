/**
 * Create a basic stock service
 *
 * @author Kinni Peters
 * @version 1.8
 * @since 2/6/2019
 */

package com.KPetersAssn3.java.Service;

/**
 *   Factory class to create new BasicStockService
 */

public class StockServiceFactory  {

    /**
     *
     * @return BasicStockService
     */

    public static StockService getStockService()  {

       return new BasicStockService();
    }
}
