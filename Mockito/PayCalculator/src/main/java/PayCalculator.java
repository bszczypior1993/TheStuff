public class PayCalculator {

    int singleBonus;
    int saturdaysWorked;
    BasicSalary basicSalary;
    SaturdayBonus saturdayBonus;

    public int salaryCalculator() {
        return basicSalary.returnBasicSalary() + singleBonus + (saturdayBonus.returnSaturdayBonus()*saturdaysWorked);
    }

    public BasicSalary getBasicSalary() {
        return basicSalary;
    }

    public SaturdayBonus getSaturdayBonus() {
        return saturdayBonus;
    }

    public PayCalculator(BasicSalary basicSalary, int singleBonus, SaturdayBonus saturdayBonus, int saturdaysWorked) {
        this.basicSalary = basicSalary;
        this.singleBonus = singleBonus;
        this.saturdayBonus = saturdayBonus;
        this.saturdaysWorked = saturdaysWorked;
    }

}