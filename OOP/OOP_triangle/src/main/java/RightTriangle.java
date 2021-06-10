public class RightTriangle {

    public static void main (String[]args) throws java.lang.Exception{
            System.out.println(isTriangleRight(3,4, 5));
        }
        public static boolean isTriangleRight(int sideA, int sideB, int sideC){
        boolean isTriangleRight;
            int aSquare = sideA * sideA;
            int bSquare = sideB * sideB;
            int cSquare = sideC * sideC;

            if ((aSquare + bSquare) == cSquare){
                isTriangleRight = true;}
                else {
                    isTriangleRight = false;
                }
                return isTriangleRight;
        }
    }
