import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class StudentResultApplet extends Applet implements ActionListener {

    TextField name, m1, m2, m3, m4, m5;
    Label result;
    Button calculate, clear;

    public void init() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        setBackground(Color.lightGray);

        Label title = new Label("STUDENT RESULT CALCULATOR");
        title.setFont(new Font("Arial", Font.BOLD, 18));

        name = new TextField(15);
        m1 = new TextField(5);
        m2 = new TextField(5);
        m3 = new TextField(5);
        m4 = new TextField(5);
        m5 = new TextField(5);

        calculate = new Button("Calculate Result");
        clear = new Button("Clear");

        result = new Label("Result will be displayed here.");

        add(title);

        add(new Label("Student Name:"));
        add(name);

        add(new Label("Subject 1:"));
        add(m1);

        add(new Label("Subject 2:"));
        add(m2);

        add(new Label("Subject 3:"));
        add(m3);

        add(new Label("Subject 4:"));
        add(m4);

        add(new Label("Subject 5:"));
        add(m5);

        add(calculate);
        add(clear);
        add(result);

        calculate.setBackground(Color.green);
        clear.setBackground(Color.orange);

        calculate.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calculate) {
            try {
                String studentName = name.getText();

                int a = Integer.parseInt(m1.getText());
                int b = Integer.parseInt(m2.getText());
                int c = Integer.parseInt(m3.getText());
                int d = Integer.parseInt(m4.getText());
                int f = Integer.parseInt(m5.getText());

                if (studentName.trim().isEmpty() ||
                    a < 0 || a > 100 ||
                    b < 0 || b > 100 ||
                    c < 0 || c > 100 ||
                    d < 0 || d > 100 ||
                    f < 0 || f > 100) {

                    result.setText("Enter valid name and marks (0-100)!");
                    return;
                }

                int total = a + b + c + d + f;
                double percentage = total / 5.0;

                String grade;

                if (percentage >= 90) {
                    grade = "A+";
                } 
                else if (percentage >= 80) {
                    grade = "A";
                } 
                else if (percentage >= 70) {
                    grade = "B";
                } 
                else if (percentage >= 60) {
                    grade = "C";
                } 
                else if (percentage >= 40) {
                    grade = "D";
                } 
                else {
                    grade = "Fail";
                }

                result.setText("Name: " + studentName +
                    " | Total: " + total +
                    " | Percentage: " + percentage +
                    "% | Grade: " + grade);

            } catch (NumberFormatException ex) {
                result.setText("Enter valid marks!");
            }
        }

        else if (e.getSource() == clear) {
            name.setText("");
            m1.setText("");
            m2.setText("");
            m3.setText("");
            m4.setText("");
            m5.setText("");

            result.setText("Result will be displayed here.");
        }
    }
}
