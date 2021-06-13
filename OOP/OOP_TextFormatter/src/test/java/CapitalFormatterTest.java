import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapitalFormatterTest {

    @Test
    public void testShouldReturnTextInCapitalLetters(){

    //given
        String testText = "testing out the method";
        CapitalFormatter testCapitalFormatter = new CapitalFormatter();
        //when
        String testResult = testCapitalFormatter.formatText(testText);
    //then
        Assertions.assertEquals("TESTING OUT THE METHOD", testResult);
    }
}