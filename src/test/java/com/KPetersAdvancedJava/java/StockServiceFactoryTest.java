/**
 * Create a basic stock service
 *
 * @author Kinni Peters
 * @version 1.8
 * @since 2/6/2019
 */
package com.KPetersAdvancedJava.java;

import com.KPetersAdvancedJava.java.Service.StockServiceFactory;
import junit.framework.TestCase;
import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;

/**
 *  Test StockServiceFactory to verify creation of StockService
 */
public class StockServiceFactoryTest {

    @Test
    public void testGetInstance()  {
        TestCase.assertNotNull("Verify we get a service", StockServiceFactory.getStockService());
    }
}
