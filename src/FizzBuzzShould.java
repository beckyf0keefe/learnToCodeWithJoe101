import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @ParameterizedTest
    @CsvSource({ "1, 1", "2, 2", "3, Fizz", "5, Buzz", "6, Fizz", "10, Buzz", "15, FizzBuzz" })
    void convert(int number, String expected) {
        assertConvert(number, expected);
    }

    private void assertConvert(int number, String expected) {
        assertEquals(expected, FizzBuzz.convert(number));
    }

    @Test
    void print1() {
        assertEquals("1", FizzBuzz.print(1));
    }

    @Test
    void printUpTo2() {
        assertEquals("1\n2", FizzBuzz.print(2));
    }

    @Test
    void printUpTo3() {
        assertEquals("1\n2\nFizz", FizzBuzz.print(3));
    }

    @Test
    void printUpTo4() {
        assertEquals("1\n2\nFizz\n4", FizzBuzz.print(4));
    }
}
