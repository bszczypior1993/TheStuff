public class ConsoleMessage extends Message {

    @Override
    public String getMessage() {
        return "This is class " + this.Name;
    }

    public ConsoleMessage(String name) {
        this.Name = name;
    }
}
