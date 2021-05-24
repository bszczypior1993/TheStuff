package DayVerify;

public class DayVerify {

    public static void main(String[] args) {
        System.out.println(dayVer(18));
    }

    public static String dayVer(int dayInput) {
        String result = "";
        {
            if (dayInput == 1) {
                result = "Monday";
            } else if (dayInput == 2){
                result = "Tuesday";
        }
            else if (dayInput == 3){
                result = "Wednesday";
            }
            else if (dayInput == 4){
                result = "Thursday";
            }
            else if (dayInput == 5){
                result = "Friday";
            }
            else if (dayInput == 6 || dayInput == 7){
                result = "Weekend";
            }
            else result = "There is no such a day!";
        }
        return result;}

    }
