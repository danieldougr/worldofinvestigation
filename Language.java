
/**
 * This class Language is responsible for storing the translation methods
 * in the three available languages ​​and passing them on to the game.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */
public class Language implements InterfaceLang {

    String currentLanguage;

    private English english;
    private Portuguese portuguese;
    private Spanish spanish;

    public Language(String language) {
        this.currentLanguage = language;
        setLanguage(language);
    }

    /*
     * Set the language chosen by the player.
     */
    private void setLanguage(String language) {

        switch (language) {

            case "english":
                this.english = new English();
                break;

            case "portuguese":
                this.portuguese = new Portuguese();
                break;

            case "spanish":
                this.spanish = new Spanish();
                break;
        }
    }

    /*
     * Get the current language.
     */
    public String getCurrentLanguage() {
        return currentLanguage;
    }

    /*
     * From here we have getters methods of the translation classes.
     */
    @Override
    public String[] validCommands() {
        switch (currentLanguage) {

            case "english":
                return english.validCommands();

            case "portuguese":
                return portuguese.validCommands();

            case "spanish":
                return spanish.validCommands();
        }
        return null;
    }

    @Override
    public String[] rooms() {
        switch (currentLanguage) {

            case "english":
                return english.rooms();

            case "portuguese":
                return portuguese.rooms();

            case "spanish":
                return spanish.rooms();
        }
        return null;
    }

    @Override
    public String[] exits() {
        switch (currentLanguage) {

            case "english":
                return english.exits();

            case "portuguese":
                return portuguese.exits();

            case "spanish":
                return spanish.exits();
        }
        return null;
    }

    @Override
    public String[][] items() {
        switch (currentLanguage) {

            case "english":
                return english.items();

            case "portuguese":
                return portuguese.items();

            case "spanish":
                return spanish.items();
        }
        return null;
    }

    @Override
    public void goGame() {
        switch (currentLanguage) {

            case "english":
                english.goGame();
                break;

            case "portuguese":
                portuguese.goGame();
                break;

            case "spanish":
                spanish.goGame();
                break;
        }
    }

    @Override
    public void welcome1() {
        switch (currentLanguage) {

            case "english":
                english.welcome1();
                break;

            case "portuguese":
                portuguese.welcome1();
                break;

            case "spanish":
                spanish.welcome1();
                break;
        }
    }

    @Override
    public void welcome2() {
        switch (currentLanguage) {

            case "english":
                english.welcome2();
                break;

            case "portuguese":
                portuguese.welcome2();
                break;

            case "spanish":
                spanish.welcome2();
                break;
        }
    }

    @Override
    public void welcome3() {
        switch (currentLanguage) {

            case "english":
                english.welcome3();
                break;

            case "portuguese":
                portuguese.welcome3();
                break;

            case "spanish":
                spanish.welcome3();
                break;
        }
    }

    @Override
    public void invalidCommand() {
        switch (currentLanguage) {

            case "english":
                english.invalidCommand();
                break;

            case "portuguese":
                portuguese.invalidCommand();
                break;

            case "spanish":
                spanish.invalidCommand();
                break;
        }
    }

    @Override
    public void inspectWhat() {
        switch (currentLanguage) {

            case "english":
                english.inspectWhat();
                break;

            case "portuguese":
                portuguese.inspectWhat();
                break;

            case "spanish":
                spanish.inspectWhat();
                break;
        }
    }

    @Override
    public void yourSnacks() {
        switch (currentLanguage) {

            case "english":
                english.yourSnacks();
                break;

            case "portuguese":
                portuguese.yourSnacks();
                break;

            case "spanish":
                spanish.yourSnacks();
                break;
        }
    }

    @Override
    public void yourHappinesslvl() {
        switch (currentLanguage) {

            case "english":
                english.yourHappinesslvl();
                break;

            case "portuguese":
                portuguese.yourHappinesslvl();
                break;

            case "spanish":
                spanish.yourHappinesslvl();
                break;
        }
    }

    @Override
    public void drugFound1() {
        switch (currentLanguage) {

            case "english":
                english.drugFound1();
                break;

            case "portuguese":
                portuguese.drugFound1();
                break;

            case "spanish":
                spanish.drugFound1();
                break;
        }
    }

    @Override
    public void drugFound2() {
        switch (currentLanguage) {

            case "english":
                english.drugFound2();
                break;

            case "portuguese":
                portuguese.drugFound2();
                break;

            case "spanish":
                spanish.drugFound2();
                break;
        }
    }

    @Override
    public void snackFound1() {
        switch (currentLanguage) {

            case "english":
                english.snackFound1();
                break;

            case "portuguese":
                portuguese.snackFound1();
                break;

            case "spanish":
                spanish.snackFound1();
                break;
        }
    }

    @Override
    public void snackFound2() {
        switch (currentLanguage) {

            case "english":
                english.snackFound2();
                break;

            case "portuguese":
                portuguese.snackFound2();
                break;

            case "spanish":
                spanish.snackFound2();
                break;
        }
    }

    @Override
    public void happinessFound1() {
        switch (currentLanguage) {

            case "english":
                english.happinessFound1();
                break;

            case "portuguese":
                portuguese.happinessFound1();
                break;

            case "spanish":
                spanish.happinessFound1();
                break;
        }
    }

    @Override
    public void happinessFound2() {
        switch (currentLanguage) {

            case "english":
                english.happinessFound2();
                break;

            case "portuguese":
                portuguese.happinessFound2();
                break;

            case "spanish":
                spanish.happinessFound2();
                break;
        }
    }

    @Override
    public void gameOver1() {
        switch (currentLanguage) {

            case "english":
                english.gameOver1();
                break;

            case "portuguese":
                portuguese.gameOver1();
                break;

            case "spanish":
                spanish.gameOver1();
                break;
        }
    }

    @Override
    public void gameOver2() {
        switch (currentLanguage) {

            case "english":
                english.gameOver2();
                break;

            case "portuguese":
                portuguese.gameOver2();
                break;

            case "spanish":
                spanish.gameOver2();
                break;
        }
    }

    @Override
    public void drugNotFound() {
        switch (currentLanguage) {

            case "english":
                english.drugNotFound();
                break;

            case "portuguese":
                portuguese.drugNotFound();
                break;

            case "spanish":
                spanish.drugNotFound();
                break;
        }
    }

    @Override
    public void noDoor() {
        switch (currentLanguage) {

            case "english":
                english.noDoor();
                break;

            case "portuguese":
                portuguese.noDoor();
                break;

            case "spanish":
                spanish.noDoor();
                break;
        }
    }

    @Override
    public void goWhere() {
        switch (currentLanguage) {

            case "english":
                english.goWhere();
                break;

            case "portuguese":
                portuguese.goWhere();
                break;

            case "spanish":
                spanish.goWhere();
                break;
        }
    }

    @Override
    public void itemNotExist() {
        switch (currentLanguage) {

            case "english":
                english.itemNotExist();
                break;

            case "portuguese":
                portuguese.itemNotExist();
                break;

            case "spanish":
                spanish.itemNotExist();
                break;
        }
    }

    @Override
    public void printHelp1() {
        switch (currentLanguage) {

            case "english":
                english.printHelp1();
                break;

            case "portuguese":
                portuguese.printHelp1();
                break;

            case "spanish":
                spanish.printHelp1();
                break;
        }
    }

    @Override
    public void printHelp2() {
        switch (currentLanguage) {

            case "english":
                english.printHelp2();
                break;

            case "portuguese":
                portuguese.printHelp2();
                break;

            case "spanish":
                spanish.printHelp2();
                break;
        }
    }

    @Override
    public void thanksForPlaying() {
        switch (currentLanguage) {

            case "english":
                english.thanksForPlaying();
                break;

            case "portuguese":
                portuguese.thanksForPlaying();
                break;

            case "spanish":
                spanish.thanksForPlaying();
                break;
        }
    }

    @Override
    public void quit() {
        switch (currentLanguage) {

            case "english":
                english.quit();
                break;

            case "portuguese":
                portuguese.quit();
                break;

            case "spanish":
                spanish.quit();
                break;
        }
    }

    // for the class "room".
    @Override
    public String wordRoomLocation() {
        switch (currentLanguage) {

            case "english":
                return english.wordRoomLocation();

            case "portuguese":
                return portuguese.wordRoomLocation();

            case "spanish":
                return spanish.wordRoomLocation();
        }
        return null;
    }

    @Override
    public String wordRoomExit() {
        switch (currentLanguage) {

            case "english":
                return english.wordRoomExit();

            case "portuguese":
                return portuguese.wordRoomExit();

            case "spanish":
                return spanish.wordRoomExit();
        }
        return null;
    }

    // commands for the class "item".
    @Override
    public String wordItemSee() {
        switch (currentLanguage) {

            case "english":
                return english.wordItemSee();

            case "portuguese":
                return portuguese.wordItemSee();

            case "spanish":
                return spanish.wordItemSee();
        }
        return null;
    }

    @Override
    public String wordItemWeight() {
        switch (currentLanguage) {

            case "english":
                return english.wordItemWeight();

            case "portuguese":
                return portuguese.wordItemWeight();

            case "spanish":
                return spanish.wordItemWeight();
        }
        return null;
    }

    @Override
    public void takeWhat() {
        switch (currentLanguage) {

            case "english":
                english.takeWhat();
                break;

            case "portuguese":
                portuguese.takeWhat();
                break;

            case "spanish":
                spanish.takeWhat();
                break;
        }
    }

    @Override
    public void takeItem1() {
        switch (currentLanguage) {

            case "english":
                english.takeItem1();
                break;

            case "portuguese":
                portuguese.takeItem1();
                break;

            case "spanish":
                spanish.takeItem1();
                break;
        }
    }

    @Override
    public void takeItem2() {
        switch (currentLanguage) {

            case "english":
                english.takeItem2();
                break;

            case "portuguese":
                portuguese.takeItem2();
                break;

            case "spanish":
                spanish.takeItem2();
                break;
        }
    }

    @Override
    public void takeBagFull() {
        switch (currentLanguage) {

            case "english":
                english.takeBagFull();
                break;

            case "portuguese":
                portuguese.takeBagFull();
                break;

            case "spanish":
                spanish.takeBagFull();
                break;
        }
    }

    @Override
    public void takeHeavyItem() {
        switch (currentLanguage) {

            case "english":
                english.takeHeavyItem();
                break;

            case "portuguese":
                portuguese.takeHeavyItem();
                break;

            case "spanish":
                spanish.takeHeavyItem();
                break;
        }
    }

    @Override
    public void dropWhat() {
        switch (currentLanguage) {

            case "english":
                english.dropWhat();
                break;

            case "portuguese":
                portuguese.dropWhat();
                break;

            case "spanish":
                spanish.dropWhat();
                break;
        }
    }

    @Override
    public void dropNotAllowed() {
        switch (currentLanguage) {

            case "english":
                english.dropNotAllowed();
                break;

            case "portuguese":
                portuguese.dropNotAllowed();
                break;

            case "spanish":
                spanish.dropNotAllowed();
                break;
        }
    }

    @Override
    public void dropDone() {
        switch (currentLanguage) {

            case "english":
                english.dropDone();
                break;

            case "portuguese":
                portuguese.dropDone();
                break;

            case "spanish":
                spanish.dropDone();
                break;
        }
    }

    @Override
    public void ItemsBackpack() {
        switch (currentLanguage) {

            case "english":
                english.ItemsBackpack();
                break;

            case "portuguese":
                portuguese.ItemsBackpack();
                break;

            case "spanish":
                spanish.ItemsBackpack();
                break;
        }
    }

    @Override
    public void findEvidence() {
        switch (currentLanguage) {

            case "english":
                english.findEvidence();
                break;

            case "portuguese":
                portuguese.findEvidence();
                break;

            case "spanish":
                spanish.findEvidence();
                break;
        }
    }

    @Override
    public void evidenceDone() {
        switch (currentLanguage) {

            case "english":
                english.evidenceDone();
                break;

            case "portuguese":
                portuguese.evidenceDone();
                break;

            case "spanish":
                spanish.evidenceDone();
                break;
        }
    }
}
