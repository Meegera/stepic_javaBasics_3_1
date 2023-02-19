package step6;

import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(200, 68, 145, 375, 25, 50);
        g.fillArc(222, 30, 100, 55, 0, 180);
        g.fillRoundRect(245, 453, 55, 70, 20, 20);

        g.fillPolygon(new int[] {125, 190, 190}, new int[] {70, 70, 135}, 3);
        g.setColor(Color.lightGray);
        g.fillArc(123, 60, 30, 30, 115, 70);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(127, 69, 30, 30, 113, 30);
        g.setColor(Color.lightGray);
        g.fillArc(170, 106, 30, 30, 245, 70);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(167, 97, 30, 30, 268, 32);

        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(new int[] {355, 355, 420}, new int[] {135, 70, 70}, 3);
        g.setColor(Color.lightGray);
        g.fillArc(391, 60, 30, 30, 353, 70);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(383, 63, 30, 30, 358, 37);
        g.setColor(Color.lightGray);
        g.fillArc(350, 110, 30, 30, 195, 70);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(346, 90, 30, 30, 244, 40);



        g.setColor(Color.white);
        g.fillArc(222, 76, 100, 55, 0, 180);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(222, 84, 100, 55, 0, 180);
        g.setColor(Color.white);
        g.fillArc(222, 196, 100, 55, 0, 180);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(222, 204, 100, 55, 0, 180);
        g.setColor(Color.white);
        g.fillArc(222, 316, 100, 55, 0, 180);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(222, 324, 100, 55, 0, 180);


        g.setColor(Color.red);
        g.fillOval(222, 90,100,100);
        g.setColor(Color.yellow);
        g.fillOval(222, 210,100,100);
        g.setColor(Color.green);
        g.fillOval(222, 330,100,100);

    }
    public static void main(String[] args) {
        DisplayGraphics m=new DisplayGraphics();
        JFrame f=new JFrame();
        f.setBackground(Color.lightGray);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);
        f.setSize(600,600);
        //f.setLayout(null);
        f.setVisible(true);
    }

}