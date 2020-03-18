package com.merchant.StartMerchantsGuide;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanValidatorTest {
         
	@Test
	void convertRomanValidatorForNoI() throws Exception {
		int currentvalidator = RomanValidator.validateRoman("i");
		System.out.println(currentvalidator);
		assertEquals(currentvalidator, 50, "wrong I value");
	}
	
	@Test
	void convertRomanValidatorForI() throws Exception {
		int currentvalidator = RomanValidator.validateRoman("i");
		System.out.println(currentvalidator);
		assertEquals(currentvalidator, 1, "I value must be 1");
	}
	
	@Test
	void convertRomanValidatorForM() {
		int currentvalidator = RomanDigit.convertRomanNumber("m");
		System.out.println(currentvalidator);
		assertEquals(currentvalidator, 1000, "M value must be 1000");
	}

}