package ButtonsAndText;
//Damien out opdracht 8.3
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BTW extends Applet{
    TextField text;
    double number;
    double btw;
    Button button;

    public void init() {
        text = new TextField("", 15);
        button = new Button("bereken BTW");
        button.addActionListener( new buttonListener() );
        btw = 1.21;
        add(text);
        add(button);
    }

    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = text.getText();
            number = Double.parseDouble( s );
            text.setText("" + number * btw);
            repaint();
        }
    }
}
