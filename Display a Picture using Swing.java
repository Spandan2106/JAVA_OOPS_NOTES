import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PictureFrame extends JFrame {
    PictureFrame() {
        ImageIcon img = new ImageIcon("photo.jpg");
        JLabel l = new JLabel(img);

        add(l);
        setSize(400, 400);
        setTitle("Picture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class Picture {
    public static void main(String[] args) {
        new PictureFrame();
    }
}
