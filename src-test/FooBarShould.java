import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarShould {
    @Test
    void convert1 (){
        assertEquals("1",FooBar.convert(1));
    }

    @Test
    void convert2 () {
        assertEquals("2", FooBar.convert(2));
    }

    @Test
    void convert3(){
        assertEquals("FooFoo", FooBar.convert(3));
    }
}
