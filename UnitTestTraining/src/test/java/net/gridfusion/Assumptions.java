package net.gridfusion;

import static org.junit.Assert.assertTrue;

import org.junit.Assume;
import org.junit.Test;

public class Assumptions {
	
	boolean isSonarRunning = false;
	
	@Test
	public void assumptions(){
		isSonarRunning = true;
		Assume.assumeFalse(isSonarRunning);
		assertTrue(isSonarRunning);
		
	}

}
