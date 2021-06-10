public abstract class Message {
    public static void main(String[] args)
    {
        WindowMessage windowMessage = new WindowMessage("Window Message");
        ConsoleMessage consoleMessage = new ConsoleMessage ("Console Message");
        System.out.println(windowMessage.getMessage());
        System.out.println(consoleMessage.getMessage());
    }
        public abstract String getMessage();
        public String Name;

    }