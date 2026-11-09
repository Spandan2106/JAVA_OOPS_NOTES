import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class ListFrame extends JFrame implements ListSelectionListener {
    JList<String> list;
    JLabel l;

    ListFrame() {
        String[] items = {"Java", "Python", "C", "C++"};

        list = new JList<>(items);
        l = new JLabel("Select a language");

        list.addListSelectionListener(this);

        setLayout(new FlowLayout());
        add(new JScrollPane(list));
        add(l);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting())
            l.setText("Selected: " + list.getSelectedValue());
    }
}

class ListDemo {
    public static void main(String[] args) {
        new ListFrame();
    }
}
