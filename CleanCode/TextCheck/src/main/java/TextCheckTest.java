import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextCheckTest {
    @Test
    public void testShouldReturnTrueIfStringIsEmpty(){
        //given
    TextCheck testTextCheck = new TextCheck("Checking if the String is empty");
        //when
        boolean verificationResult = testTextCheck.isEmpty();
        //then
        Assertions.assertEquals(false, verificationResult);
    }
    @Test
    public void testShouldConfirmIfStringIsAPalindrome(){
        //given
        TextCheck testTextCheck = new TextCheck("Kayak");
        //when
        String verificationResult = testTextCheck.palindromeCheck();
        //then
        Assertions.assertEquals("This string is a palindrome", verificationResult);
    }
    @Test
    public void testShouldReturnStringLength(){
        //given
        TextCheck testTextCheck = new TextCheck("trzysta");
        //when
        int verificationResult = testTextCheck.textLength();
        //then
        Assertions.assertEquals(7, verificationResult);
    }

}