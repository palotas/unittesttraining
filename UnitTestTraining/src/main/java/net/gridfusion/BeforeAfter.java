package net.gridfusion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfter {
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("=== Before Class ===");
	}

	@AfterClass
	public static void afterClass() {
		
		System.out.println("=== After Class ===");
	}
	
	@Before
	public void before() {
		
		System.out.println("=== Before Method ===");
	}
	
	@After
	public void after() {
		
		System.out.println("=== After Method ===");
	}
	
	@Test
	public void test1() {
		
		System.out.println("*** Test1 ***");
	}
	
	@Test
	public void test2() {
		
		System.out.println("*** Test2 ***");
	}	
	
	
}
