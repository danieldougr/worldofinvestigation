
import java.util.ArrayList;
import java.util.Random;

/**
 * "World of Investigation" is a game based on the story of a police officer who
 * is called in a hotel to search the rooms for “illicit things” with your
 * sniffer dog. Altogether there are 14 rooms and the police officer must
 * inspect the items in the rooms to findthis “illicit thing”, each item that he
 * inspects with the dog will consume 1 snack and a level of happiness.
 *
 * He will start the game with happiness and snacks determined by the difficulty
 * of the game, and should be finding more for the rooms hidden in the items you
 * inspect where they can or can not having more snacks and finding the “illicit
 * business” and the level of happiness is satisfactory he wins.
 *
 * If he ends up the snacks the player loses, because the dog will no longer be
 * able inspect the items in the room and continue in pursuit of the objective
 * of the game that is to find this “illicit thing” and the secondary objective
 * is to find more snacks to continue the search.
 *
 * To play this game, just start the main method in the GameStart class.
 *
 * This class creates and initialises all the others: it creates all rooms,
 * creates the parser and starts the game. It also evaluates and executes the
 * commands that the parser returns, arrow the difficulty chosen by the player,
 * creates the secondary objective, the inspection method and go.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 * @secondaryAuthor Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class Game {

    private final Language language;
    private final Parser parser;
    private final Player player;
    private final ArrayList<Room> rooms;
    private final ArrayList<Room> roomsWithSnack;
    private PoliceCar policeCar;
    private final ArrayList<Item> itens;
    private final ArrayList<String> chosenEasterEggItems;
    private final AudioEffects audio;
    private boolean losserGame;
    private boolean winnerGame;

    /**
     * Create the game and initialise its internal map.
     *
     * @param language selected by user in GUI.
     * @param difficulty selected by user in GUI.
     */
    public Game(String language, String difficulty) {
        this.language = new Language(language);
        parser = new Parser(getValidCommands());
        player = new Player(setDifficulty(difficulty), setHappinesslvl(difficulty)); //  start with N snacks and N of happiness level, because of the difficulty.
        rooms = new ArrayList<>();
        policeCar = null;
        itens = new ArrayList<>();
        chosenEasterEggItems = new ArrayList<>();
        roomsWithSnack = new ArrayList<>();
        audio = new AudioEffects();
        losserGame = false;
        winnerGame = false;
        loadGame();
    }

    // Get the commands by language.
    public final String[] getValidCommands() {
        return language.validCommands();
    }

    /**
     * Arrow a difficulty.
     *
     * @param difficulty chosed by player.
     * @return initial dog happiness level and snacks.
     */
    public final int setDifficulty(String difficulty) {

        switch (difficulty) {
            case "easy":
                return 50;

            case "normal":
                return 25;

            case "hard":
                return 15;
        }
        return 0;
    }

    public final int setHappinesslvl(String difficulty) {
        switch (difficulty) {
            case "easy":
                return 45;

            case "normal":
                return 28;

            case "hard":
                return 18;

        }
        return 0;
    }

    /**
     * Loads game resources.
     */
    private void loadGame() {
        createRooms();
        createItems();
        createScenery();
        createPrimaryObjective();
        createSecondaryObjective();
        createEasterEggWinGame();
    }

    /**
     * Creates all the rooms.
     */
    private void createRooms() {

        // creates the hotel corridors.
        Room corridor1_1, corridor1_2, corridor1_3, corridor2_1, corridor2_2, corridor2_3;
        corridor1_1 = new Room(language.rooms()[0]);
        corridor1_2 = new Room(language.rooms()[1]);
        corridor1_3 = new Room(language.rooms()[2]);
        corridor2_1 = new Room(language.rooms()[3]);
        corridor2_2 = new Room(language.rooms()[4]);
        corridor2_3 = new Room(language.rooms()[5]);

        // creates hotel rooms.
        Room room1, room2, room3, room4, room5, room6, room7, room8, room9, room10, room11, room12, room13, room14;
        room1 = new Room(language.rooms()[6]);
        room2 = new Room(language.rooms()[7]);
        room3 = new Room(language.rooms()[8]);
        room4 = new Room(language.rooms()[9]);
        room5 = new Room(language.rooms()[10]);
        room6 = new Room(language.rooms()[11]);
        room7 = new Room(language.rooms()[12]);
        room8 = new Room(language.rooms()[13]);
        room9 = new Room(language.rooms()[14]);
        room10 = new Room(language.rooms()[15]);
        room11 = new Room(language.rooms()[16]);
        room12 = new Room(language.rooms()[17]);
        room13 = new Room(language.rooms()[18]);
        room14 = new Room(language.rooms()[19]);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        rooms.add(room6);
        rooms.add(room7);
        rooms.add(room8);
        rooms.add(room9);
        rooms.add(room10);
        rooms.add(room11);
        rooms.add(room12);
        rooms.add(room13);
        rooms.add(room14);

        // create police car.
        policeCar = new PoliceCar(language.rooms()[20]);

        // initializes the exit of the corridors.
        corridor1_1.setExit(language.exits()[19], policeCar);
        corridor1_1.setExit(language.exits()[0], room1);
        corridor1_1.setExit(language.exits()[14], corridor1_2);
        corridor1_1.setExit(language.exits()[1], room2);
        corridor1_1.setExit(language.exits()[16], corridor2_1);

        corridor1_2.setExit(language.exits()[2], room3);
        corridor1_2.setExit(language.exits()[14], corridor1_3);
        corridor1_2.setExit(language.exits()[3], room4);
        corridor1_2.setExit(language.exits()[15], corridor1_1);

        corridor1_3.setExit(language.exits()[4], room5);
        corridor1_3.setExit(language.exits()[5], room6);
        corridor1_3.setExit(language.exits()[6], room7);
        corridor1_3.setExit(language.exits()[15], corridor1_2);

        corridor2_1.setExit(language.exits()[7], room8);
        corridor2_1.setExit(language.exits()[14], corridor2_2);
        corridor2_1.setExit(language.exits()[8], room9);
        corridor2_1.setExit(language.exits()[17], corridor1_1);

        corridor2_2.setExit(language.exits()[9], room10);
        corridor2_2.setExit(language.exits()[14], corridor2_3);
        corridor2_2.setExit(language.exits()[10], room11);
        corridor2_2.setExit(language.exits()[15], corridor2_1);

        corridor2_3.setExit(language.exits()[11], room12);
        corridor2_3.setExit(language.exits()[12], room13);
        corridor2_3.setExit(language.exits()[13], room14);
        corridor2_3.setExit(language.exits()[15], corridor2_2);

        // initializes the exit of the rooms.
        room1.setExit(language.exits()[18], corridor1_1);
        room2.setExit(language.exits()[18], corridor1_1);
        room3.setExit(language.exits()[18], corridor1_2);
        room4.setExit(language.exits()[18], corridor1_2);
        room5.setExit(language.exits()[18], corridor1_3);
        room6.setExit(language.exits()[18], corridor1_3);
        room7.setExit(language.exits()[18], corridor1_3);

        room8.setExit(language.exits()[18], corridor2_1);
        room9.setExit(language.exits()[18], corridor2_1);
        room10.setExit(language.exits()[18], corridor2_2);
        room11.setExit(language.exits()[18], corridor2_2);
        room12.setExit(language.exits()[18], corridor2_3);
        room13.setExit(language.exits()[18], corridor2_3);
        room14.setExit(language.exits()[18], corridor2_3);

        // initialize the exit of the police car.
        policeCar.setExit(language.exits()[20], corridor1_1);

        // the game starts at the beginning of the 1st floor corridor.
        player.setCurrentRoom(corridor1_1);
        soundtrack("corridor");
    }

    /**
     * creates all the items.
     */
    private void createItems() {

        // create the items
        itens.add(new HeavyItem(language.items()[0][0], language.items()[0][1], 71.3));     // bed
        itens.add(new LightItem(language.items()[1][0], language.items()[1][1], 1.84));     // laptop
        itens.add(new LightItem(language.items()[2][0], language.items()[2][1], 0.14));     // cellphone
        itens.add(new LightItem(language.items()[3][0], language.items()[3][1], 2));        // carpet
        itens.add(new LightItem(language.items()[4][0], language.items()[4][1], 3.2));      // curtain
        itens.add(new LightItem(language.items()[5][0], language.items()[5][1], 7.4));      // table
        itens.add(new LightItem(language.items()[6][0], language.items()[6][1], 2.6));      // frame
        itens.add(new LightItem(language.items()[7][0], language.items()[7][1], 5.83));     // chair
        itens.add(new HeavyItem(language.items()[8][0], language.items()[8][1], 16));       // air conditioner
        itens.add(new HeavyItem(language.items()[9][0], language.items()[9][1], 123.2));    // bookcase
        itens.add(new HeavyItem(language.items()[10][0], language.items()[10][1], 33));     // tv
        itens.add(new HeavyItem(language.items()[11][0], language.items()[11][1], 46.9));   // minibar
        itens.add(new HeavyItem(language.items()[12][0], language.items()[12][1], 13.5));   // safe box
        itens.add(new HeavyItem(language.items()[13][0], language.items()[13][1], 23.3));   // backpack
        itens.add(new LightItem(language.items()[14][0], language.items()[14][1], 5.8));    // handbag
        itens.add(new LightItem(language.items()[15][0], language.items()[15][1], 0.6));    // cup
        itens.add(new LightItem(language.items()[16][0], language.items()[16][1], 4.7));    // dish
        itens.add(new HeavyItem(language.items()[17][0], language.items()[17][1], 11.9));   // trash can
        itens.add(new HeavyItem(language.items()[18][0], language.items()[18][1], 10.2));   // lamp
        itens.add(new HeavyItem(language.items()[19][0], language.items()[19][1], 29.1));   // big suitcase
        itens.add(new LightItem(language.items()[20][0], language.items()[20][1], 0.3));    // key
        itens.add(new HeavyItem(language.items()[21][0], language.items()[21][1], 68.4));   // armchair
        itens.add(new LightItem(language.items()[22][0], language.items()[22][1], 9.2));    // telephone
        itens.add(new HeavyItem(language.items()[23][0], language.items()[23][1], 16.8));   // box
    }

    /**
     * creates the scenery of the rooms.
     */
    private void createScenery() {

        Random random = new Random();
        for (Room room : rooms) {
            // Defines the minimum and maximum items that the room can have, in this case minimum 4 and maximum 7.
            for (int i = -4; i < random.nextInt(3); i++) {

                boolean check = false;
                while (!check) {
                    Item item = itens.get(random.nextInt(itens.size()));

                    if (!room.getItens().contains(item)) {
                        room.addItem(item);
                        check = true;
                    }

                }

            }
        }
    }

    /**
     * create the primary objective.
     */
    private void createPrimaryObjective() {
        Random random = new Random();
        Room roomChosen = rooms.get(random.nextInt(rooms.size()));

        while (roomChosen.getItens().isEmpty()) {
            roomChosen = rooms.get(random.nextInt(rooms.size()));
        }

        roomChosen.setChosen(true);

        String[] itensInRoom = new String[roomChosen.getItens().size()];

        int index = 0;

        for (Item item : roomChosen.getItens()) {
            itensInRoom[index] = item.getName();
            index++;
        }

        roomChosen.setChosen(itensInRoom[random.nextInt(itensInRoom.length)]);
    }

    /**
     * create the secondary objective.
     */
    private void createSecondaryObjective() {

        Random random = new Random();

        // defines the maximum and minimum number of rooms with snacks
        for (int i = -5; i < random.nextInt(3); i++) {

            boolean check = false;

            Room roomWithSnack = rooms.get(random.nextInt(rooms.size()));

            // check for snacks in the room
            while (!check) {

                if (!roomsWithSnack.contains(roomWithSnack) && !roomWithSnack.getItens().isEmpty()) {
                    roomsWithSnack.add(roomWithSnack);
                    check = true;

                } else {
                    roomWithSnack = rooms.get(random.nextInt(rooms.size()));
                }
            }
        }

        for (Room room : roomsWithSnack) {

            Item itemWithSnacks = room.getItens().get(random.nextInt(room.getItens().size()));
            itemWithSnacks.setSnacksInItem(random.nextInt(4) + 1);      // maximum of snacks in item.
        }

    }

    /*
     * An easter egg and alternative way to win the game.
     */
    public void createEasterEggWinGame() {
        ArrayList<String> allItems = new ArrayList<>();
        Random random = new Random();

        for (Room room : rooms) {
            for (Item item : room.getItens()) {
                if (item instanceof LightItem) {
                    if (item.getWeight() <= 10) {
                        allItems.add(item.getName());
                    }
                }
            }
        }

        int numItensRequired = random.nextInt(6) + 5;     // defines the number of items the player must take to the police car.

        boolean check = false;

        while (!check) {
            if (!allItems.isEmpty()) {
                int numRandom = random.nextInt(allItems.size());
                chosenEasterEggItems.add(allItems.get(numRandom));
                allItems.remove(numRandom);
            } else {
                check = true;
            }

            if (chosenEasterEggItems.size() == numItensRequired) {
                check = true;
            }
        }

    }

    /*
     * Organizes soundtracks according to the situations the player is in.
     */
    private void soundtrack(String situation) {

        audio.stopTracks();

        switch (situation) {

            case "room":
                audio.suspenseTrack();
                break;

            case "winner":
                audio.missionPassed();
                break;

            case "losser":
                audio.missionFailed();
                break;

            case "corridor":
                audio.actionTrack();
                break;

            case "stop":
                audio.stopTracks();
                break;

            case "police":
                audio.policeTrack();
                break;

        }

    }

    /**
     * Main play routine. Loops until end of play.
     */
    public void play() {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
        boolean finished = false;
        while (!finished && !losserGame && !winnerGame) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        audio.stopTracks();

        if (winnerGame) {
            soundtrack("winner");
        }
        if (losserGame) {
            soundtrack("losser");
        }

        language.thanksForPlaying();
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() {
        language.goGame();
        language.welcome1();
        System.out.print(player.getSnacks());
        language.welcome2();
        System.out.print(player.getHappinesslvl());
        language.welcome3();
        System.out.println(player.getCurrentRoom().getLongDescription(language.wordRoomLocation(), language.wordRoomExit(), language.wordItemSee(), language.wordItemWeight()));
    }

    /**
     * Given a command, process (that is: execute) the command.
     *
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) {
        boolean wantToQuit = false;

        if (command.isUnknown()) {
            language.invalidCommand();
            return false;
        }

        String commandWord = command.getCommandWord();

        if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[0])) {            // "go"
            goRoom(command);
        } else if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[1])) {     // "look"
            look();
        } else if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[2])) {     // "inspect"
            inspect(command);
        } else if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[3])) {     // "take"
            take(command);
        } else if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[4])) {     // "drop"
            drop(command);
        } else if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[5])) {     // "backpack"
            backpack();
        } else if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[6])) {     // "map"
            Map map = new Map();
        } else if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[7])) {     // "quit"
            wantToQuit = quit(command);
        } else if (commandWord.equals(parser.getArrayCommands().getArrayVallidCommands()[8])) {     // "help"
            printHelp();
        }
        // else command not recognised.
        return wantToQuit;
    }
    // implementations of user commands:

    /**
     * user command to know where it is.
     */
    private void look() {
        System.out.println(player.getCurrentRoom().getLongDescription(language.wordRoomLocation(), language.wordRoomExit(), language.wordItemSee(), language.wordItemWeight()));
    }

    /**
     * user command to inspect an item.
     */
    private void inspect(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to inspect...
            language.inspectWhat();
            return;
        }

        String item = command.getSecondWord();

        // Try to inspect the item.
        for (Item itemInRoom : player.getCurrentRoom().getItens()) {
            if (itemInRoom.getName().equals(item)) {

                player.decrementSnack();

                language.yourSnacks();
                System.out.println(player.getSnacks());

                if (roomsWithSnack.contains(player.getCurrentRoom())) {
                    if (itemInRoom.getSnacksInItem() != 0) {

                        language.snackFound1();
                        System.out.print(itemInRoom.getSnacksInItem());
                        language.snackFound2();

                        player.addSnacks(itemInRoom.getSnacksInItem());
                        roomsWithSnack.remove(player.getCurrentRoom());

                        language.happinessFound1();
                        if (itemInRoom.getSnacksInItem() == 1) {
                            player.addHappinesslvl(1);
                            System.out.print(1);
                        } else if (itemInRoom.getSnacksInItem() > 1 && itemInRoom.getSnacksInItem() < 4) {
                            player.addHappinesslvl(2);
                            System.out.print(2);
                        } else {
                            player.addHappinesslvl(3);
                            System.out.print(3);
                        }
                        language.happinessFound2();
                    }
                }

                if (itemInRoom.getChosen() && player.getCurrentRoom().getChosen()) {

                    language.drugFound1();
                    System.out.print(itemInRoom.getName());
                    language.drugFound2();

                    if (player.getHappinesslvl() >= 10) {
                        winnerGame = true;
                    } else {
                        language.gameOver2();
                        losserGame = true;
                    }

                    return;

                } else if (player.getSnacks() <= 0) {
                    language.gameOver1();
                    losserGame = true;
                    return;

                } else {
                    language.drugNotFound();

                    return;
                }

            }
        }
        language.itemNotExist();

    }

    /**
     * user command to take an item.
     */
    private void take(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to take...
            language.takeWhat();
            return;
        }

        String item = command.getSecondWord();

        // Try to take the item.
        for (Item itemInRoom : player.getCurrentRoom().getItens()) {
            if (itemInRoom.getName().equals(item)) {
                Object checkItem = itemInRoom;

                if (checkItem instanceof LightItem && itemInRoom.getWeight() <= 10) {

                    if (itemInRoom.getChosen() && player.getCurrentRoom().getChosen()) {
                        inspect(new Command(parser.getArrayCommands().getArrayVallidCommands()[2], item));  //inspect the item that contain the drug.
                        return;
                    }

                    if (player.addItemBackpack((LightItem) checkItem)) {
                        player.getCurrentRoom().removeItem(itemInRoom);
                        language.takeItem1();
                        System.out.print(itemInRoom.getName());
                        language.takeItem2();

                    } else {
                        language.takeBagFull();
                    }

                } else {
                    language.takeHeavyItem();
                }
                return;

            }
        }
        language.itemNotExist();

    }

    /**
     * user command to drop an item.
     */
    private void drop(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to drop...
            language.dropWhat();
            return;
        }

        String item = command.getSecondWord();

        // Try to drop the item.
        for (LightItem itemInBackpack : player.getBackpack()) {
            if (itemInBackpack.getName().equals(item)) {

                if (rooms.contains(player.getCurrentRoom()) || player.getCurrentRoom().getShortDescription().equals(language.rooms()[20])) {
                    player.getCurrentRoom().addItem(itemInBackpack);
                    player.removeItemBackpack(itemInBackpack);
                } else {
                    language.dropNotAllowed();
                    return;
                }

                System.out.print(itemInBackpack.getName());
                language.dropDone();

                return;

            }
        }
        language.itemNotExist();

    }

    /**
     * auxiliary method to automatically drop items into the police car.
     */
    public void dropItemsInPoliceCar() {
        String[] itemsInBackPack = new String[player.getNumItemsInBackpack()];
        int i = 0;

        for (LightItem item : player.getBackpack()) {
            itemsInBackPack[i] = item.getName();
            i++;
        }

        for (String itemsInBackPack1 : itemsInBackPack) {
            drop(new Command(parser.getArrayCommands().getArrayVallidCommands()[4], itemsInBackPack1));
        }

    }

    /**
     * check items in the police car.
     */
    private void checkItemsInPoliceCar() {
        ArrayList<String> remainingItems = policeCar.easterEggWin(chosenEasterEggItems, player.getBackpack());
        if (!remainingItems.isEmpty()) {
            language.findEvidence();
            for (int i = 0; i < remainingItems.size(); i++) {
                if (i != (remainingItems.size() - 1)) {
                    System.out.print(remainingItems.get(i) + ", ");
                } else {
                    System.out.println(remainingItems.get(i));
                }
            }
        }
    }

    /**
     * user command to show the items in the backpack.
     */
    public void backpack() {
        language.ItemsBackpack();
        System.out.println(player.itensInBackpack(language.wordItemSee(), language.wordItemWeight()));
    }

    /**
     * Print out some help information. Here we print some stupid, cryptic
     * message and a list of the command words.
     */
    private void printHelp() {
        language.printHelp1();
        System.out.println(player.getSnacks());
        language.yourHappinesslvl();
        System.out.println(player.getHappinesslvl());
        System.out.println();
        language.printHelp2();
        System.out.println(parser.listCommands());
    }

    /**
     * Try to go to one direction. If there is an exit, enter the new room,
     * otherwise print an error message.
     */
    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            language.goWhere();
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = player.getCurrentRoom().getExit(direction);

        if (nextRoom == null) {
            language.noDoor();
        } else {
            player.decrementHappinesslvl();
            language.yourHappinesslvl();
            System.out.println(player.getHappinesslvl());
            player.setCurrentRoom(nextRoom);
            System.out.println(player.getCurrentRoom().getLongDescription(language.wordRoomLocation(), language.wordRoomExit(), language.wordItemSee(), language.wordItemWeight()));
            if (rooms.contains(nextRoom)) {
                soundtrack("room");
            } else if (nextRoom.getShortDescription().equals(language.rooms()[20])) {

                checkItemsInPoliceCar();
                dropItemsInPoliceCar();

                if (policeCar.easterEggWin(chosenEasterEggItems, player.getBackpack()).isEmpty()) {
                    language.evidenceDone();
                    winnerGame = true;
                    return;
                }
                soundtrack("police");

            } else {
                soundtrack("corridor");
            }

        }
    }

    /*
     * Getters for Parse and Player class methods.
     * @return parser and player.
     */
    public Parser getParser() {
        return parser;
    }

    public Player getPlayer() {
        return player;
    }

    /**
     * "Quit" was entered. Check the rest of the command to see whether we
     * really quit the game.
     *
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) {
        if (command.hasSecondWord()) {
            language.quit();
            return false;
        } else {
            return true;  // signal that we want to quit
        }
    }

}
