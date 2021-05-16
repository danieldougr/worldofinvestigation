
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class is responsible for creating the main World of Investigation GUI.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @ version 2021.04.05
 */
public class GUI {

    // version of GUI game
    private static final String VERSION = "Final Version 1.0";

    // instance variables 
    private JFrame frame;

    private boolean startGame;

    private String language;

    private String difficulty;

    /**
     * Instantiates the makeframe method.
     */
    public GUI() {
        startGame = false;
        language = "english";
        difficulty = "normal";
        makeFrame();
    }

    /**
     * Quit function: quit the application.
     */
    protected void quit() {
        System.exit(0);
    }

    /**
     * Play function: play the game and close the GUI.
     */
    public void play() {
        frame.dispose();
        startGame = true;
    }

    public boolean getStartGame() {
        return startGame;
    }

    /**
     * Displays the current version of the game
     */
    private void showInfo() {
        JOptionPane.showMessageDialog(frame,
                "World of Investigation\nSince in 2021\n" + VERSION,
                "About World of Investigation",
                JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Displays the languages used in the game.
     */
    private void showLanguage() {
        JOptionPane.showMessageDialog(frame, "World of Investigation has three translation languages:\n"
                + "English, Portuguese, Spanish.\nTo select your preferred language, click play",
                "Language", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Creates the main GUI panel through a frame containing functions such as
     * play, quit, language etc.
     */
    private void makeFrame() {
        frame = new JFrame("World of Investigation");
        makeMenuBar(frame);

        Container contentPanel = frame.getContentPane();

        contentPanel.setLayout(new BorderLayout(6, 6));

        ImageBackground panel = new ImageBackground(new ImageIcon("images/img.png").getImage());
        contentPanel.add(panel, BorderLayout.CENTER);

        JButton button = new JButton("Play");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play();
            }
        });
        contentPanel.add(button, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Creates the frame menu bar.
     */
    private void makeMenuBar(JFrame frame) {

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu menu;
        JMenuItem item;

        // options menu
        menu = new JMenu("Options");
        menuBar.add(menu);

        item = new JMenuItem("Language");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                makeFrameLanguage();
            }
        });
        menu.add(item);

        item = new JMenuItem("Difficulty");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                makeFrameDifficulty();
            }
        });
        menu.add(item);

        menu.addSeparator();

        item = new JMenuItem("Quit");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quit();
            }
        });
        menu.add(item);

        // help menu
        menu = new JMenu("Help");
        menuBar.add(menu);

        item = new JMenuItem("Info");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showInfo();
            }
        });
        menu.add(item);

    }

    /**
     * Creates the frame of language config.
     */
    public void makeFrameLanguage() {
        JFrame languageFrame;
        languageFrame = new JFrame("Select Language");

        // container
        Container contentPanel = languageFrame.getContentPane();

        contentPanel.setLayout(new BorderLayout(6, 6));

        JPanel toolbar = new JPanel();
        {

            toolbar.setLayout(new GridLayout(1, 0));

            JButton button = new JButton("English");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    language = "english";
                    languageFrame.dispose();
                }
            });
            toolbar.add(button);

            button = new JButton("Portuguese");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    language = "portuguese";
                    languageFrame.dispose();
                }
            });
            toolbar.add(button);

            button = new JButton("Spanish");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    language = "spanish";
                    languageFrame.dispose();
                }
            });
            toolbar.add(button);
        }
        contentPanel.add(toolbar, BorderLayout.SOUTH);

        ImageBackground panel = new ImageBackground(new ImageIcon("images/language.png").getImage());
        contentPanel.add(panel, BorderLayout.CENTER);

        // place this frame at the center of the screen and show
        languageFrame.pack();
        languageFrame.setVisible(true);
    }

    /**
     * Creates the frame of difficulty config.
     */
    public void makeFrameDifficulty() {
        JFrame difficultyFrame;
        difficultyFrame = new JFrame("Select Dilfficulty");

        // container
        Container contentPanel = difficultyFrame.getContentPane();

        contentPanel.setLayout(new BorderLayout(6, 6));

        JPanel toolbar = new JPanel();
        {

            toolbar.setLayout(new GridLayout(1, 0));

            JButton button = new JButton("Easy");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    difficulty = "easy";
                    difficultyFrame.dispose();
                }
            });
            toolbar.add(button);

            button = new JButton("Normal");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    difficulty = "normal";
                    difficultyFrame.dispose();
                }
            });
            toolbar.add(button);

            button = new JButton("Hard");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    difficulty = "hard";
                    difficultyFrame.dispose();
                }
            });
            toolbar.add(button);
        }
        contentPanel.add(toolbar, BorderLayout.SOUTH);

        ImageBackground panel = new ImageBackground(new ImageIcon("images/difficulty.png").getImage());
        contentPanel.add(panel, BorderLayout.CENTER);

        // place this frame at the center of the screen and show
        difficultyFrame.pack();
        difficultyFrame.setVisible(true);
    }

    /**
     * Return the language selected in GUI.
     */
    public String getGuiLanguage() {
        return language;
    }

    /**
     * Return the difficulty selected in GUI.
     */
    public String getGuiDifficulty() {
        return difficulty;
    }

}
