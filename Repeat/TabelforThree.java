package Repeat;
//Damien Out opdracht 11.4
import java.awt.*;
import java.applet.*;

public class TabelforThree extends Applet{

        public void init() {}

        public void paint(Graphics g) {
            int teller;
            int totaal = 0;
            int drie = 3;
            int y = 30;

            for(teller = 1; teller <= 10; teller++){
                y += 20;
                totaal = teller * drie;
                g.drawString(teller + " x " + drie + " = " + totaal , 50, y);
            }
        }

}
