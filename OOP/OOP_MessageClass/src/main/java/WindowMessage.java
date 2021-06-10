public class WindowMessage extends Message {

    @Override
    public String getMessage() {
        return "This is class " + this.Name;
    }

    public WindowMessage(String name) {
        this.Name = name;
    }
}