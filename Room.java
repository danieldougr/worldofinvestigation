
import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. For reuse in "WoI" we
 * adapt its methods and use its properties.
 *
 * A "Room" represents one location in the scenery of the game. It is connected
 * to other rooms via exits. For each existing exit, the room stores a reference
 * to the neighboring room.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 * @secondaryAuthor Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class Room {

    private final String description;
    private final HashMap<String, Room> exits;        // stores exits of this room.
    private final ArrayList<Item> itens;
    private boolean chosen;

    /**
     * Create a room described "description". Initially, it has no exits.
     * "description" is something like "a kitchen" or "an open court yard".
     *
     * @param description The room's description.
     */
    public Room(String description) {
        this.description = description;
        exits = new HashMap<>();
        itens = new ArrayList<>();
        chosen = false;
    }

    /**
     * Define an exit from this room.
     *
     * @param direction The direction of the exit.
     * @param neighbor The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    /* >>> OUT OF USE METHOD <<<       
    public void addItem(String name, String description, double weight) {
       if (weight > 10) {
           HeavyItem item = new HeavyItem(name, description, weight);
           itens.add(item);
       } else {
          LightItem item = new LightItem(name, description, weight);
            itens.add(item);
        }
    } */
    
    public void addItem(Item item) {
        itens.add(item);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setChosen(String item) {
        for (Item choseItem : getItens()) {
            if (choseItem.getName().equals(item)) {
                choseItem.setChosen();
            }
        }
    }

    /**
     * @return The short description of the room (the one that was defined in
     * the constructor).
     */
    public String getShortDescription() {
        return description;
    }

    /**
     * Return a description of the room in the form: You are in the kitchen.
     * Exits: north west
     *
     * @param wordLocation parameters for language.
     * @param wordExit parameters for language.
     * @param wordYouSee parameters for language.
     * @param wordWeight parameters for language.
     * @return A long description of this room.
     */
    public String getLongDescription(String wordLocation, String wordExit, String wordYouSee, String wordWeight) {
        String details = wordLocation + description + ".\n" + wordExit + getExitString();

        for (Item item : itens) {
            details += "\n" + item.getDetails(wordYouSee, wordWeight);
        }
        return details;
    }

    /**
     * Return a string describing the room's exits, for example "Exits: north
     * west".
     *
     * @return Details of the room's exits.
     */
    private String getExitString() {
        String returnString = "";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            String treatmentString = "";
            treatmentString += exit.charAt(0);
            treatmentString = treatmentString.toUpperCase();
            for (int i = 1; i < exit.length(); i++) {
                treatmentString += exit.charAt(i);
            }
            returnString += "   " + treatmentString;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     *
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public boolean getChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }
    
    public void removeItem(Item item) {
    itens.remove(item);
    }
}
