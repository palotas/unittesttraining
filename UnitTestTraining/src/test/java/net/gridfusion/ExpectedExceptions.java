package net.gridfusion;

import org.junit.Test;

public class ExpectedExceptions {
	
	@Test(expected=RuntimeException.class)
	public void expectedException() throws Exception {
		throw new RuntimeException();
	}

}
