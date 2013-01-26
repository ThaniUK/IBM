package selftechypackage;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ClockClassTest {
    ClockClass clck = new ClockClass();

	 @BeforeClass 
	  public static void testSetup(){
		 System.out.println ("Start of Unit Test");

	  }
	  
	  @AfterClass 
	  public static void testCleanup(){
		  System.out.println ("End of Unit Test");
	  }
	  
	  @Test
	  public void ClockDisplay_Midnight() {
		    System.out.println("Test 1 : " + clck.Display(00,00));
		    System.out.println("Test 2 : " + clck.Display(00,05));
		    System.out.println("Test 3 : " + clck.Display(00,01));
		    System.out.println("Test 4 : " + clck.Display(23,45));
		    
	  }

	  @Test
	  public void ClockDisplay_Morning() {
		    System.out.println("Test 5 : " +clck.Display(8,00));
		    System.out.println("Test 6 : " +clck.Display(9,03));
		    System.out.println("Test 7 : " +clck.Display(10,23));
		    System.out.println("Test 8 : " +clck.Display(10,35));
	  }
	
	  @Test
	  public void ClockDisplay_Afternoon() {
		    System.out.println("Test 9 : " +clck.Display(13,00));
		    System.out.println("Test 11 : " +clck.Display(14,25));
		    System.out.println("Test 12 : " +clck.Display(11,45));
	  }
	  
	  @Test
	  public void ClockDisplay_Evening() {
		    System.out.println("Test 13 : " +clck.Display(17,00));
		    System.out.println("Test 14 : " +clck.Display(18,20));
		    System.out.println("Test 15 : " +clck.Display(19,45));
	  }
	  
	  @Test
	  public void ClockDisplay_Night() {
		    System.out.println("Test 16 : " +clck.Display(21,00));
		    System.out.println("Test 17 : " +clck.Display(22,01));
		    System.out.println("Test 18 : " +clck.Display(22,25));
		    System.out.println("Test 19 : " +clck.Display(22,45));
	  }
}
