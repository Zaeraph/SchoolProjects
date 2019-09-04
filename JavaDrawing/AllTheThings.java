package JavaDrawing;
import java.applet.*;
import java.awt.*;

public class AllTheThings extends Applet {
    public void init(){
    }
    public void paint(Graphics g){
        g.drawLine(20,20,80,20);
        g.drawRect(20, 40, 60, 40);
        g.drawRoundRect(20, 100, 60, 40, 30, 30);
        g.setColor(Color.magenta);
        g.fillRect(100,40, 60, 40);
        g.fillOval(100, 100, 60, 40);
        g.fillArc(180, 40, 60,40, 0, 45);
        g.setColor(Color.black);
        g.drawOval(100,40,59,39);
        g.drawOval(180,40,60,40);
        g.drawOval(180, 100, 40, 40);
    }
}
