import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioCheckFrame extends JFrame implements ItemListener {
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    JLabel l;

    RadioCheckFrame() {
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Python");

        l = new JLabel("Select options");

        r1.addItemListener(this);
        r2.addItemListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);

        setLayout(new FlowLayout());

        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(l);

        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String s = "Selected: ";

        if (r1.isSelected()) s += "Male ";
        if (r2.isSelected()) s += "Female ";
        if (c1.isSelected()) s += "Java ";
        if (c2.isSelected()) s += "Python ";

        l.setText(s);
    }
}

class RadioCheckDemo {
    public static void main(String[] args) {
        new RadioCheckFrame();
    }
}
