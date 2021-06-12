import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void shouldCalculateRectangleeArea () {
        //given
        Rectangle testRectangle = new Rectangle(4,5);
        //when
        double testRectangleArea = testRectangle.getArea();
        //then
        Assertions.assertEquals(20,testRectangleArea);

    }
    @Test
    void shouldCalculateRectanglePerimeter() {
//given
        Rectangle testRectangle = new Rectangle(4,5);
        //when
        double testRectanglePerimeter = testRectangle.getPerimeter();
        //then
        Assertions.assertEquals(18,testRectanglePerimeter);
    }
}