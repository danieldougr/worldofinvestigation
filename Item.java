
/**
 * Item abstract class  referring to the items that will be created in the game.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public abstract class Item {

    private String name;
    private String description;
    private double weight;
    private boolean chosen;
    private int snacks;

    /*
     * receives parameters for item class
     */
    public Item(String name, String description, double weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.chosen = false;
        this.snacks = 0;
    }

    // declare the item
    public Item(String name) {
        this.name = name;
    }

    // @return details of item
    public String getDetails(String youSee, String weight) {
        return youSee + name + ", " + description + ", " + weight + this.weight + " kg.";
    }

    // set the chosen item
    public void setChosen() {
        chosen = true;
    }

    // get the chosen item
    public boolean getChosen() {
        return chosen;
    }

    // get the name of item
    public String getName() {
        return name;
    }

    // items that have snacks
    public int getSnacksInItem() {
        return snacks;
    }

    // set the quantity of snacks in the item
    public void setSnacksInItem(int snacks) {
        this.snacks = snacks;
    }

    // get the weight of the item
    public double getWeight() {
        return weight;
    }

    // set the weight of the item
    protected void setWeight(double weight) {
        this.weight = weight;
    }

}
