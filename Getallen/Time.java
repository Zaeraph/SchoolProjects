package Getallen;
//Damien Out opdracht 6.2
import java.awt.*;
import java.applet.*;

public class Time extends Applet {
    int a, b, c, result, result2, result3;



    public void init(){
        a = 60;
        b = 24;
        c = 365;
        result = (a * a);
        result2 = result * b;
        result3 = result2 * c;
    }
    public void paint(Graphics g){
        g.drawString("Seconds in an hour: " + result, 20, 20);
        g.drawString("Seconds in a day: " + result2, 20, 40);
        g.drawString("Seconds in a year: " + result3, 20, 60);
    }
}
