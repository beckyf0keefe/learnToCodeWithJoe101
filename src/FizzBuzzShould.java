import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void Convert1(){
        assertConvert(1);
    }

    @Test
    public void Convert2(){
        assertConvert(2);
    }

    @Test
    public void Convert3(){
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    private void assertConvert(int number) {
        assertEquals(String.valueOf(number), fizzBuzz.convert(number));
    }
}
