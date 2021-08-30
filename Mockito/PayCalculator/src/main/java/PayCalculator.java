public class PayCalculator {

    private int singleBonus;
    private BasicSalary basicSalary;
    private SaturdayBonus saturdayBonus;

    public int calculateSalary(int saturdaysWorked) {
        return basicSalary.returnBasicSalary() + singleBonus + (saturdayBonus.returnSaturdayBonus()*saturdaysWorked);
    }

    public PayCalculator(BasicSalary basicSalary, int singleBonus, SaturdayBonus saturdayBonus) {
        this.basicSalary = basicSalary;
        this.singleBonus = singleBonus;
        this.saturdayBonus = saturdayBonus;
    }

}