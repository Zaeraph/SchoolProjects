package Getallen;
//Damien Out opdracht 6.3
import java.awt.*;
import java.applet.*;



public class Negative extends Applet {
    int a, result;



    public void init(){
        a = 6763186;
        result = a + a;
    }
    public void paint(Graphics g){
        g.drawString("-"+result, 20, 20);
    }
}