import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "ts"})
    void testCase1(String args){
        Assertions.assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 1})
    void testCase2(int num){
        Assertions.assertEquals(0, num % 3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "JS", "ts"})
    @EmptySource
    @NullSource
    @NullAndEmptySource
    void testCase3(String args){
        Assertions.assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg){
        Assertions.assertNotNull(arg);
    }

    static String[] stringProvider(){
        return new String[]{"Java", "JS", "TS"};
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "2,2,2", "0,0,0"})
    void testCase5(int num1, int num2, int result){
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv", numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result){
        Assertions.assertEquals(result, Calculator.add(num1, num2));
    }
}
