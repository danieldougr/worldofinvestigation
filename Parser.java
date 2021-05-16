
import java.util.Scanner;

/**
 * This class is part of the "World of Zuul" application. 
 * For reuse in "WoI" we adapt its methods and use its properties.
 * 
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and tries
 * to interpret the line as a two word command. It returns the command as an
 * object of class Command.
 *
 * The parser has a set of known command words. It checks user input against the
 * known commands, and if the input is not one of the known commands, it returns
 * a command object that is marked as an unknown command.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30 
 * @secondaryAuthor Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class Parser {

    private final CommandWords commands;  // holds all valid command words
    private final Scanner reader;         // source of command input

    /**
     * Create a parser to read from the terminal window.
     * @param validCommands string of valid commands, according to the language.
     */
    public Parser(String [] validCommands) {
        commands = new CommandWords(validCommands);
        reader = new Scanner(System.in);
    }

    /**
     * @return The next command from the user.
     */
    public Command getCommand() {
        String inputLine;   // will hold the full input line
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // print prompt

        inputLine = reader.nextLine().toLowerCase();

        // Find up to two words on the line.
        Scanner tokenizer = new Scanner(inputLine);
        if (tokenizer.hasNext()) {
            word1 = tokenizer.next();      // get first word
            if (tokenizer.hasNext()) {
                word2 = tokenizer.next();      // get second word
            }
            while (tokenizer.hasNext()) {                
                word2 += " " + tokenizer.next();
            }
        } 

        // Now check whether this word is known. If so, create a command
        // with it. If not, create a "null" command (for unknown command).
        if (commands.isCommand(word1)) {
            return new Command(word1, word2);
        } else {
            return new Command(null, word2);
        }
    }

    /**
     * Print out a list of valid command words.
     * @return 
     */
    public String listCommands() {
        return commands.getCommandList();
    }

    /**
     * Print out a list of valid command words.
     */
    public void showCommands() {
        commands.showAll();
    }

    public CommandWords getArrayCommands() {
        return commands;
    }
}
