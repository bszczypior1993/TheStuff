import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowercaseFormatterTest {
    @Test
    public void testShouldReturnTextInLowercaseLetters(){

        //given
        String testText = "TESTing OuT thE METhoD";
        LowercaseFormatter testLowercaseFormatter = new LowercaseFormatter();
        //when
        String testResult = testLowercaseFormatter.formatText(testText);
        //then
        Assertions.assertEquals("testing out the method", testResult);
    }

}