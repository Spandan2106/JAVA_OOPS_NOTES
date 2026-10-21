import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Button1 extends Applet implements ActionListener{
    Button b1, b2,b3;
    Color c = Color.WHITE;

    public void init(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1 = new Button("Red");
        b1.setSize(1150,50);
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b2 = new Button("Green");
        b2.setSize(1150,50);
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b3 = new Button("Blue");
        b3.setSize(1150,50);
        b3.setFont(new Font("Arial", Font.BOLD, 16));
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            c = Color.RED;
        }
        else if(e.getSource() == b2){
            c = Color.GREEN;
        }
        else if(e.getSource() == b3){
            c = Color.BLUE;
        }
        setBackground(c);
        repaint();
    }

}