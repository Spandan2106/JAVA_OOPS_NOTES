import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JPanel;  
import javax.swing.SwingUtilities;  

public class Main2 extends JFrame {  
    public Main2() {  
        initUI();  
    }  
    public final void initUI() {  
        JPanel panel = new JPanel();  
        getContentPane().add(panel);  
        panel.setLayout(null);  
        panel.setToolTipText("A Panel container");  
        JButton button = new JButton("Button");  
        button.setBounds(100, 60, 100, 30);  
        button.setToolTipText("A button component");  
        panel.add(button);  
        setTitle("Tooltip");  
        setSize(300, 200);  
        setLocationRelativeTo(null);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public static void main(String[] args) {  
       SwingUtilities.invokeLater(new Runnable() {  
           @Override  
           public void run() {  
               Main2 ex = new Main2();  
               ex.setVisible(true);  
           }  
       });  
    }  
}  