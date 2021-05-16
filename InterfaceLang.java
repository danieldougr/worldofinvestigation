/*
   * This InterfaceLang class is responsible for ensuring that
   * all dialogues are implemented in the game in all languages.
   * 
   * @author Matheus Gouvêa and Daniel Douglas
   * @ version 2021.04.05
 */

public interface InterfaceLang {

    public String[] validCommands();

    public String[] rooms();

    public String[] exits();

    public String[][] items();

    public void goGame();

    public void welcome1();

    public void welcome2();

    public void welcome3();

    public void invalidCommand();

    public void inspectWhat();

    public void goWhere();

    public void noDoor();

    public void yourSnacks();

    public void yourHappinesslvl();

    public void drugFound1();

    public void drugFound2();

    public void snackFound1();

    public void snackFound2();

    public void happinessFound1();

    public void happinessFound2();

    public void gameOver1();

    public void gameOver2();

    public void drugNotFound();

    public void itemNotExist();

    public void printHelp1();

    public void printHelp2();

    public void thanksForPlaying();

    public void quit();

    public String wordRoomLocation();

    public String wordRoomExit();

    public String wordItemSee();

    public String wordItemWeight();

    public void takeWhat();

    public void takeItem1();

    public void takeItem2();

    public void takeBagFull();

    public void takeHeavyItem();

    public void dropWhat();

    public void dropNotAllowed();

    public void dropDone();

    public void ItemsBackpack();

    public void findEvidence();

    public void evidenceDone();

}
