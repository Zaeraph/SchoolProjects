package JavaDrawing;
import java.awt.*;
import java.applet.*;

public class Ellipse extends Applet {
    public void init() {
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillArc(20, 20, 50, 50, 90, 360);
    }
}