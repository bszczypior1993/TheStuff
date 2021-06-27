import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class DeductionTest {

    @Test
    public void testShouldDeductTwoValuesFromEachOther() {
        //given
        Deduction testDeduction = new Deduction(3.44, 1.54);
        //when
        double testDeductionResult = testDeduction.calculation();
        //then
        Assertions.assertEquals(1.90, testDeductionResult);
    }
}