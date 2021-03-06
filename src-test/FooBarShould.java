import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarShould {
    @ParameterizedTest
    @CsvSource({"1,1", "2,2","3,FooFoo", "5,BarBar","6, Foo","7, " +
            "QixQix","10,Bar","13, Foo", "14,Qix", "15, FooBarBar", "21, FooQix"})
    void convert(int number, String expected){
        assertEquals(expected, FooBar.convert(number));
    }

}
