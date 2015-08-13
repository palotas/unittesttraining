package net.gridfusion;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class AssertThat {
	
	@Test
	public void assertThat() {
		int age = 30;
		
		Assert.assertThat(age, equalTo(30));		
	}

}
