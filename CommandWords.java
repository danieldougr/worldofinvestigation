
/**
 * This class is part of the "World of Zuul" application.
 * For reuse in "WoI" we adapt its methods and use its properties.
 *
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 * @secondaryAuthor Matheus Gouvêa & Daniel Douglas
 * @version 2021.04.05
 */
public class CommandWords {

    // a constant array that holds all valid command words
    private final String[] validCommands;

    /**
     * Constructor - initialise the command words.
     *
     * @param commands string of valid commands, according to the language.
     */
    public CommandWords(String[] commands) {
        validCommands = new String[commands.length];
        System.arraycopy(commands, 0, validCommands, 0, validCommands.length);
    }

    /**
     * Check whether a given String is a valid command word.
     *
     * @param aString
     * @return true if it is, false if it isn't.
     */
    public boolean isCommand(String aString) {
        for (String validCommand : validCommands) {
            if (validCommand.equals(aString)) {
                return true;
            }
        }
        // if we get here, the string was not found in the commands
        return false;
    }

    /**
     * Print all valid commands to System.out.
     */
    public void showAll() {
        for (String command : validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }

    /**
     * Return all valid commands as a String.
     *
     * @return List of valid commands
     */
    public String getCommandList() {
        String commandList = "";
        for (String command : validCommands) {
            commandList = commandList + "  " + command;
        }

        return commandList;

    }

    /**
     * Return all valid commands as a Array of String.
     *
     * @return List of valid commands
     */
    public String[] getArrayVallidCommands() {
        return validCommands;
    }

}
