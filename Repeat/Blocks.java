package Repeat;
//Damien Out opdracht 11.5
import java.applet.*;
import java.awt.*;

public class Blocks extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        int teller;

        for (teller = 1; teller <= 5; teller++) {
            x += 20;
            y += 20;
            g.drawRect(x, y, 20, 20);
        }
    }
}
