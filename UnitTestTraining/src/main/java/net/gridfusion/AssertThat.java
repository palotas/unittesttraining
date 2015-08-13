package net.gridfusion;

import org.junit.Assert;
import org.junit.Test;

public class AssertThat {
	
	@Test
	public void assertThat() {
		int age = 30;
		
		Assert.assertThat(age, equalTo(30));		
	}

}
