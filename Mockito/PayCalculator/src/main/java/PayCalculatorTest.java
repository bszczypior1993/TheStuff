import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
class PayCalculatorTest {

    @Test
    void shouldTestIfSalaryCalculatorIsWorkingCorrectly() {
        //given
        BasicSalary mockedBasicSalary = Mockito.mock(BasicSalary.class);
        SaturdayBonus mockedSaturdayBonus = Mockito.mock(SaturdayBonus.class);
        Mockito.when(mockedBasicSalary.returnBasicSalary()).thenReturn(2);
        Mockito.when(mockedSaturdayBonus.returnSaturdayBonus()).thenReturn(1);
        PayCalculator testPayCalculator = new PayCalculator(mockedBasicSalary, 1, mockedSaturdayBonus);
        //when
        int totalSalary = testPayCalculator.calculateSalary(50);
        //then
        Assertions.assertEquals(totalSalary, 53);
    }
}