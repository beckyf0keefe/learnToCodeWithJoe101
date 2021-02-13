import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    public void Convert1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(1, fizzBuzz.convert(1));
    }

    @Test
    public void Convert2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(2, fizzBuzz.convert(2));
    }

}
