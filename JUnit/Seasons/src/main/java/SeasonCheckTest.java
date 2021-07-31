import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class SeasonCheckTest {
    @ParameterizedTest
    @CsvSource(value = {"1:JANUARY", "2:FEBRUARY", "3:MARCH", "4:APRIL", "5:MAY", "6:JUNE", "7:JULY", "8:AUGUST", "9:SEPTEMBER", "10:OCTOBER", "11:NOVEMBER", "12:DECEMBER"}, delimiter = ':')
    @NullAndEmptySource
    void shouldReturnTheMonthAssignedToTheNumber(int input, String expected) {
        String actualMonth = String.valueOf(SeasonCheck.getMonth(input));
        Assertions.assertEquals(actualMonth, expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:Winter", "2:Winter", "3:Spring", "4:Spring", "5:Spring", "6:Summer", "7:Summer", "8:Summer", "9:Fall", "10:Fall", "11:Fall", "12:Winter"}, delimiter = ':')
    @NullAndEmptySource
    void getSeason(int input, String expected) {
        String actualSeason = SeasonCheck.getSeason(input);
        Assertions.assertEquals(actualSeason, expected);
    }
}