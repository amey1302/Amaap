package org.amaap.decimaltonumeral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralTest {
    RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    void shouldReturnExpectedRomanNumeralForGivenInteger() throws InvalidNumberException {

        assertEquals("I",romanNumeral.convert(1));
        assertEquals("II",romanNumeral.convert(2));
        assertEquals("III",romanNumeral.convert(3));
        assertEquals("IV",romanNumeral.convert(4));
        assertEquals("V",romanNumeral.convert(5));
        assertEquals("VI",romanNumeral.convert(6));
        assertEquals("VII",romanNumeral.convert(7));
        assertEquals("VIII",romanNumeral.convert(8));
        assertEquals("IX",romanNumeral.convert(9));
        assertEquals("X",romanNumeral.convert(10));
        assertEquals("XI",romanNumeral.convert(11));
        assertEquals("XII",romanNumeral.convert(12));
        assertEquals("XIII",romanNumeral.convert(13));
        assertEquals("XVI",romanNumeral.convert(16));
        assertEquals("XVII",romanNumeral.convert(17));
        assertEquals("XVIII",romanNumeral.convert(18));
        assertEquals("XXI",romanNumeral.convert(21));
        assertEquals("XL",romanNumeral.convert(40));
        assertEquals("LI",romanNumeral.convert(51));
        assertEquals("XC",romanNumeral.convert(90));
        assertEquals("DCCCI",romanNumeral.convert(801));
        assertEquals("CM",romanNumeral.convert(900));
       assertEquals("MMMDXLIX",romanNumeral.convert(3549));
       assertEquals("MMMM",romanNumeral.convert(4000));


    }
    @Test
    void shouldThrowExceptionForIntegerLessThanEqualToZero(){
        assertThrows(InvalidNumberException.class,() -> {
            romanNumeral.convert(-1);
            romanNumeral.convert(0);
        });
    }

}
