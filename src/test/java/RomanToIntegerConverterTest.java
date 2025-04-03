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
}
