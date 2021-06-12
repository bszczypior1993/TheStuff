public class Square extends Shape{

    protected int sideA;

    protected Square (int sideA) {

        this.sideA = sideA;
    }
    @Override
    public double getArea() {

        return (this.sideA * this.sideA);
    }
@Override
    public double getPerimeter() {
        return this.sideA * 4;
    }
}
