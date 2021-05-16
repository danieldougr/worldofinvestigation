
import java.util.ArrayList;

/**
 * The player class is responsible for determining the characteristics that the
 * player has, among them we have the dog's level of happiness, amount of snacks
 * and current player's room.
 *
 * @author Matheus Gouvêa Amaral and Daniel Douglas
 */
public class Player {

    private Room currentRoom;
    private int snacks;
    private int happinesslvl;
    private final ArrayList<LightItem> backpack;
    private double backpackWeight;

    public Player(int snacks, int happinesslvl) {
        currentRoom = null;
        backpack = new ArrayList<>();
        backpackWeight = 0;
        this.snacks = snacks;
        this.happinesslvl = happinesslvl;
    }

    /*
     * set and get the current player's room
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    // add snacks to player.
    public void addSnacks(int snacks) {
        this.snacks += snacks;
    }

    // currently player snacks.
    public int getSnacks() {
        return snacks;
    }

    // decrement player snacks.
    public void decrementSnack() {
        this.snacks--;
    }

    /*
     * add/get and in/decrement the dog's happiness level.
     */
    public void addHappinesslvl(int happinesslvl) {
        this.happinesslvl += happinesslvl;
    }

    public int getHappinesslvl() {
        return happinesslvl;
    }

    public void incrementHappinesslvl() {
        happinesslvl++;
    }

    public void decrementHappinesslvl() {
        if (this.happinesslvl != 0) {
            this.happinesslvl--;
        }
    }

    /**
     * backpack management methods.
     * @param item to be inserted in the backpack.
     * @return 
     */    
    public boolean addItemBackpack(LightItem item) {
        if ((backpackWeight + item.getWeight()) > 10) {
            return false;
        }
        incrementBackpackWeight(item.getWeight());
        backpack.add(item);

        return true;
    }

    public void removeItemBackpack(LightItem item) {
        decrementBackpackWeight(item.getWeight());
        backpack.remove(item);
    }

    public ArrayList<LightItem> getBackpack() {
        return backpack;
    }

    public void incrementBackpackWeight(double weight) {
        backpackWeight += weight;
    }

    public void decrementBackpackWeight(double weight) {
        backpackWeight -= weight;
    }

    public String itensInBackpack(String wordYouSee, String wordWeight) {
        String details = "";
        for (Item item : backpack) {
            details += item.getDetails(wordYouSee, wordWeight) + "\n";
        }
        return details;
    }

    public int getNumItemsInBackpack() {
        return backpack.size();
    }

}
