package com.ajay.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ajay.junit.helper.StringHelper;

public class StringHelperTest {
	
	@BeforeClass
	public static void  start()
	{
		System.out.println("before class");
		
	}	
@Before
	public void setuptest()
	{
		System.out.println("before test");
		
	}
	@Test
	public void testTruncateAInFirst2Positions() {
		
		StringHelper helper =new StringHelper();
		String actual1=helper.truncateAInFirst2Positions("AACD");
		String actual2=helper.truncateAInFirst2Positions("AACD");
		String expected="CD";	
		assertEquals(expected,actual1);
		assertEquals(expected,actual2);
	}
@Test
public void testFirstAndLastTwoCharactersTheSame_ADAC()
{
	StringHelper helper =new StringHelper();
     assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ADAC"));
}
@Test
public void testFirstAndLastTwoCharactersTheSame_AA()
{
	StringHelper helper =new StringHelper();
     assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ADAD"));
}
@After
public void testend()
{
	System.out.println("after test");
	
}
@AfterClass
public static void classend()
{
	System.out.println("after class");
	
}
}
