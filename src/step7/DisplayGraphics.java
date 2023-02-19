package step7;

import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel{
    public static void main(String[] args) {
        DisplayGraphics m=new DisplayGraphics();
        JFrame f=new JFrame();
        f.setBackground(Color.white);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);
        f.setSize(800,800);
        //f.setLayout(null);
        f.setVisible(true);
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        //нижний круг
        g2.setColor(Color.white);
        g2.fillOval(270, 380,240,240);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(270, 380,240,240);

        //правая рука
        g2.setColor(Color.white);
        g2.fillPolygon(new int[]{365, 615, 622, 627, 620, 642, 644, 622, 643, 640, 618, 369},
                new int[]{373, 254, 230, 230, 254, 243, 248, 259, 272, 276, 263, 382}, 12);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(4));
        g2.drawPolygon(new int[]{365, 615, 622, 627, 620, 642, 644, 622, 643, 640, 618, 369},
                new int[]{373, 254, 230, 230, 254, 243, 248, 259, 272, 276, 263, 382}, 12);

        //тело
        g2.setColor(Color.white);
        g2.fillOval(298, 225,200,200);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(298, 225,200,200);
        g2.setStroke(new BasicStroke(3));
        g2.drawOval(424, 300,17,17);
        g2.drawOval(424, 325,17,17);
        g2.drawOval(424, 350,17,17);

        //голова
        g2.setColor(Color.white);
        g2.fillOval(350, 140,110,110);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(350, 140,110,110);

        //шапка
        g2.setColor(Color.white);
        g2.fillOval(345, 127,120,25);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(345, 127,120,25);
        g2.setColor(Color.white);
        g2.fillRoundRect(372, 53,70,80, 25, 25);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(5));
        g2.drawRoundRect(372, 53,70,80, 25, 25);
        g2.drawLine(372, 115, 442, 115);

        //лицооо
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.drawOval(395, 180,15,15);
        g2.drawOval(430, 180,15,15);
        g2.setColor(Color.white);
        g2.fillPolygon(new int[]{420, 420, 485}, new int[]{198, 218, 208}, 3);
        g2.setColor(Color.black);
        g2.drawPolygon(new int[]{420, 420, 485}, new int[]{198, 218, 208}, 3);
        g2.drawOval(380, 222,9,9);
        g2.drawOval(395, 228,9,9);
        g2.drawOval(424, 222,9,9);
        g2.drawOval(410, 228,9,9);

        //левая рука
        g2.setColor(Color.white);
        g2.fillPolygon(new int[]{351, 186, 179, 174, 181, 159, 157, 179, 158, 161, 182, 348},
                new int[]{319, 254, 230, 230, 254, 243, 248, 259, 272, 276, 263, 328}, 12);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(4));
        g2.drawPolygon(new int[]{351, 186, 179, 174, 181, 159, 157, 179, 158, 161, 182, 348},
                new int[]{319, 254, 230, 230, 254, 243, 248, 259, 272, 276, 263, 328}, 12);

    }
}
