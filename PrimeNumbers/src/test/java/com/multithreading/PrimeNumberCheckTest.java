package com.multithreading;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PrimeNumberCheckTest 
{
	PrimeNumberCheck primeObject = new PrimeNumberCheck();

	@Test
	public void shouldAnswerWithTrueIfPrime()
	{
		assertEquals( true , primeObject.CheckForPrime(29));
	}

	@Test
	public void shouldAnswerWithFalseIfNotPrime()
	{
		assertEquals( false , primeObject.CheckForPrime(25));
	}
}
