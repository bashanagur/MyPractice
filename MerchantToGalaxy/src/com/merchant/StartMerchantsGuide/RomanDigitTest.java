package com.merchant.StartMerchantsGuide;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class RomanDigitTest {
         
	@Test
	void convertRomanDigitValidForL() {
		int currentDigit = RomanDigit.convertRomanNumber("l");
		System.out.println(currentDigit);
		assertEquals(currentDigit, 50, "l value must be 50");
	}
	@Test
	void convertRomanDigitValidForM() {
		int currentDigit = RomanDigit.convertRomanNumber("m");
		System.out.println(currentDigit);
		assertEquals(currentDigit, 1000, "m value must be 1000");
	}

/*	@Test
	void convertRomanDigitValidForNull() {
		int currentDigit = RomanDigit.convertRomanNumber("d");
		System.out.println(currentDigit);
		
		RomanDigit value = RomanDigit.valueOf("glob");
		Assert.assertNull(value);
		
	}
	*/
}