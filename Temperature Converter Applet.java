
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Compute2 extends Applet implements ActionListener {
    TextField t1;
    Button b;
    Label result;

    public void init() {
        setLayout(new FlowLayout());
        setBackground(Color.CYAN);

        Label l = new Label("Enter Celsius:");
        l.setFont(new Font("Arial", Font.BOLD, 18));
        add(l);

        t1 = new TextField(10);
        add(t1);

        b = new Button("Convert");
        b.setBackground(Color.ORANGE);
        b.addActionListener(this);
        add(b);

        result = new Label("Fahrenheit: ");
        result.setFont(new Font("Arial", Font.BOLD, 22));
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double c = Double.parseDouble(t1.getText());

            double f = (c * 9 / 5) + 32;

            result.setText("Fahrenheit: " + f);
        }
        catch (NumberFormatException ex) {
            result.setText("Enter a valid temperature");
        }
    }
}
