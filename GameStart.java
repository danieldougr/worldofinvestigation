
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the main class responsible for executing "World of Investigation",
 * through it we can start the game providing the player with a choice of
 * difficulty level and the language to be displayed.
 *
 * In this version we only have subtitles in English, Portuguese and Spanish.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class GameStart {

    public static void main(String[] args) {

        GUI gui = new GUI();

        while (!gui.getStartGame()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /*
         * create and play game!
         */
        try {
            Game game = new Game(gui.getGuiLanguage(), gui.getGuiDifficulty());
            game.play();
        } catch (Exception e) {
            System.err.println("An unforeseen happened! Inform the following message to the developer: " + e.toString());
            System.exit(0);
        }
    }

}
