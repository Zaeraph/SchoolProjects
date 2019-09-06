package Repeat;
//Damien Out opdracht 11.8
import java.awt.*;
import java.applet.*;

public class Hundred extends Applet{
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int a = 60;
        int b = 60;
        int c = 10;
        int d = 10;

        for(teller = 1; teller <=100; teller++){
            c += 10;
            d += 10;
            g.drawOval(a, b, c ,d);
        }

    }
}
