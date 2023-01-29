package fall22lab4;

import org.junit.Test;
import org.junit.Assert;

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
public class YourPurchasesTest
{
	/**
	  * {@value #EPSILON}
	  */
   private static final double EPSILON = 1E-12;
 
   
/**
 * This is a test to test the class YourPurchases
 */
   @Test // id = 1
   public void twoPurchases(){
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      register.receivePayment(2, 0, 5, 0, 0);
      double expected = 0.25;
      Assert.assertEquals(expected, register.giveChange(), EPSILON);
    }
   
// YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 

  
     
   }

