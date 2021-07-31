import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextLengthCheckTest {

    @ParameterizedTest
    @MethodSource("provideStringsForCheckingTextLength")
    void shouldVerifyIfStringLengthCalculatedCorrectly(String input, int expected) {
        int actualResult = TextLengthCheck.returnNumberOfCharacters(input);
        Assertions.assertEquals(expected, actualResult);
    }


    private static Stream<Arguments> provideStringsForCheckingTextLength() {
        return Stream.of(
                Arguments.of("jeden", 5),
                Arguments.of("dwa", 3),
                Arguments.of("trzy", 4),
                Arguments.of("cztery", 6)
        );
    }
}