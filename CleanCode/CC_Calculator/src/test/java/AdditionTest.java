import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AdditionTest {

    @Test
    public void testShouldAddTwoValuesToEachOther() {
        //given
        Addition testAddition = new Addition(3.45,1.54);
        //when
        double testAdditionResult = testAddition.calculation();
        //then
        Assertions.assertEquals(4.99, testAdditionResult);

    }
}