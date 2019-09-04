package IntroductionJava;
import java.applet.*;
import java.awt.*;

public class ColouredName extends Applet{
    public void init(){
        setBackground(Color.yellow);
    }
    public void paint (Graphics d){
        d.setColor(Color.blue);
        d.drawString("Damien", 40, 60);
        d.setColor(Color.red);
        d.drawString("Out", 40, 70);
    }

}
