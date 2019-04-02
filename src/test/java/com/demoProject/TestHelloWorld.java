package com.demoProject;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;

    
public class TestHelloWorld
{
	
	@ActualTest
	public void printTestMsg()
	{
		System.out.println("This is a Test Msg");
		HelloWorld obj=new HelloWorld();
		
		assertEquals(obj.printMsg(),"This is a Hello World project");
	}

	@After
         public void after() 
	{
        	System.out.println("After Test Case");
    	}
}
