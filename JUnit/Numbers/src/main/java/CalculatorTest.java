import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {

    @ParameterizedTest
    @ValueSource(ints = {6, 3445, 865, 1})
    void shouldCheckIfNumberIsDividableByTwo(int input) {
        Assertions.assertTrue(Calculator.isDividableByTwo(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"543:11", "23:5", "45432:18"}, delimiter = ':')
    void sumDigits(int input, int expected) {
        int actualValue = Calculator.sumDigits(input);
        Assertions.assertEquals(actualValue, expected);
    }
}