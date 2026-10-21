import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Shape extends Applet implements ActionListener{
    Button b1,b2,b3,b4;
    String Shape = "";
    String msg = "";

    public void init(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1 = new Button("Circle");
        b1.setSize(1150,50);
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b2 = new Button("Rectangle");
        b2.setSize(1150,50);
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b3 = new Button("Oval");
        b3.setSize(1150,50);
        b3.setFont(new Font("Arial", Font.BOLD, 16));
        b4 = new Button("Line");
        b4.setSize(1150,50);
        b4.setFont(new Font("Arial", Font.BOLD, 16));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            Shape = "Circle";
        }
        else if(e.getSource() == b2){
            Shape = "Rectangle";
        }
        else if(e.getSource() == b3){
            Shape = "Oval";
        }
        else if(e.getSource() == b4){
            Shape = "Line";
        }
        repaint();
    }

    public void paint(Graphics g){
        if(Shape.equals("Circle")){
            g.setColor(Color.BLUE);
            g.fillOval(100,100,200,200);
            g.drawString("Circle", 200, 350);
        }
        else if(Shape.equals("Rectangle")){
            g.setColor(Color.RED);
            g.fillRect(100,100,200,200);
            g.drawString("Rectangle", 200, 350);
        }
        else if(Shape.equals("Oval")){
            g.setColor(Color.GREEN);
            g.fillOval(100,100,300,200);
            g.drawString("Oval", 200, 350);
        }
        else if(Shape.equals("Line")){
            g.setColor(Color.BLACK);
            g.drawLine(100,100,300,300);
            g.drawString("Line", 200, 350);
        }
    }
}