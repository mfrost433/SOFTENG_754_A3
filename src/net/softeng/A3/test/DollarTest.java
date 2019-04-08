package net.softeng.A3.test;

import org.junit.Test;
import net.softeng.A3.Dollar;

import static org.junit.Assert.assertEquals;

public class DollarTest {
	@Test
	public void testDollarDivision() {
		// Given
		Dollar ten = new Dollar(10);
		// When
		Dollar result = ten.dividedBy(2);

		assertEquals(new Dollar(5), result); // You could change 5 to 4 to see the build failure
	}

	@Test(expected = ArithmeticException.class)
	public void testDollarDividedByZero() {
		// Given
		Dollar ten = new Dollar(10);
		// When
		ten.dividedBy(0);
	}
}
