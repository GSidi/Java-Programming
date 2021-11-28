package JavaBook.GUI_JAVA;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        //sxediash proswpou
        g.setColor(Color.RED);
        g.fillOval(10, 10, 200, 200);

        //sxediasmos matiwn
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        //sxediazei to stoma
        g.fillOval(50, 110, 120, 60);

        //bazei xamogelo sto stoma
        g.setColor(Color.RED);
        g.fillRect(50, 110, 120, 30);
        g.fillRect(50, 120, 120, 40);

    }

}