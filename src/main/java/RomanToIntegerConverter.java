import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerConverter {
    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int fromRoman(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            int value = romanMap.getOrDefault(c, -1);

            if (value == -1) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
            }

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("MCMLXXXVII in Arabic: " + fromRoman("MCMLXXXVII"));
    }
}
