import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JPanel panel;
    private JButton run;

    public GUI(){
        panel = new JPanel(new GridBagLayout());
        add(panel);

        LinearPogrssBar linearPogrssBar = new LinearPogrssBar();
        panel.add(linearPogrssBar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=100;i++){
                    linearPogrssBar.Update(i);
                    linearPogrssBar.repaint();
                    try{Thread.sleep(500);}catch (Exception e1){}

                    if (i==100){i=0;}
                }

            }
        }).start();

        add(linearPogrssBar);

    }

}
