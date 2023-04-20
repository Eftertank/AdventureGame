
import java.util.List;

public class Parser {
    public static void parse(String input) {
        Command command = Vault.commands.get(input);
        if (command == null) {
            System.out.println("No such command");
            return;
        }
        command.execute(input);
    }
}
