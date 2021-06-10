package EvenOrOdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class EvenOrOddTest {
    @Test
    public void testShouldVerifyIfEvenNumber() {
        //given
        int number = 9;
        //when
        boolean verificationResult = EvenOrOdd.isEven(number);
        //then
        Assertions.assertEquals(false, verificationResult);
    }
}