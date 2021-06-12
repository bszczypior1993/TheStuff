public class Circle extends Shape {

    protected Circle (int radius) {
        this.radius = radius;
    }

    protected int radius;
    protected final double PI = 3.14;

    @Override
    public double getArea() {
        return (this.PI * this.radius * this.radius);
    }
@Override
    public double getPerimeter(){
        return (2 * this.radius * this.PI);
    }
}
