public class Triangle implements Shape {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,3,4,5);
        System.out.println("Triangle area = " + triangle.getArea());
        System.out.println("Triangle perimeter = " + triangle.getPerimeter());
    }
    int base;
    int sideA;
    int sideB;
    int height;

    protected Triangle(int base, int sideA, int sideB, int height) {
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }
        public double getArea(){
            return (this.base * this.height / 2);
        }
        public double getPerimeter(){
        return (this.base + this.sideA + this.sideB);
      }
    }
