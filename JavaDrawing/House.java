package JavaDrawing;
import java.applet.*;
import java.awt.*;

public class House extends Applet {
    public void inint(){
    }
    public void paint(Graphics g) {

        g.setColor (Color.black);
        g.drawLine (50, 90, 150, 50);
        g.drawLine (150, 50, 250, 90);

        g.setColor (Color.white);
        g.fillRect (50, 90, 200, 100);
        g.setColor (Color.black);
        g.drawRect (50, 90, 200, 100);

        g.fillRect (75, 110, 30, 25);
        g.fillRect (190, 110, 30, 25);

        g.setColor (Color.blue);
        g.drawLine (75, 123, 104, 123);
        g.drawLine (75+115, 123, 104+115, 123);
        g.drawLine(89, 110, 89, 134);
        g.drawLine(89+115, 110, 89+115, 134);

        g.setColor (Color.black);
        g.fillRect (130, 150, 35, 40);

    }
}
