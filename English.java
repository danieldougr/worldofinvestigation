
/**
 * This class is responsible for storing the String-type english dialogues used in-game.
 * In it we have all the phrases and commands necessary to set up the plot of World of Investigation.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class English implements InterfaceLang {

    // valid commands for player, just concatenate the command to the desired room/corridor.
    @Override
    public String[] validCommands() {
        String[] commands = {"go", "look", "inspect", "take", "drop", "backpack",
            "map", "quit", "help"};
        return commands;
    }

    // this method creates and stores the main rooms in an array.
    @Override
    public String[] rooms() {

        String[] createRooms = new String[21];

        createRooms[0] = "on the first floor, at the beginning of the corridor";
        createRooms[1] = "on the first floor, in the middle of the corridor";
        createRooms[2] = "on the first floor, at the end of the corridor";
        createRooms[3] = "on the second floor, at the beginning of the corridor";
        createRooms[4] = "on the second floor, in the middle of the corridor";
        createRooms[5] = "on the second floor, at the end of the corridor";

        createRooms[6] = "in Room 1";
        createRooms[7] = "in Room 2";
        createRooms[8] = "in Room 3";
        createRooms[9] = "in Room 4";
        createRooms[10] = "in Room 5";
        createRooms[11] = "in Room 6";
        createRooms[12] = "in Room 7";
        createRooms[13] = "in Room 8";
        createRooms[14] = "in Room 9";
        createRooms[15] = "in Room 10";
        createRooms[16] = "in Room 11";
        createRooms[17] = "in Room 12";
        createRooms[18] = "in Room 13";
        createRooms[19] = "in Room 14";

        createRooms[20] = "in the Police Car";

        return createRooms;
    }

    // this method creates and stores the outputs in an array.
    @Override
    public String[] exits() {

        String[] createExits = new String[21];

        createExits[0] = "room 1";
        createExits[1] = "room 2";
        createExits[2] = "room 3";
        createExits[3] = "room 4";
        createExits[4] = "room 5";
        createExits[5] = "room 6";
        createExits[6] = "room 7";
        createExits[7] = "room 8";
        createExits[8] = "room 9";
        createExits[9] = "room 10";
        createExits[10] = "room 11";
        createExits[11] = "room 12";
        createExits[12] = "room 13";
        createExits[13] = "room 14";
        createExits[14] = "front";
        createExits[15] = "back";
        createExits[16] = "upstairs";
        createExits[17] = "downstairs";
        createExits[18] = "corridor";
        createExits[19] = "police car";
        createExits[20] = "hotel";

        return createExits;
    }

    // these are the items that can be found randomly.
    @Override
    public String[][] items() {
        String[][] items = new String[24][2];

        items[0][0] = "bed";
        items[0][1] = "the most comfortable in the world";

        items[1][0] = "laptop";
        items[1][1] = "powerful but limited";

        items[2][0] = "cellphone";
        items[2][1] = "high-end iphone";

        items[3][0] = "carpet";
        items[3][1] = "very soft and cozy";

        items[4][0] = "curtain";
        items[4][1] = "helps to hide the sunlight";

        items[5][0] = "table";
        items[5][1] = "with some accessories";

        items[6][0] = "frame";
        items[6][1] = "a painting by Vincent Van Gogh";

        items[7][0] = "chair";
        items[7][1] = "very good for the spine and contributes to posture";

        items[8][0] = "air conditioner";
        items[8][1] = "nobody can live in this heat";

        items[9][0] = "bookcase";
        items[9][1] = "beautiful books are here";

        items[10][0] = "tv";
        items[10][1] = "we are watching the 2022 cup here";

        items[11][0] = "minibar";
        items[11][1] = "a drink goes well, but the price is absurd";

        items[12][0] = "safe box";
        items[12][1] = "where we keep precious items";

        items[13][0] = "backpack";
        items[13][1] = "it looks old, but it is very bulky";

        items[14][0] = "handbag";
        items[14][1] = "has gold details, it must be worth a fortune";

        items[15][0] = "cup";
        items[15][1] = "someone drank an orange juice here yesterday";

        items[16][0] = "dish";
        items[16][1] = "with leftover fish from yesterday's dinner";

        items[17][0] = "trash can";
        items[17][1] = "there is a lot of garbage, the room maid has not passed here yet";

        items[18][0] = "lamp";
        items[18][1] = "lit, a couple may have had a beautiful romantic night in this room";

        items[19][0] = "big suitcase";
        items[19][1] = "is stuffed, this is suspicious ...";

        items[20][0] = "key";
        items[20][1] = "seems to be the electronic key of the room";

        items[21][0] = "armchair";
        items[21][1] = "man, it looks like a massage chair, so comfortable";

        items[22][0] = "telephone";
        items[22][1] = "older than Atari";

        items[23][0] = "box";
        items[23][1] = "what can be hidden here?";

        return items;

    }

    // from now on we have the dialogues used in WoI.
    @Override
    public void goGame() {
        System.out.println("Let's go to the game!");
        System.out.println("Good luck Player...\n");
    }

    @Override
    public void welcome1() {
        System.out.println();
        System.out.println("Welcome to the World of Investigation!");
        System.out.println("Venture out as a cop and find the illegal drug with your dog.");
        System.out.print("You start with ");
    }

    @Override
    public void welcome2() {
        System.out.println(" snacks and can find more in the rooms for your dog.");
        System.out.println("Your dog has a 'happiness level' that at the end of the game must be at least 10 for you to win the game.");
        System.out.print("This level is currently in ");
    }

    @Override
    public void welcome3() {
        System.out.println(" and you can make your dog happier throughout the game by finding snacks.");
        System.out.println("Every time you move around in the game, your dog loses 1 'level of happiness'");
        System.out.println("You can pick up and drop some items from the rooms!");
        System.out.println("Type 'help' if you need help.");
        System.out.println("Entering in the hotel...");
        System.out.println();
    }

    @Override
    public void invalidCommand() {
        System.out.println("I don't know what you mean...");
    }

    @Override
    public void inspectWhat() {
        System.out.println("Inspect what??");
    }

    @Override
    public void goWhere() {
        System.out.println("Go where?");
    }

    @Override
    public void noDoor() {
        System.out.println("There is no door!");
    }

    @Override
    public void yourSnacks() {
        System.out.print("Your Snacks: ");
    }

    @Override
    public void yourHappinesslvl() {
        System.out.print("Happiness level: ");
    }

    @Override
    public void drugFound1() {
        System.out.print("Drug found in ");
    }

    @Override
    public void drugFound2() {
        System.out.println(". Congratulations!!");
    }

    @Override
    public void snackFound1() {
        System.out.print("You found ");
    }

    @Override
    public void snackFound2() {
        System.out.println(" snack(s).");
    }

    @Override
    public void happinessFound1() {
        System.out.print("Your dog won ");
    }

    @Override
    public void happinessFound2() {
        System.out.println(" level(s) of happiness.");
    }

    @Override
    public void gameOver1() {
        System.out.println("Game Over! Your snacks are over!");
    }

    @Override
    public void gameOver2() {
        System.out.println("Game Over! Unfortunately, your dog's happiness is less than 10.");
    }

    @Override
    public void drugNotFound() {
        System.out.println("Drug not found! Keep looking.");
    }

    @Override
    public void itemNotExist() {
        System.out.println("This item does not exist.");
    }

    @Override
    public void printHelp1() {
        System.out.println("You are a cop. You are alone with your dog.");
        System.out.println("The car is your home, you can empty your backpack taking items from the rooms to the car.");
        System.out.println("Your main job is to search the hotel rooms with your dog and find the illegal drug.");
        System.out.println("There is only one room with the illegal drug.");
        System.out.println();
        System.out.print("Your Snacks: ");
    }

    @Override
    public void printHelp2() {
        System.out.println("Your command words are: ");
    }

    @Override
    public void thanksForPlaying() {
        System.out.println("Thank you for playing. Good bye.");
    }

    @Override
    public void quit() {
        System.out.println("Quit what?");

    }

    // for the class "room".
    @Override
    public String wordRoomLocation() {
        return "You are ";
    }

    @Override
    public String wordRoomExit() {
        return "Exits:";
    }

    // for the class "item".
    @Override
    public String wordItemSee() {
        return "You see a ";
    }

    @Override
    public String wordItemWeight() {
        return "weight: ";
    }

    // for the new functionalities WI 2.0
    @Override
    public void takeWhat() {
        System.out.println("Take what?");
    }

    @Override
    public void takeItem1() {
        System.out.print("You added the ");
    }

    @Override
    public void takeItem2() {
        System.out.println(" in your backpack.");
    }

    @Override
    public void takeBagFull() {
        System.out.println("Your backpack is full!");
    }

    @Override
    public void takeHeavyItem() {
        System.out.println("This item is so heavy.");
    }

    @Override
    public void dropWhat() {
        System.out.println("Drop what?");
    }

    @Override
    public void dropNotAllowed() {
        System.out.println("It's not allowed to drop items in the corridor.");
    }

    @Override
    public void dropDone() {
        System.out.println(" removed from the backpack.");
    }

    @Override
    public void ItemsBackpack() {
        System.out.println("Items in backpack:");
    }

    @Override
    public void findEvidence() {
        System.out.print("Find the following evidence and take it to the vehicle: ");
    }

    @Override
    public void evidenceDone() {
        System.out.println("Congratulations! You won the game by finding the evidence.");
    }

}
