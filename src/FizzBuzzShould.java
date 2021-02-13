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

    private void assertConvert(int i) {
        assertEquals(i, fizzBuzz.convert(i));
    }
}
