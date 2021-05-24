package AgeVerifier;

public class AgeVerify {
    public static void main(String[] args) {
        System.out.println(ageVer(18));
    }

    public static String ageVer(int ageInput) {
        String result = "";
        {
            if (ageInput >= 18) {
                result = "verified";
            } else
                result = "too young";
        }
        return result;
    }
}