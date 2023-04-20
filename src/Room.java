import java.util.HashMap;
import java.util.Map;

public class Room extends Thing {
    private Map<String, Room> exits;
    private Map<String, Command> commands;

    public Map<String, Command> getCommands() {
        return commands;
    }

    public void setCommands(Map<String, Command> commands) {
        this.commands = commands;
    }

    public Room(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.exits = new HashMap<>();
        this.commands = new HashMap<>();
    }

    public void addExit(String string, Room room) {

        exits.put(string, room);
    }

    public Room getExit(String path) {

        return exits.get(path);

    }
    public void Archive() {

        commands.put("no", new Command(this::no));
        commands.put("quit", new Command(this::quit));
        commands.put("go", new Command(this::go));
        commands.put("north", new Command(this::north));
        commands.put("east", new Command(this::east));
        commands.put("south", new Command(this::south));
        commands.put("west", new Command(this::west));

    }
    public void addCommand(String string,Command command){
        commands.put(string,command);
    }

// Commands ///////////////////////////////////////////////////////
    private void go(String s) {
        System.out.println("This triggers the go command");
    }
    private void north(String s) {
        System.out.println("This triggers the north command");
    }
    private void east(String s) {
        System.out.println("This triggers the east command");
    }
    private void south(String s) {
        System.out.println("This triggers the south command");
    }
    private void west(String s) {
        System.out.println("This triggers the west command");
    }
    private void no(String s) {
        System.out.println("No such command");
    }
    private void quit(String s) {
        System.out.println("Goodbye");
    }

}
