import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    public void shouldCalculateTriangleArea () {
        //given
        Triangle testTriangle = new Triangle(4,5,6,7);
        //when
        double testTriangleArea = testTriangle.getArea();
        //then
        Assertions.assertEquals(14,testTriangleArea);

    }
    @Test
    void shouldCalculateTrianglePerimeter() {
//given
        Triangle testTriangle = new Triangle(4,5,6,7);
        //when
        double testTrianglePerimeter = testTriangle.getPerimeter();
        //then
        Assertions.assertEquals(15,testTrianglePerimeter);
    }
}