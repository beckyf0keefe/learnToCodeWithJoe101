import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void Convert1(){
        assertConvert(1, "1");
    }

    @Test
    public void Convert2(){
        assertConvert(2, "2");
    }

    @Test
    public void Convert3(){
        assertConvert(3, "Fizz");
    }

    @Test
    public void Convert5(){
        assertConvert(5,"Buzz");
    }

    

    private void assertConvert(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }
}
