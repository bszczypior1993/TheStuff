public class Deduction {

    protected double value1;
    protected double value2;

    public Deduction (double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double calculation() {
        return (value1 - value2);
    }
}