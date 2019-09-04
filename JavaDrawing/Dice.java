package JavaDrawing;
//Damien Out opdracht 4.7
import java.applet.*;
import java.awt.*;

public class Dice extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(100, 60, 200, 200, 30, 30);
        g.fillArc(130, 90, 40, 40, 90, 360);
        g.fillArc(130, 190, 40, 40, 90, 360);
        g.fillArc(230, 90, 40, 40, 90, 360);
        g.fillArc(230, 190, 40, 40, 90, 360);
        g.drawString("Dice dice baby", 160, 160);

    }
}
