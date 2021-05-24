package DayVerify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayVerifyTest {
    @Test
    public void testShouldVerifyTheDayOfTheWeek() {
        //given
        int dayInput = 5;
        //when
        String verificationResult = DayVerify.dayVer(dayInput);
        //then
        Assertions.assertEquals("Friday", verificationResult);
    }
}