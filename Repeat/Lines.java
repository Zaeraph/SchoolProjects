package Repeat;
//Damien Out opdracht 11.1
import java.awt.*;
import java.applet.*;

public class Lines extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller = 1;
        int x = 0;

        while(teller <= 10) {
            x += 20;
            g.drawLine(x , 50, x, 300 );
            g.drawString("" + teller, x -5, 45 );
            teller++;
        }
    }
}
