import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Game {
    static Player player = new Player();
    static Parser p = new Parser(player.getCurrentRoom());

    public static void run() {

        System.out.println("Initializing");

        Map<String, Room> rooms = new HashMap<>();

        // Add rooms and exits

        rooms.put("room1", new Room("Room 1", "First Room"));
        rooms.put("room2", new Room("Room 2", "Second Room"));

        rooms.get("room1").addExit("secret tunnel", rooms.get("room2"));

        // Setup player w first room

        player.setCurrentRoom(rooms.get("room1"));


        // Game loop
        while(player.isAlive){


        System.out.println("Input>");
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        System.out.println(p.in(input));

        if(input.equals("quit")){
            player.isAlive=false;
        }

        }
    }

}
