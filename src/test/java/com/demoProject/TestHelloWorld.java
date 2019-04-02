package com.demoProject;

import org.junit.Test;
import static org.junit.Assert.*;
 
public class TestHelloWorld
{
  	@Test
  	public void TestHelloWorld()
	{
      		HelloWorld h = new HelloWorld();
      		String str = "World";
 
     		 assertEquals(str, h.Hello(str));
  	}
}
