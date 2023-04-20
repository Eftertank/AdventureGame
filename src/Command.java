import java.util.function.Consumer;

public class Command {
    private Consumer<String> action;

    public Command(Consumer<String> action) {
        this.action = action;
    }

    public void execute(String input) {

        action.accept(input);
    }
}
