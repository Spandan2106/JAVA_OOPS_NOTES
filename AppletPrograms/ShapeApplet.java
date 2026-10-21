
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeApplet extends Applet implements ActionListener {

    Button circle, rectangle, oval;
    String shape = "circle";

    public void init() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        circle = new Button("Circle");
        rectangle = new Button("Rectangle");
        oval = new Button("Oval");

        circle.setFont(new Font("Arial", Font.BOLD, 14));
        rectangle.setFont(new Font("Arial", Font.BOLD, 14));
        oval.setFont(new Font("Arial", Font.BOLD, 14));

        add(circle);
        add(rectangle);
        add(oval);

        circle.addActionListener(this);
        rectangle.addActionListener(this);
        oval.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == circle)
            shape = "circle";
        else if (e.getSource() == rectangle)
            shape = "rectangle";
        else
            shape = "oval";

        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Shape Drawing Applet", 65, 100);

        g.setColor(Color.BLUE);

        if (shape.equals("circle"))
            g.drawOval(125, 115, 80, 80);
        else if (shape.equals("rectangle"))
            g.drawRect(105, 130, 120, 55);
        else
            g.drawOval(100, 130, 130, 55);

        g.setColor(Color.BLACK);
        g.drawString("Selected: " + shape, 115, 230);
    }
}
