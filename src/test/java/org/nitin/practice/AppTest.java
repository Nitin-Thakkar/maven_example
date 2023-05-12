package org.nitin.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * 
     */
	
	@BeforeClass
	public static void shoudCallBeforeClass()
	{
		System.out.println("Before class Enter");
	}
	@Before
	public  void before()
	{
		System.out.println("Before method");
	}
	@AfterClass
	public static void shoudCallafterClass()
	{
		System.out.println("Before class Enter");
	}
    @Test
    public void shouldAnswerWithTrue()
    {
    	
    	int expected = 5;
    	int actual = Calculator.add(2, 3);
//        assertTrue( true );
    	assertEquals(expected, actual);
    }
}
