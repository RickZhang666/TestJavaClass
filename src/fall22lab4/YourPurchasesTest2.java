package fall22lab4;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * This is a test to test the class YourPurchases
 * <p>Name: 22F Lab 4</p>
 * <p>Class: CST8284</p>
 * <p>Professor: Fedor Ilitchev</p>
 * <p>Date: Oct. 10, 2022</p>
 * <p>Section: 313</p>

 * @author Rick Zhang
 * @version 1.0
 * @since 11.0.15
 * @see Test
 * @see Assert
 */
public class YourPurchasesTest2 {
	
	/**
	  * {@value #EPSILON}
	  */
	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: WRITE ONE OR MORE TESTS TO SYSTEMATICALLY FIND THE SOURCE OF THE TEST FAILURE
	
	/**
	 * This is a test to test the class YourPurchases
	 */
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE TEST CASES (NOT ALREADY STATED IN THIS CODE)
	   // TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
	
	
	/** 
	 * test id = 1 ,test method recordPurchase 
	 */
	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(5.5);
		aPurchase.recordPurchase(1.0);
		// expected value or result
		/**
		  * {@value #EXPECT_RECORD_PURCHASE}
		  */
		final double EXPECT_RECORD_PURCHASE = 6.5;
		double recordPurchase1 = aPurchase.getPurchase();
	    Assert.assertEquals(EXPECT_RECORD_PURCHASE, recordPurchase1, EPSILON);
		// tear down resources i.e. make avail for Garbage Collector
		aPurchase = null;
	}
	
	/** 
	 * test id = 2 ,test method receivePayment
	 */
	@Test 
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(7, 2, 1, 0, 0);
		// expected value or result
		/**
		  * {@value #EXPECT_RECEIVE_PAYMENT}
		  */
		final double EXPECT_RECEIVE_PAYMENT = 7.6;
		double receivePayment1 = aPurchase.getPayment();
	    Assert.assertEquals(EXPECT_RECEIVE_PAYMENT, receivePayment1, EPSILON);
		// tear down resources i.e. make avail for Garbage Collector
		aPurchase = null;
	}
	
	/** 
	 * test id = 3 ,test method calculateChange 
	 */
	@Test
	public void testCalculateChange2() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(5.5);
		aPurchase.recordPurchase(1.0);
		aPurchase.receivePayment(7, 2, 1, 0, 0);
		// expected value or result
		/**
		  * {@value #EXPECT_CHANGE}
		  */
		final double EXPECT_CHANGE = 1.10;
		double change1 = aPurchase.CalculateChange();
	    Assert.assertEquals(EXPECT_CHANGE, change1, EPSILON);
		// tear down resources i.e. make avail for Garbage Collector
		aPurchase = null;
	}
	
	
}
