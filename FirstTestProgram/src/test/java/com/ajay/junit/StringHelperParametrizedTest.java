package com.ajay.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ajay.junit.helper.StringHelper;
@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {
	
	
	
	public StringHelperParametrizedTest(String input, String expectedOut) {
		super();
		this.input = input;
		this.expectedOut = expectedOut;
	}
	StringHelper helper =new StringHelper();
	
	private String input;
	private String expectedOut;
	
	
	@Parameters
	public static Collection<String[]> testconditions()
	{
		String expectedOutputs[][]={{"AACD","CD"},{"ACD","CD"},{"ACD","CD"},{"ACW","CD"}};
		return Arrays.asList(expectedOutputs );
	}
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
		
		
		assertEquals(expectedOut,helper.truncateAInFirst2Positions(input));
		
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
