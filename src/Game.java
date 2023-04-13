import java.util.HashMap;
import java.util.Map;

public class Game {
    public static void run() {
        System.out.println("Initializing");
        Player player = new Player();

        Map<String, Room> rooms = new HashMap<>();

        // Add rooms and exits

        rooms.put("room1", new Room("Room 1", "First Room"));
        rooms.put("room2", new Room("Room 2", "Second Room"));

        rooms.get("room1").addExit("secret tunnel", rooms.get("room2"));

        // Setup player w first room

        player.setCurrentRoom(rooms.get("room1"));


        // Game loop

        System.out.println("Running");
        System.out.println("Currently in " + player.getCurrentRoom().getName());
        player.travel(rooms.get("room2"));
        System.out.println("Currently in " + player.getCurrentRoom().getName());

    }
}
