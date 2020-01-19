import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by acer on 22-Dec-17.
 */
public class LinearPogrssBar extends JPanel {
    static int percentage;
    public void Update(int num){
        percentage=num;
    }

    public void paint(Graphics g){
        super.paint(g);

        int startx =10;
        int starty =10;
        int width = 1000;
        int height = 25;
        int horizontal_line = 2;

        g.setColor(Color.BLACK);
        g.fillRect(startx,starty,width,height);

        g.setColor(Color.GRAY);
        g.fillRect(startx+horizontal_line,starty+horizontal_line,width-2*horizontal_line,height-2*horizontal_line);

        g.setColor(Color.green);
        g.fillRect(startx+horizontal_line,starty+horizontal_line,percentage*width/100,height-2*horizontal_line);

        g.setColor(Color.BLACK);
        for (int i=0;i<=100;i++){
            g.fillRect(startx+width*i/100,starty,2,height);
        }

        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(String.valueOf(percentage)+"%", 2*startx+width,starty+height-horizontal_line);

        /**
        int[] x = {40,50,60};int[] y = {40,150,100};
        g.drawPolyline(x,y,3);

        g.fillPolygon(x,y,3);
         */
    }
}
