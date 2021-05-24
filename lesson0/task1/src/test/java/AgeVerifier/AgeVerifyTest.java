package AgeVerifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AgeVerifyTest {
@Test
     public void testShouldVerifyIfOverEighteen() {
     //given
     int age = 18;
     //when
     String verificationResult = AgeVerify.ageVer(age);

     //then
     Assertions.assertEquals("verified", verificationResult);

    }

}