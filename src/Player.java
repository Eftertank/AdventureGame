public class Player {
    public boolean isAlive = true;
    private Room currentRoom;
public Room getCurrentRoom() {
    return currentRoom;
}
    public void travel(Room newRoom){
        currentRoom = newRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
