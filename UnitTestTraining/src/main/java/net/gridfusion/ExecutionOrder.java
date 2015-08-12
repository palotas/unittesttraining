package net.gridfusion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecutionOrder {
	
	@Test
	public void bTest()
	{
		System.out.println("=== B TEST ===");
	}
	
	@Test
	public void aTest()
	{
		System.out.println("=== A TEST ===");
	}
	
	@Test
	public void cTest()
	{
		System.out.println("=== C TEST ===");
	}
	
}
