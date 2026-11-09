import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ComboFrame extends JFrame implements ActionListener {
    JComboBox<String> cb;
    JLabel l;

    ComboFrame() {
        String[] items = {"Java", "Python", "C", "C++"};

        cb = new JComboBox<>(items);
        l = new JLabel("Select a language");

        cb.addActionListener(this);

        setLayout(new FlowLayout());
        add(cb);
        add(l);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Selected: " + cb.getSelectedItem());
    }
}

class ComboDemo {
    public static void main(String[] args) {
        new ComboFrame();
    }
}
