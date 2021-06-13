import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    public void shouldCalculateSquareArea() {
        //given
        Square squareTest = new Square(4);

        //when
        double squareTestResult = squareTest.getArea();

        //then
        Assertions.assertEquals(16, squareTestResult);

    }
    @Test
    public void shouldCalculateSquarePerimeter() {
        //given
        Square squareTest = new Square(4);

        //when
        double testSquarePerimeter = squareTest.getPerimeter();
        //then
        Assertions.assertEquals(16, testSquarePerimeter);
    }
}