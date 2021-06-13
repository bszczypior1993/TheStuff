public class Triangle extends Shape{

    protected int sideA;
    protected int sideB;
    protected int sideC;
    protected int height;

    protected Triangle (int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (this.sideA * this.height)/2;

    }
    @Override
    public double getPerimeter(){
        return this.sideA + this.sideB + this.sideC;
    }
}
