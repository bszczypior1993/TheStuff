import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

class SeasonCheckTest {
    @ParameterizedTest
   //given
    @CsvSource(value = {"1:Winter", "2:Winter", "3:Spring", "4:Spring", "5:Spring", "6:Summer", "7:Summer", "8:Summer", "9:Fall", "10:Fall", "11:Fall", "12:Winter"}, delimiter = ':')
    @NullAndEmptySource
    void getSeason(int input, String expected) {
    //when
        String actualSeason = SeasonCheck.getSeason(input);
    //then
        Assertions.assertEquals(actualSeason, expected);
    }
}