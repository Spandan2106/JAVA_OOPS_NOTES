
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {
    TextField t1, t2;
    Button b1, b2, b3, b4;
    Label result;

    public void init() {
        setLayout(new GridLayout(4, 1, 10, 10));
        setBackground(Color.LIGHT_GRAY);

        t1 = new TextField(15);
        t2 = new TextField(15);

        t1.setFont(new Font("Arial", Font.BOLD, 22));
        t2.setFont(new Font("Arial", Font.BOLD, 22));

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");

        Button[] buttons = {b1, b2, b3, b4};
        Color[] colors = {Color.GREEN, Color.ORANGE, Color.BLUE, Color.RED};

        for (int i = 0; i < 4; i++) {
            buttons[i].setBackground(colors[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 22));
            buttons[i].addActionListener(this);
        }

        result = new Label("Result:", Label.CENTER);
        result.setFont(new Font("Arial", Font.BOLD, 26));

        Panel p1 = new Panel();
        p1.add(new Label("First number:"));
        p1.add(t1);
        p1.add(new Label("Second number:"));
        p1.add(t2);

        Panel p2 = new Panel();
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        add(p1);
        add(p2);
        add(result);
        add(new Label("", Label.CENTER));
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

            result.setText("Result: " + c);
        }
        catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }
}
