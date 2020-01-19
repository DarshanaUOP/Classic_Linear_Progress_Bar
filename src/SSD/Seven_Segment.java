package SSD;

import javax.swing.*;
import java.awt.*;

/**
 * Created by acer on 14-Jan-18.
 */
public class Seven_Segment extends JFrame{

    static int num;
    public void Update(int number){
        num = number;
    }

    public void paint(Graphics g){
        super.paint(g);


        int lineWidth = 20,height=40,width=30;
        int startX=50,startY=50;

        int x1,x2,x3,x4;
        int y1,y2,y3,y4,y5,y6,y7;

        x1 = startX;
        x2 = startX+lineWidth;
        x3 = startX+lineWidth+width;
        x4 = startX+2*lineWidth+width;

        y1 = startY;
        y2 = startY+lineWidth;
        y3 = startY+lineWidth+height;
        y4 = startY+3*lineWidth/2+height;
        y5 = startY+2*lineWidth+height;
        y6 = startY+2*(lineWidth+height);
        y7 = startY+3*lineWidth+2*height;

        int[] xArray;
        int[] yArray;

        Color LED_Color = Color.RED;
        g.setColor(Color.DARK_GRAY);
        //DRAW a
        if (num==0 || num ==4 || num == 5 || num==6 || num==8 || num==9){
            g.setColor(LED_Color);
        }
        g.fillPolygon(new int[]{x1, x2, x2, x1},new int[]{y1,y2,y3,y4},4);
        g.setColor(Color.DARK_GRAY);

        //DRAW b
        if (num==0||num==2||num==3||num==5||num==6||num==7||num==8||num==9){
            g.setColor(LED_Color);
        }
        g.fillPolygon(new int[]{x1,x4,x3,x2},new int[]{y1,y1,y2,y2},4);
        g.setColor(Color.DARK_GRAY);

        //DRAW c
        if (num==0||num==1||num==2||num==3||num==4||num==7||num==8||num==9){
            g.setColor(LED_Color);}
        g.fillPolygon(new int[]{x3,x4,x4,x3},new int[]{y2,y1,y4,y3},4);
        g.setColor(Color.DARK_GRAY);

        //DRAW d
        if (num==0||num==1||num==3||num==4||num==5||num==6||num==7||num==8||num==9){g.setColor(LED_Color);}
        g.fillPolygon(new int[]{x3,x4,x4,x3},new int[]{y5,y4,y7,y6},4);
        g.setColor(Color.DARK_GRAY);

        //DRAW e
        if (num==0||num==2||num==3||num==5||num==6||num==8||num==9){g.setColor(LED_Color);}
        g.fillPolygon(new int[]{x1,x2,x3,x4},new int[]{y7,y6,y6,y7},4);
        g.setColor(Color.DARK_GRAY);

        //DRAW f
        if (num==0||num==2||num==6||num==8){g.setColor(LED_Color);}
        g.fillPolygon(new int[]{x1, x2, x2, x1},new int[]{y4,y5,y6,y7},4);
        g.setColor(Color.DARK_GRAY);

        //DRAW g
        if (num==2||num==3||num==4||num==5||num==6||num==8||num==9){g.setColor(LED_Color);}
        g.fillPolygon(new int[]{x1,x2,x3,x4,x3,x2},new int[]{y4,y3,y3,y4,y5,y5},6);
        g.setColor(Color.DARK_GRAY);


    }

}
