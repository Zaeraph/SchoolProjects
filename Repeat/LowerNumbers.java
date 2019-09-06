package Repeat;
//Damien Out opdracht 11.2
import java.awt.*;
import java.applet.*;

public class LowerNumbers extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 30;

        for(teller = 20; teller >= 10; teller--){
            x += 20;
            g.drawString("" + teller, x, 40);
        }
    }

}

