
import java.awt.*;
import javax.swing.*;

/**
 * This class is responsible for creating the main World of Investigation GUI.
 *
 * @author Matheus Gouvêa and Daniel Douglas
 * @ version 2021.04.05
 */
public class ImageBackground extends JComponent {

    // instance variables
    private Image img;

    /**
     * This class is responsible for scaling and painting the image that will be
     * used in the GUI's
     *
     * @param img the image we need.
     */
    public ImageBackground(String img) {
        this(new ImageIcon(img).getImage());
    }

    /**
     * Method for resizing images.
     *
     * @param img the image we need.
     */
    public ImageBackground(Image img) {
        // dimension
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    /**
     * Method for painting the images
     */
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}
