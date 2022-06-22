package de.cas.mse.exercise.diamond;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiamondTest {

	@Test
	public void diamond3_shouldPrint() {
		StringBuffer expected = new StringBuffer();
		expected.append(" *\n");
		expected.append("***\n");
		expected.append(" *\n");

        String actual = new DiamondAsciiArtCreator().create(3);
        assertEquals(expected.toString(),actual);
        System.out.println(actual);
	}

	@Test
	public void diamond5_shouldPrint() {
		StringBuffer expected = new StringBuffer();
		expected.append("  *\n");
		expected.append(" ***\n");
		expected.append("*****\n");
		expected.append(" ***\n");
		expected.append("  *\n");

		String actual = new DiamondAsciiArtCreator().create(5);
        assertEquals(expected.toString(),actual);
        System.out.println(actual);
	}

	@Test
	public void diamond0_shouldReturnNull() {
		assertEquals(null, new DiamondAsciiArtCreator().create(0));
	}

	@Test
	public void diamondNegative_shouldReturnNull() {
		assertEquals(null, new DiamondAsciiArtCreator().create(-1));
	}

	@Test
	public void diamondEven_shouldReturnNull() {
		assertEquals(null, new DiamondAsciiArtCreator().create(10));
	}
}
