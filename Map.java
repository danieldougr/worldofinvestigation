import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class is responsible for displaying the World of Investigation map in GUI to the player.
 * 
 * @author Matheus Gouvêa and Daniel Douglas
 * @ version 2021.04.05
 */
public final class Map 
{
    // instance variables
    private JFrame frame;
    
    /**
     * Instantiates the makeFrameMap method.
     */
    public Map()
    {
        makeFrameMap();
    }
    
    /** 
     * Creates the GUI panel to display the image containing the information 
     * about the game map and the game's exit function. 
     */
    public void makeFrameMap()
    {
        frame = new JFrame("Map Game");
        
        // container
        Container contentPanel = frame.getContentPane();

        contentPanel.setLayout(new BorderLayout(6, 6));
        
        // image
        ImageBackground panel = new ImageBackground(new ImageIcon
                ("images/map.png").getImage());
        contentPanel.add(panel, BorderLayout.CENTER);

        //quit button
        JButton button = new JButton("Quit");
        button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { frame.dispose();
                }
            });
        contentPanel.add(button, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);             
    }
    
    
}
