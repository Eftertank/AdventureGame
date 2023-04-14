
import java.lang.constant.Constable;
import java.util.List;
import java.util.Scanner;

public class Parser {
    public Parser(Room room) {
    }
//method figuring how many arguments that were used and redirects the string accordingly

    static String in(String input) {

        List<String> list = List.of(input.trim().split("\\s+"));

        if (list.size() == 2) {

        }
        return strVerbAdjective(list);
    }

    // switch method dealing with simple verb/adjective commands.
    static String strVerbAdjective(List<String> list) {
        switch (list.get(0)) {
            case "go":
                switch (list.get(1)) {
                    case "north":
                        return "You walk north";
                    case "south":
                        return "You walk south";


                }
        }
return "unknown command";
    }
}
