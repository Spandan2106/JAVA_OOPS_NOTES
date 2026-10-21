import java.applet.*;
import java.awt.*;

public class Name extends Applet {
    String name = "Spandan Das";
    String college = "Techno Main Salt Lake";

    public void paint(Graphics g) {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(name, 50, 50); 
        g.drawLine(50, 55, 250, 55); // Draw a line under the name
        g.setColor(Color.RED);
        g.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        g.drawString(college, 50, 80); // Draw the college name at coordinates (50, 80)
    }
}