package com.demoProject;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;

    
public class TestHelloWorld
{
	
	@Test
	public void printTestMsg()
	{
		System.out.println("This is a Test Msg");
		HelloWorld obj=new HelloWorld();
		String msg=obj.printMsg();
		assertEquals(msg,"This is a Hello World project");
	}

	@After
         public void after() 
	{
        	System.out.println("After Test Case");
    	}
}
