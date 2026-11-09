import javax.swing.*;
import java.awt.event.*;

class MenuFrame extends JFrame implements ActionListener {
    JMenuItem i1, i2, i3;
    JLabel l;

    MenuFrame() {
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");

        i1 = new JMenuItem("Open");
        i2 = new JMenuItem("Save");
        i3 = new JMenuItem("Exit");

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        mb.add(menu);
        setJMenuBar(mb);

        l = new JLabel("Select a menu item");
        add(l);

        setSize(350, 200);
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == i1)
            l.setText("Open Selected");
        else if (e.getSource() == i2)
            l.setText("Save Selected");
        else
            System.exit(0);
    }
}

class MenuDemo {
    public static void main(String[] args) {
        new MenuFrame();
    }
}
