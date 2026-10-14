import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApplet extends JPanel implements ActionListener {
    private JTextField screen;
    private double num1 = 0;
    private double num2 = 0;
    private char operator = ' ';
    private boolean startNewNumber = true;

    public CalculatorApplet() {
        // Set the primary layout
        setLayout(new BorderLayout());

        // 1. Calculator Screen Display (JTextField)
        screen = new JTextField("0");
        screen.setEditable(false);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setFont(new Font("Arial", Font.BOLD, 22));
        screen.setBackground(Color.WHITE);
        add(screen, BorderLayout.NORTH);

        // 2. Button Panel with GridLayout (4 rows, 4 columns)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // Calculator Button Labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+",
            "%"
        };

        // Create and register each button
        for (String label : buttons) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new CalculatorApplet());
            frame.setSize(320, 380);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        // If a digit is clicked
        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') {
            if (startNewNumber || screen.getText().equals("0")) {
                screen.setText(cmd);
                startNewNumber = false;
            } else {
                screen.setText(screen.getText() + cmd);
            }
        } 
        // If Clear 'C' is clicked
        else if (cmd.equals("C")) {
            screen.setText("0");
            num1 = 0;
            num2 = 0;
            operator = ' ';
            startNewNumber = true;
        } 
        // If Equals '=' is clicked
        else if (cmd.equals("=")) {
            try {
                num2 = Double.parseDouble(screen.getText());
                double result = 0;

                switch (operator) {
                    case '+': 
                        result = num1 + num2; 
                        break;
                    case '-': 
                        result = num1 - num2; 
                        break;
                    case '*': 
                        result = num1 * num2; 
                        break;
                    case '/': 
                        if (num2 == 0) {
                            screen.setText("Error: Div by 0");
                            startNewNumber = true;
                            return;
                        }
                        result = num1 / num2; 
                        break;
                    case '%': 
                        result = num1 % num2; 
                        break;
                    default:
                        result = num2;
                }

                screen.setText(String.valueOf(result));
                startNewNumber = true;
            } catch (NumberFormatException ex) {
                screen.setText("Error");
                startNewNumber = true;
            }
        } 
        // If an operator (+, -, *, /, %) is clicked
        else {
            try {
                num1 = Double.parseDouble(screen.getText());
                operator = cmd.charAt(0);
                startNewNumber = true;
            } catch (NumberFormatException ex) {
                screen.setText("Error");
            }
        }
    }
}