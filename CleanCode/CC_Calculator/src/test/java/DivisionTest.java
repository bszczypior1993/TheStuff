import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    public void testShouldDivideTwoValuesByEachOther() {
        //given
        Division testDivision = new Division(8.8, 4.4);
        //when
        double testDivisionResult = testDivision.calculation();
        //then
        Assertions.assertEquals(2, testDivisionResult);
    }
}