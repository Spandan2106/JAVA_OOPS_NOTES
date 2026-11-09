import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ScrollFrame extends JFrame implements AdjustmentListener {
    JScrollBar bar;
    JLabel l;

    ScrollFrame() {
        bar = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 110);
        l = new JLabel("Value: 0");

        bar.addAdjustmentListener(this);

        setLayout(new FlowLayout());
        add(bar);
        add(l);

        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        l.setText("Value: " + bar.getValue());
    }
}

class ScrollDemo {
    public static void main(String[] args) {
        new ScrollFrame();
    }
}
