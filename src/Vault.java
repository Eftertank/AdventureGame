import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Vault {
    public static Map<String, Room> getRooms() {
        return rooms;
    }

    public static void setRooms(Map<String, Room> rooms) {
        Vault.rooms = rooms;
    }

    public static Map<String, Command> getCommands() {
        return commands;
    }

    public static void setCommands(Map<String, Command> commands) {
        Vault.commands = commands;
    }

    static Map<String, Room> rooms = new HashMap<>();

    static Map<String, Command> commands = new HashMap<>();

    //Adding Stuff

    static void Archive() {

        // Rooms
        rooms.put("room1", new Room("Room 1", "First Room"));
        rooms.put("room2", new Room("Room 2", "Second Room"));

        rooms.get("room1").addExit("secret tunnel", rooms.get("room2"));

        // Commands
        commands.put("no", new Command("no",Vault::no));
        commands.put("quit", new Command("quit",Vault::quit));

        commands.put("go", new Command("go",Vault::go));

        // Exits
        commands.put("secret tunnel", new Command("secret tunnel",Vault::secretTunnel));


    }

    private static void no(String s) {
        System.out.println("No such command");
    }
    private static void quit(String s) {
        System.out.println("Goodbye");
    }
    private static void secretTunnel(String s) {
        Game.player.travel(rooms.get("room2"));
        System.out.println("You travel through the secret tunnel and arrive at the new destination");
        System.out.println(Game.player.getCurrentRoom().desc);

    }
    private static void go(String s) {
        System.out.println("This triggers the go command");

    }
}
