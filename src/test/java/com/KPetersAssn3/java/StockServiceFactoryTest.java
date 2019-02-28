/**
 * Create a basic stock service
 *
 * @author Kinni Peters
 * @version 1.8
 * @since 2/6/2019
 */
package com.KPetersAssn3.java;

import com.KPetersAssn3.java.Service.StockServiceFactory;
import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;

/**
 *  Test StockServiceFactory to verify creation of StockService
 */
public class StockServiceFactoryTest {

    @Test
    public void testGetInstance()  {
        assertNotNull("Verify we get a service", StockServiceFactory.getStockService());
    }
}
