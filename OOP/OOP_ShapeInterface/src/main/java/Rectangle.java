public class Rectangle implements Shape {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Rectangle perimeter = " + rectangle.getPerimeter());
    }
    int sideA;
    int sideB;

    protected Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea(){
        return (this.sideA * this.sideB / 2);
    }
    public double getPerimeter(){
        return ((this.sideA + this.sideB) * 2);
    }
}
