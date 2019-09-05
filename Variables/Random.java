package Variables;
//Damien Out opdracht 5.2
import java.applet.*;
import java.awt.*;

public class Random extends Applet{
    int random = (int )(Math.random() * 100 + 1);
    int random1 = (int )(Math.random() * 100 + 1);
    int random2 = (int )(Math.random() * 100 + 1);

    public void init() {

    }

        public void paint(Graphics g){
            g.drawLine(80, 20, 80, 200);
            g.drawLine(280, 200, 80,200);
            g.setColor(Color.red);
            g.fillRect(110, 200 - random, 40, random);
            g.setColor(Color.BLUE);
            g.fillRect(170, 200 - random1, 40,random1);
            g.setColor(Color.orange);
            g.fillRect(230, 200 - random2, 40, random2);

            g.setColor(Color.black);
            g.drawString("Valerie", 110, 215);
            g.drawString("Jeroen", 170, 215);
            g.drawString("Hans", 230, 215);

            g.drawString("100", 55, 30);
            g.drawString("80", 55, 65);
            g.drawString("60", 55, 100);
            g.drawString("40", 55, 135);
            g.drawString("20", 55, 170);
            g.drawString("0", 55, 205);

        }


}
