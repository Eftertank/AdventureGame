import java.util.function.Consumer;

public class Command {
    private String name;
    private Consumer<String> action;

    public Command(String name, Consumer<String> action) {
        this.name = name;
        this.action = action;
    }

    public void execute(String input) {
        action.accept(input);
    }
}
