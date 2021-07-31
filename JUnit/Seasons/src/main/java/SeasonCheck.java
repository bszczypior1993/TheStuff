import java.time.Month;

public class SeasonCheck {
    public static void main(String[] args) {
        System.out.println(SeasonCheck.getSeason(4));
    }

    public static String getMonth(int monthNum) {
        return String.valueOf(Month.of(monthNum));
    }

    public static String getSeason(int monthNum) {
        if ((getMonth(monthNum) == "APRIL") || (getMonth(monthNum) == "MARCH") || (getMonth(monthNum) == "MAY")) {
            return "Spring";
        } else if ((getMonth(monthNum) == "JUNE") || (getMonth(monthNum) == "JULY") || (getMonth(monthNum) == "AUGUST")) {
            return "Summer";
        } else if ((getMonth(monthNum) == "SEPTEMBER") || (getMonth(monthNum) == "OCTOBER") || (getMonth(monthNum) == "NOVEMBER")) {
            return "Fall";
        } else if ((

                getMonth(monthNum) == "DECEMBER") || (

                getMonth(monthNum) == "JANUARY") || (

                getMonth(monthNum) == "FEBRUARY")) {
            return "Winter";
        } else {
            return "there is no such month";
        }
    }
}
