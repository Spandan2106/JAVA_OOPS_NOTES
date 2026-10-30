
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Compute1 extends Applet implements ActionListener {
    TextField t1, t2, t3;
    Button b;
    Label result;

    public void init() {
        setLayout(new FlowLayout());

        setBackground(Color.LIGHT_GRAY);

        add(new Label("Subject 1:"));
        t1 = new TextField(8);
        add(t1);

        add(new Label("Subject 2:"));
        t2 = new TextField(8);
        add(t2);

        add(new Label("Subject 3:"));
        t3 = new TextField(8);
        add(t3);

        b = new Button("Calculate");
        b.setBackground(Color.GREEN);
        b.addActionListener(this);
        add(b);

        result = new Label("Result will appear here");
        result.setFont(new Font("Arial", Font.BOLD, 20));
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double c = Double.parseDouble(t3.getText());

            if (a < 0 || a > 100 || b < 0 || b > 100
                    || c < 0 || c > 100) {
                result.setText("Enter marks between 0 and 100");
                return;
            }

            double total = a + b + c;
            double avg = total / 3;

            result.setText("Total: " + total + " Average: " + avg);
        }
        catch (NumberFormatException ex) {
            result.setText("Enter valid marks");
        }
    }
}
