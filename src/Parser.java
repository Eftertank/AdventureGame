
import java.util.List;

public class Parser {
    public static void parse(String input) {
        input = input.toLowerCase();
        Command command = Game.player.getCurrentRoom().getCommands().get(input);
        if (command == null) {
            System.out.println("No such command");
            return;
        }
        command.execute(input);
    }
}
