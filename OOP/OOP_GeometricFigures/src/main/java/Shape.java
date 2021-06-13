public abstract class Shape {

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(3, 4, 5, 4);
        Square square = new Square (4);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Triangle area = " + triangle.getArea());
        System.out.println("Triangle perimeter = " + triangle.getPerimeter());
        System.out.println("Square area = " + square.getArea());
        System.out.println("Square perimeter = " + square.getPerimeter());
        System.out.println("Circle area = " + circle.getArea());
        System.out.println("Circle perimeter = " + circle.getPerimeter());
        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Rectangle perimeter = " + rectangle.getPerimeter());
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
