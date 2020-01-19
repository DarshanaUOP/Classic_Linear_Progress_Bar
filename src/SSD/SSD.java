package SSD;

import javax.swing.*;
import java.awt.*;

/**
 * Created by acer on 14-Jan-18.
 */
public class SSD {
    public static void main(String[] args) {
        Seven_Segment sevenSegment = new Seven_Segment();
        sevenSegment.setSize(500,500);
        sevenSegment.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        sevenSegment.setVisible(true);
        sevenSegment.setBackground(Color.black);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<=9;i++){
                    sevenSegment.Update(i);
                    sevenSegment.repaint();

                    if (i==9){i=-1;}
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e){}

                }
            }
        }).start();

    }
}
