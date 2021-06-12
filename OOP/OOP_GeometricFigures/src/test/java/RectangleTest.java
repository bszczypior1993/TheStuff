import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    public void shouldCalculateRectangleArea() {
        //given
        Rectangle rectangleTest = new Rectangle(4, 3);

        //when
        double rectangleTestResult = rectangleTest.getArea();

        //then
        Assertions.assertEquals(12, rectangleTestResult);

    }
    @Test
    public void shouldCalculateRectanglePerimeter() {
        //given
        Rectangle rectangleTest = new Rectangle(4, 3);

        //when
        double testRectanglePerimeter = rectangleTest.getPerimeter();
        //then
        Assertions.assertEquals(14, testRectanglePerimeter);
    }
}