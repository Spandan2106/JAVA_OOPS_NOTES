import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextFieldFrame extends JFrame implements ActionListener {
    JTextField t;
    JButton b;
    JLabel l;

    TextFieldFrame() {
        t = new JTextField(15);
        b = new JButton("Show");
        l = new JLabel();

        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(t);
        add(b);
        add(l);

        setSize(300, 200);
        setTitle("Text Field");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText(t.getText());
    }
}

class TextFieldDemo {
    public static void main(String[] args) {
        new TextFieldFrame();
    }
}
