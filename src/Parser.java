import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parser {
    public static void parse(String rawInput) {
        rawInput = rawInput.toLowerCase().trim();

        // Check if the whole input is a valid command
        if (Game.player.getCurrentRoom().getCommands().containsKey(rawInput)) {
            Command command = Game.player.getCurrentRoom().getCommands().get(rawInput);
            command.execute(Collections.emptyList());
            return;
        }

        List<String> input = cleanString(rawInput);

        // Check if the first word is a valid command
        if (Game.player.getCurrentRoom().getCommands().containsKey(input.get(0))) {
            Command command = Game.player.getCurrentRoom().getCommands().get(input.get(0));
            command.execute(input);
        } else {
            // Handle invalid command
            System.out.println("Invalid command: " + rawInput);
        }
    }

    private static List<String> cleanString(String rawInput) {
        return List.of(rawInput.trim().split("\\s+"));
    }
}
