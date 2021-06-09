import java.awt.Color;

import javax.swing.JFrame;
import java.awt.Graphics;

public class Surface extends JFrame{

    Dice dice = new Dice();

    public Surface(){
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(500, 200);
        this.setTitle("Yahtzee");
        // this.getContentPane().setBackground(new java.awt.Color(3, 88, 16));
    }

    

    public void paint (Graphics g){
        g.setColor(new java.awt.Color(3, 88, 16));
        g.fillRect(0, 0, 800, 800);

        dice.drawDice(g);
    }
}
