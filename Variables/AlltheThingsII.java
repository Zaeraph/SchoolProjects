package Variables;
//Damien Out opdracht 5.1
import java.applet.*;
import java.awt.*;

public class AlltheThingsII extends Applet {
    Color filling;
    Color line;
    int height;
    int width;

    public void init(){
        filling = Color.magenta;
        line = Color.black;
        height = 40;
        width = 60;

    }
    public void paint(Graphics g){
        g.drawLine(20,20,80,20);
        g.drawRect(20, 40, width, height);
        g.drawRoundRect(20, 100, width, height, 30, 30);
        g.setColor(filling);
        g.fillRect(100,40, width, height);
        g.fillOval(100, 100, width, height);
        g.fillArc(180, 40, width, height, 0, 45);
        g.setColor(line);
        g.drawOval(100,40, width -1, height -1);
        g.drawOval(180,40, width, height);
        g.drawOval(180, 100, height, height);

    }
}
