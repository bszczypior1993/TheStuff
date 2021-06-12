public class BillCalculator
{
    public String calculate (double bill, double serviceFee) {
        return ("The bill is " + (bill + serviceFee));
    }
    public String calculate (double bill, double serviceFee, double discount){
        return ("The bill is " + (bill + serviceFee - discount));
    }
    public String calculate (double bill, double serviceFee, int packagingFee){
        return ("The bill is " + (bill + serviceFee + packagingFee));
    }
    public static void main(String[] args){
        BillCalculator billCalculator = new BillCalculator();
        System.out.println(billCalculator.calculate(3,56));
        System.out.println(billCalculator.calculate(23.12, 23.12, 10.32));
        System.out.println(billCalculator.calculate(3.43,2.23,4));
    }

}
