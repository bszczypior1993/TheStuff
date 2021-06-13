import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    public void shouldCalculateCircleArea() {
    //given
        Circle circleTest = new Circle(4);

    //when
        double circleTestResult = circleTest.getArea();

    //then
        Assertions.assertEquals(50.27, circleTestResult);

    }
    @Test
    public void shouldCalculateCirclePerimeter() {
        //given
        int radius = 4;
        double PI = 3.14;
        Circle circleTest = new Circle(4);

        //when
        double testCirclePerimeter = circleTest.getPerimeter();
        //then
        Assertions.assertEquals(25.12, testCirclePerimeter);
    }
}