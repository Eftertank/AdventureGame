import java.util.Scanner;

/*public class Game {
    static Player player = new Player();
    static Vault v = new Vault();
    static Parser p = new Parser();

    public static void run() {
        System.out.println("Initializing");

        // Setup player w first room

        player.setCurrentRoom(Vault.getRooms().get("room1"));
        System.out.println(player.getCurrentRoom().toString());

        // Game loop
        while(player.isAlive){


        System.out.println("Input>");
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        System.out.println(Parser.in(input));

        if(input.equals("quit")){
            player.isAlive=false;
        }

        }
    }

}*/

public class Game {
    static Player player = new Player();
    static Vault v = new Vault();
    static Parser p = new Parser();

    public static void run() {
        try {
            System.out.println("Initializing");

            // Setup player w first room
            player.setCurrentRoom(Vault.getRooms().get("room1"));
            System.out.println(player.getCurrentRoom().toString());

            // Game loop
            while (player.isAlive) {
                System.out.println("Input>");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();

                // Check if input is null or empty
                if (input == null || input.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be null or empty.");
                }

                System.out.println(Parser.in(input));

                if (input.equals("quit")) {
                    player.isAlive = false;
                }
            }
        } catch (NullPointerException e) {
            // Log the exception message
            System.out.println("Encountered null pointer exception: " + e.getMessage());
        }
    }
}
