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

    @Test
    void convert5() {
        assertEquals("BarBar", FooBar.convert(5));
    }
    @Test
    void convert6() {
        assertEquals("Foo", FooBar.convert(6));
    }
    @Test
    void convert7() {
        assertEquals("QixQix", FooBar.convert(7));
    }
    @Test
    void convert10() {
        assertEquals("Bar", FooBar.convert(10));
    }

}
