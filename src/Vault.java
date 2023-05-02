import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Vault {
    public static Map<String, Room> getRooms() {
        return rooms;
    }
    public static void setRooms(Map<String, Room> rooms) {
        Vault.rooms = rooms;
    }
    static Map<String, Room> rooms = new HashMap<>();
    static void Archive() {

// Rooms
        rooms.put("room1", new Room("Room 1", "First Room"));

        rooms.put("room2", new Room("Room 2", "Second Room"));

// -- Starter Room --
        rooms.get("room1").addExit("secret tunnel", rooms.get("room2"));
        rooms.get("room1").addExit("r1e1", rooms.get("room2"));
        rooms.get("room1").addCommand("secret tunnel", new Command(Vault::secretTunnel));
    }

// Unique Commands ///////////////////////////////////////////////////////
    private static void secretTunnel(List<String> input) {
        Game.player.travel(rooms.get("room2"));
        System.out.println("You travel through the secret tunnel and arrive at the new destination");
        System.out.println(Game.player.getCurrentRoom().desc);
    }
    }
