import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RightTriangleTest {
    @Test
    public void testShouldCheckIfTriangleIsRight(){
        //given
        int sideA = 4;
        int sideB = 3;
        int sideC = 5;

        //when
        boolean verificationResult = RightTriangle.isTriangleRight(sideA, sideB, sideC);

        //then
        Assertions.assertEquals(true, verificationResult);

    }

}