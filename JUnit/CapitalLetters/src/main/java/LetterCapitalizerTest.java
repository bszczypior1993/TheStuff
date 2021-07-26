import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class LetterCapitalizerTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource (strings = {"jeden", "cebula", "KARabIn", "PIES"})
    void shouldMakeLettersCapital(String input) {
        String capitalResult = LetterCapitalizer.capitalizeLetters(input);
        Assertions.assertEquals(capitalResult, input.toUpperCase(Locale.ROOT));

    }
}