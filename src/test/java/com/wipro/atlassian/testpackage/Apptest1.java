/**
 * 
 */
package com.wipro.atlassian.testpackage;

import junit.framework.TestCase;

/**
 * @author user
 *
 */
public class Apptest1 extends TestCase {

	/**
	 * @param name
	 */
	public Apptest1(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	@test
	public void test1()
	{
		System.out.println("Junit testing for bamboo build");
	}

}
