import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonFrame extends JFrame implements ActionListener {
    JButton b;
    JLabel l;

    ButtonFrame() {
        b = new JButton("Click Me");
        l = new JLabel("Welcome");

        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(b);
        add(l);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked!");
    }
}

class ButtonDemo {
    public static void main(String[] args) {
        new ButtonFrame();
    }
}
