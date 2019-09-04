package IntroductionJava;
import java.awt.*;
import java.applet.*;

public class JavaColor extends Applet {
    public void init(){
        setBackground(Color.blue);
    }
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java", 50 , 60);
    }
}
