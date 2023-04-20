import java.util.Scanner;

public class Game {
    static Player player = new Player();
    public static void run() {
        try {
            System.out.println("Initializing");
            Vault.Archive();

            // Setup player w first room
            player.setCurrentRoom(Vault.getRooms().get("room1"));
            System.out.println(player.getCurrentRoom().desc);

            // Game loop
            while(player.isAlive){
                System.out.println("Input>");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                Parser.parse(input);

                if(input.equals("quit")){
                    player.isAlive=false;
                }
            }

        } catch (NullPointerException e) {

            // Log the exception message
            System.out.println("Encountered null pointer exception: " + e.getMessage());
        }
    }
}
