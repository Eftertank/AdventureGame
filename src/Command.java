import java.util.List;
import java.util.function.Consumer;

public class Command {
    private Consumer<List<String>> action;

    public Command(Consumer<List<String>> action) {
        this.action = action;
    }

    public void execute(List<String> input ) {

        action.accept(input);
    }
}
