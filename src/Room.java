import java.util.HashMap;
import java.util.Map;

public class Room extends Thing {
    private Map<String, Room> exits;

    public Room(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.exits = new HashMap<>();
    }

    public void addExit(String path, Room room) {

        exits.put(path, room);
    }

    public Room getExit(String path) {

        return exits.get(path);

    }
}
