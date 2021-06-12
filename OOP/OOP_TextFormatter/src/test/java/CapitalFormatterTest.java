import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CapitalFormatterTest {

    @Test
    public void testShouldReturnTextInCapitalLetters(){

    //given
      CapitalFormatter testCapitalFormatter = new CapitalFormatter("Testing out the method");
    //when
        String testResult = testCapitalFormatter.formatText(testCapitalFormatter.text);
    //then
        Assertions.assertEquals("TESTING OUT THE METHOD", testResult);
    }
}