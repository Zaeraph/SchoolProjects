package ButtonsAndText;
//Damien Out Java h8 praktijkopdracht
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet {
    Button but1, but2, but3, but4;
    TextField text1, text2;
    double number1, number2, number3;

    public void init() {
        text1 = new TextField(" ", 15);
        text2 = new TextField(" ", 15);
        but1 = new Button("*");
        but2 = new Button("/");
        but3 = new Button("+");
        but4 = new Button("-");
        but1.addActionListener(new but1Listener());
        but2.addActionListener(new but2Listener());
        but3.addActionListener(new but3Listener());
        but4.addActionListener(new but4Listener());
        add(text1);
        add(text2);
        add(but1);
        add(but2);
        add(but3);
        add(but4);
    }

    class but1Listener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            String s = text1.getText();
            String f = text2.getText();
            number1 = Double.parseDouble(s);
            number2 = Double.parseDouble(f);
            text1.setText("" + number1 * number2);
            text2.setText("");
        }
    }

    class but2Listener implements ActionListener {
        public void actionPerformed(ActionEvent b) {
            String s = text1.getText();
            String f = text2.getText();
            number1 = Double.parseDouble(s);
            number2 = Double.parseDouble(f);
            text1.setText("" + number1 / number2);
            text2.setText("");
        }
    }
    class but3Listener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            String s = text1.getText();
            String f = text2.getText();
            number1 = Double.parseDouble(s);
            number2 = Double.parseDouble(f);
            number3= number1 + number2;
            text1.setText("" + number3);
            text2.setText("");
        }
    }
     class but4Listener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            String s = text1.getText();
            String f = text2.getText();
            number1 = Double.parseDouble(s);
            number2 = Double.parseDouble(f);
            number3= number1 - number2;
            text1.setText("" + number3);
            text2.setText("");
        }
    }
}

