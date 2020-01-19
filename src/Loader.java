import javax.swing.*;
import java.awt.*;

/**
 * Created by acer on 22-Dec-17.
 */
public class Loader {
    public static void main(String[] args) {

        GUI gui=new GUI();
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("Loading...");
        gui.setSize(1150,140);

    }
}

