import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApplet extends Applet implements ActionListener {

    TextField t1, t2;
    Label result;
    Button add, sub, mul, div;

    public void init() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
        setBackground(Color.lightGray);

        Label l1 = new Label("First Number:");
        t1 = new TextField(10);

        Label l2 = new Label("Second Number:");
        t2 = new TextField(10);

        add = new Button("Addition");
        sub = new Button("Subtraction");
        mul = new Button("Multiplication");
        div = new Button("Division");

        result = new Label("Result: ");

        add(l1);
        add(t1);
        add(l2);
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(result);

        add.setBackground(Color.green);
        sub.setBackground(Color.yellow);
        mul.setBackground(Color.cyan);
        div.setBackground(Color.orange);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double ans = 0;

            if (e.getSource() == add) {
                ans = a + b;
            } 
            else if (e.getSource() == sub) {
                ans = a - b;
            } 
            else if (e.getSource() == mul) {
                ans = a * b;
            } 
            else if (e.getSource() == div) {
                if (b == 0) {
                    result.setText("Cannot divide by zero!");
                    return;
                }
                ans = a / b;
            }

            result.setText("Result: " + ans);

        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers!");
        }
    }
}
