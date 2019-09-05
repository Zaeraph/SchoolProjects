package ButtonsAndText;
//Damien out opdracht 8.1
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ButText extends Applet{
    Button button;
    Button button2;
    TextField text;
    Label label;
    String s;

    public void init() {
        text = new TextField(15);
        button = new Button("Ok");
        button2 = new Button(" refresh ");
        label = new Label("Type iets in het tekstvak ");
        button.addActionListener( new buttonListener() );
        button2.addActionListener(new buttonListener2());
        add(label);
        add(text);
        add(button);
        add(button2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }

    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = text.getText();
            repaint();
        }
    }
    class buttonListener2 implements ActionListener{
        public void actionPerformed(ActionEvent f){
            text.setText("");
            s = text.getText();
            repaint();
        }
    }
}