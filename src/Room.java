import java.util.HashMap;
import java.util.Map;

public class Room {
    private String name;
    private String desc;
    private Map<String, Room> exits;

    public Room(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.exits = new HashMap<>();
    }

    public void addExit(String path, Room room) {
        exits.put(path, room);
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }
}
