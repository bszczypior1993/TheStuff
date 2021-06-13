public class Rectangle extends Square{

    protected int sideB;

    protected Rectangle (int sideA, int sideB) {
        super(sideA);
        this.sideB = sideB;
    }
    @Override
    public double getArea() {
        return (this.sideA * this.sideB);
    }

@Override
    public double getPerimeter(){
        return this.sideA + this.sideA  + this.sideB + this.sideB;
    }
}