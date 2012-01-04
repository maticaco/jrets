package org.realtors.rets.util.dmql;

import junit.framework.TestCase;

public class StringListTest extends TestCase {

	public StringListTest() {
		super();
	}
	public StringListTest(String arg0) {
		super(arg0);
	}

	public void testString()throws Exception{
		StringList list = new StringList(new String[]{"*Sold,Re?ted"});
		assertTrue(list.toString(),list.toString().equals("*Sold,Re?ted"));
	}
}
