package Repeat;
//Damien Out opdracht 11.7
import java.applet.*;
import java.awt.*;

public class Circles50 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int a = 300;
        int b = 400;
        int c = 10;
        int d = 10;

        for(teller = 1; teller <=50; teller++){
            a -= 5;
            b -= 5;
            c += 10;
            d += 10;
            g.drawOval(a, b, c ,d);
        }
    }
}
