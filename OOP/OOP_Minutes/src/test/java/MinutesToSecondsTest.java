import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinutesToSecondsTest {
@Test
    public void testShouldCalculateHowManySecondsInMinutes(){
    //given
    int minutes = 5;
    //when
    int verificationResult = MinutesToSeconds.minutesToSeconds(minutes);
    //then
    Assertions.assertEquals(300, verificationResult);
}
}