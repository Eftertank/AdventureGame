
import java.util.List;

public class Parser {
    public Parser() {
    }

    static Command in(String input) {

        input = input.toLowerCase();

        List<String> list = List.of(input.trim().split("\\s+"));

        for (String string : list) {
            if (Vault.commands.containsKey(string)){
                return Vault.commands.get(string);

            }


        }

        return Vault.commands.get("no");
    }
}
