package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        //given
        int firstNumber = 1;
        int secondNumber = 2;
        //when
        int addResult = Calculator.add(firstNumber, secondNumber);
        //then
        Assertions.assertEquals(3, addResult);
    }

    @Test
    public void testDeduct() {
        //given
        int firstNumber = 2;
        int secondNumber = 1;
        //when
        int deductResult = Calculator.deduct(firstNumber, secondNumber);
        //then
        Assertions.assertEquals(1, deductResult);
    }

    @Test
    public void testMultiply() {
        //given
        int firstNumber = 2;
        int secondNumber = 3;
        //when
        int multiplyResult = Calculator.multiply(firstNumber, secondNumber);
        //then
        Assertions.assertEquals(6, multiplyResult);
    }

    @Test
    public void testDivide() {
        //given
        int firstNumber = 6;
        int secondNumber = 2;
        //when
        int divideResult = Calculator.divide(firstNumber, secondNumber);
        //then
        Assertions.assertEquals(3, divideResult);
    }
}