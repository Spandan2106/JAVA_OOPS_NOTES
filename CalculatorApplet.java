
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {
    TextField t1, t2, result;
    Button b1, b2, b3, b4;

    public void init() {
        setLayout(new GridLayout(4, 1, 5, 10));
        setBackground(Color.LIGHT_GRAY);

        Font f = new Font("Arial", Font.BOLD, 20);

        Panel p1 = new Panel();
        p1.setBackground(Color.LIGHT_GRAY);

        Label l1 = new Label("A:");
        Label l2 = new Label("B:");

        l1.setFont(f);
        l2.setFont(f);

        t1 = new TextField(10);
        t2 = new TextField(10);

        t1.setFont(f);
        t2.setFont(f);

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);

        Panel p2 = new Panel();
        p2.setBackground(Color.LIGHT_GRAY);

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");

        Button buttons[] = {b1, b2, b3, b4};
        Color colors[] = {
            Color.GREEN, Color.ORANGE,
            Color.BLUE, Color.RED
        };

        for (int i = 0; i < 4; i++) {
            buttons[i].setFont(f);
            buttons[i].setBackground(colors[i]);
            buttons[i].addActionListener(this);
            p2.add(buttons[i]);
        }

        Panel p3 = new Panel();
        p3.setBackground(Color.LIGHT_GRAY);

        Label l3 = new Label("Result:");
        l3.setFont(f);

        result = new TextField(20);
        result.setFont(f);
        result.setEditable(false);

        p3.add(l3);
        p3.add(result);

        add(p1);
        add(p2);
        add(p3);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double c = 0;

            if (e.getSource() == b1)
                c = a + b;
            else if (e.getSource() == b2)
                c = a - b;
            else if (e.getSource() == b3)
                c = a * b;
            else if (e.getSource() == b4) {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                c = a / b;
            }

            result.setText("" + c);
        }
        catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }
}
