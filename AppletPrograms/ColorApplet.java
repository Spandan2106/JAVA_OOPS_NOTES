
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ColorApplet extends Applet implements ActionListener {

    Button red, green, blue;

    public void init() {
        setLayout(null);

        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");

        // Set button sizes: width = 80, height = 35
        red.setBounds(30, 30, 80, 35);
        green.setBounds(120, 30, 80, 35);
        blue.setBounds(210, 30, 80, 35);

        add(red);
        add(green);
        add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red)
            setBackground(Color.RED);
        else if (e.getSource() == green)
            setBackground(Color.GREEN);
        else if (e.getSource() == blue)
            setBackground(Color.BLUE);

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Java Applet: Background Colour Demo", 30, 100);
        g.drawString("Click a button to change the background.", 30, 125);
        g.drawString("Buttons are created and resized in init().", 30, 150);
    }
}
