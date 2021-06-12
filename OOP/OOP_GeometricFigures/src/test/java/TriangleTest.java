import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    public void shouldCalculateTriangleArea() {
        //given
        Triangle triangleTest = new Triangle(4,3,2,3);

        //when
        double triangleTestResult = triangleTest.getArea();

        //then
        Assertions.assertEquals(6, triangleTestResult);

    }
    @Test
    public void shouldCalculateTrianglePerimeter() {
        //given
        Triangle triangleTest = new Triangle(4,3,2,3);

        //when
        double testTrianglePerimeter = triangleTest.getPerimeter();
        //then
        Assertions.assertEquals(9, testTrianglePerimeter);
    }
}