import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerConverterTest {
    
    @Test
    void testSingleDigits() {
        assertEquals(1, RomanToIntegerConverter.fromRoman("I"));
        assertEquals(5, RomanToIntegerConverter.fromRoman("V"));
        assertEquals(10, RomanToIntegerConverter.fromRoman("X"));
    }

    @Test
    void testBasicNumbers() {
        assertEquals(50, RomanToIntegerConverter.fromRoman("L"));
        assertEquals(100, RomanToIntegerConverter.fromRoman("C"));
        assertEquals(500, RomanToIntegerConverter.fromRoman("D"));
        assertEquals(1000, RomanToIntegerConverter.fromRoman("M"));
    }

    @Test
    void testComplexNumbers() {
        assertEquals(9, RomanToIntegerConverter.fromRoman("IX"));
        assertEquals(44, RomanToIntegerConverter.fromRoman("XLIV"));
        assertEquals(99, RomanToIntegerConverter.fromRoman("XCIX"));
        assertEquals(1987, RomanToIntegerConverter.fromRoman("MCMLXXXVII"));
    }

    @Test
    void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> RomanToIntegerConverter.fromRoman(null));
        assertThrows(IllegalArgumentException.class, () -> RomanToIntegerConverter.fromRoman(""));
        assertThrows(IllegalArgumentException.class, () -> RomanToIntegerConverter.fromRoman("IIII"));
        assertThrows(IllegalArgumentException.class, () -> RomanToIntegerConverter.fromRoman("ABC"));
    }
     @Test
    void testSingleDigitI() {
        assertEquals(1, RomanToIntegerConverter.fromRoman("I"));
    }

    @Test
    void testSingleDigitV() {
        assertEquals(5, RomanToIntegerConverter.fromRoman("V"));
    }

    @Test
    void testSingleDigitM() {
        assertEquals(1000, RomanToIntegerConverter.fromRoman("M"));
    }

    @Test
    void testSubtractiveNotation() {
        assertEquals(90, RomanToIntegerConverter.fromRoman("XC"));
        assertEquals(400, RomanToIntegerConverter.fromRoman("CD"));
    }

    @Test
    void testMultipleSameLetters() {
        assertEquals(3, RomanToIntegerConverter.fromRoman("III"));
        assertEquals(20, RomanToIntegerConverter.fromRoman("XX"));
    }

    @Test
    void testMixedNotation() {
        assertEquals(1994, RomanToIntegerConverter.fromRoman("MCMXCIV"));
        assertEquals(58, RomanToIntegerConverter.fromRoman("LVIII"));
    }
    @Test
    void testInvalidEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> RomanToIntegerConverter.fromRoman(""));
    }

    @Test
    void testInvalidNullInput() {
        assertThrows(IllegalArgumentException.class, () -> RomanToIntegerConverter.fromRoman(null));
    }

    @Test
    void testInvalidRepeatedSubtractive() {
        assertThrows(IllegalArgumentException.class, () -> RomanToIntegerConverter.fromRoman("VX"));
    }

    @Test
    void testInvalidRandomLetters() {
        assertThrows(IllegalArgumentException.class, () -> RomanToIntegerConverter.fromRoman("ABCD"));
    }
}
