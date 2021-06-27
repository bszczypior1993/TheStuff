import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplicationTest {

    @Test
    public void testShouldMultiplyTwoValuesByEachOther() {
        //given
        Multiplication testMultiplication = new Multiplication(3.44, 1.54);
        //when
        double testMultiplicationResult = testMultiplication.calculation();
        //then
        Assertions.assertEquals(5.2976, testMultiplicationResult);
    }

}