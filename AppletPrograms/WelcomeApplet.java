
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeApplet extends Applet
        implements ActionListener {

    Button welcome, increase, decrease;
    String msg = "Click Welcome to start!";
    int fontSize = 18;

    public void init() {
        setLayout(null);

        welcome = new Button("Welcome");
        increase = new Button("A+");
        decrease = new Button("A-");

        welcome.setBounds(20, 20, 100, 35);
        increase.setBounds(135, 20, 60, 35);
        decrease.setBounds(205, 20, 60, 35);

        add(welcome);
        add(increase);
        add(decrease);

        welcome.addActionListener(this);
        increase.addActionListener(this);
        decrease.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == welcome) {
            msg = "Welcome to Java Applets!";
        } else if (e.getSource() == increase) {
            fontSize = fontSize + 2;
        } else if (e.getSource() == decrease) {
            if (fontSize > 8)
                fontSize = fontSize - 2;
        }

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Welcome Message Demonstration", 20, 90);

        g.setFont(new Font("Arial", Font.PLAIN, fontSize));
        g.drawString(msg, 20, 140);

        g.setFont(new Font("Arial", Font.PLAIN, 12));
        g.drawString("Use A+ to increase and A- to decrease text size.", 20, 190);
    }
}
