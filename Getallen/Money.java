package Getallen;
//Damien Out opdracht 6.1
import java.awt.*;
import java.applet.*;

public class Money extends Applet {
    double a, b, result;

    public void init() {
        a = 113;
        b = 4;
        result = a / b;
    }
    public void paint(Graphics g) {
        g.drawString("Total earnings: " + a, 20 , 20);
        g.drawString("Earnings Jan: " + result, 20, 40);
        g.drawString("Earnings Ali: " + result, 20, 60);
        g.drawString("Earnings Jeannette: " + result, 20, 80);
        g.drawString("Earnings Damien: " + result, 20, 100);
    }
}