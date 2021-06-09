import java.awt.Color;
import java.awt.Graphics;

public class Dice {

    public void drawDice(Graphics g){
        g.setColor(new java.awt.Color(149, 0, 0));
        g.fillRoundRect(50, 70, 100, 100, 10, 10);
    }
}
