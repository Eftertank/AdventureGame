import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room extends Thing {
    private Map<String, Room> exits;
    private Map<String, Command> commands;
    private List<String> dirs;

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
        this.dirs = new ArrayList<>();
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
        dirs.add("north");
        commands.put("east", new Command(this::east));
        dirs.add("east");
        commands.put("south", new Command(this::south));
        dirs.add("south");
        commands.put("west", new Command(this::west));
        dirs.add("west");






    }
    public void addCommand(String string,Command command){
        commands.put(string,command);
    }

// Commands ///////////////////////////////////////////////////////
    private void go(List<String> input) {
        System.out.println("This triggers the go command");
        String output = "string";
        for (int i = 1; i < input.size(); i++) {
            System.out.println("for loop started string var is "+ input);
            switch (input.get(i)){
                case "north":output="east";
                case "east":output="east";
                case "south":output="south";
                case "west":output="west";
            }

        }
        System.out.println("For loop ended");
    }
    private void north(List<String> input) {
        System.out.println("This triggers the north command");
    }
    private void east(List<String> input) {
        System.out.println("This triggers the east command");
    }
    private void south(List<String> input) {
        System.out.println("This triggers the south command");
    }
    private void west(List<String> input) {
        System.out.println("This triggers the west command");
    }
    private void no(List<String> input) {
        System.out.println("No such command");
    }
    private void quit(List<String> input) {
        System.out.println("Goodbye");
    }

}
