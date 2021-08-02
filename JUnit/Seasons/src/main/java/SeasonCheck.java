import java.time.Month;

public class SeasonCheck {
    public static void main(String[] args) {
        System.out.println(SeasonCheck.getSeason(3));
    }

    public static String getSeason(int monthNum) {

        switch (String.valueOf(Month.of(monthNum))) {
            case "MARCH":
            case "APRIL":
            case "MAY": {
                return "Spring";
            }
            case "JUNE":
            case "JULY":
            case "AUGUST": {
                return "Summer";
            }
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER": {
                return "Fall";
            }
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY": {
                return "Winter";
            }
            default:
                return "There is no such month";
        }
    }
}