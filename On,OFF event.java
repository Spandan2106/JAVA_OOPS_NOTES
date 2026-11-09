import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ToggleFrame extends JFrame implements ItemListener {
    JToggleButton b;
    JLabel l;

    ToggleFrame() {
        b = new JToggleButton("OFF");
        l = new JLabel("OFF");

        b.addItemListener(this);

        setLayout(new FlowLayout());
        add(b);
        add(l);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (b.isSelected()) {
            b.setText("ON");
            l.setText("Button is ON");
        } else {
            b.setText("OFF");
            l.setText("Button is OFF");
        }
    }
}

class ToggleDemo {
    public static void main(String[] args) {
        new ToggleFrame();
    }
}
