
import java.util.List;

public class Parser {
    public static void parse(String rawInput) {
        List<String> input = cleanString(rawInput);
        Command command = Game.player.getCurrentRoom().getCommands().get(input.get(1));
        if (command == null) {
            System.out.println("You do nothing");
            return;
        }
        command.execute(input);
    }

    private static List<String> cleanString(String rawInput) {
        rawInput = rawInput.toLowerCase();
        return List.of(rawInput.trim().split("//s"));
    }
}
