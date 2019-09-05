package Getallen;
//Damien Out Java praktijkopdracht H6
import java.awt.*;
import java.applet.*;

public class Average extends Applet {
    double a, b, c, d, result, result3;
    int result2;
    int geheel;
    double gebroken;




    public void init(){
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        result = (a + b +c) / d;
        result2 =(int)(result * 10);
        result3 = (double)result2 / 10;




    }

    public void paint(Graphics g){
        g.drawString("Average: " + result3, 20, 20);
    }
}