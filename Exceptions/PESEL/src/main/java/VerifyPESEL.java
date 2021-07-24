public class VerifyPESEL {
    public static void main(String args[]) {

        String PESEL = "93112706569";
        try {
            isDataTypeCorrect(PESEL);
        } catch (WrongTypeOfDataException e) {
            e.printStackTrace();
        }
        try {
            isTextLengthCorrect(PESEL);
        } catch (IllegalLengthException e) {
            e.printStackTrace();
        }
    }

    public static void isDataTypeCorrect(Object PESEL) throws WrongTypeOfDataException {
        if (PESEL.getClass().getSimpleName().equals("String")) {
            return;
        } else throw new WrongTypeOfDataException();
    }

    public static void isTextLengthCorrect(String PESEL) throws IllegalLengthException {
        if (PESEL.length() == 11) {
            return;
        } else throw new IllegalLengthException();
    }
}
