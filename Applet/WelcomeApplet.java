import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeApplet extends JPanel implements ActionListener {
    private final JLabel lblMessage;

    public WelcomeApplet() {
        setLayout(new FlowLayout());

        JButton btnGreet = new JButton("Click Here");
        lblMessage = new JLabel("Press the button to see the welcome message.");

        btnGreet.addActionListener(this);

        add(btnGreet);
        add(lblMessage);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Welcome");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new WelcomeApplet());
            frame.setSize(350, 150);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lblMessage.setText("Welcome to Java Swing Program!");
    }
}