package Repeat;
//Damien Out opdracht 11.6
import java.awt.*;
import java.applet.*;

public class Circles5 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int a = 200;
        int b = 150;
        int c = 10;
        int d = 10;

        for(teller = 1; teller <=5; teller++){
            a -= 5;
            b -= 5;
            c += 10;
            d += 10;
            g.drawOval(a, b, c ,d);
        }

    }
}
