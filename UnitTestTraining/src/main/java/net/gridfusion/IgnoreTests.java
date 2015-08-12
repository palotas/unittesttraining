package net.gridfusion;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class IgnoreTests {

	@Test
	public void passingTest(){
		Assert.assertTrue(true);
	}
	
	@Test
	@Ignore("Hubert is on vacation")
	public void ignoreTest(){
		Assert.assertTrue(false);
	}

}
