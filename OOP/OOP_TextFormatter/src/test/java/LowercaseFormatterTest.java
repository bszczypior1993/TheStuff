import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowercaseFormatterTest {
    @Test
    public void testShouldReturnTextInLowercaseLetters(){

        //given
        LowercaseFormatter testLowercaseFormatter = new LowercaseFormatter("Testing out the method");
        //when
        String testResult = testLowercaseFormatter.formatText(testLowercaseFormatter.text);
        //then
        Assertions.assertEquals("testing out the method", testResult);
    }

}