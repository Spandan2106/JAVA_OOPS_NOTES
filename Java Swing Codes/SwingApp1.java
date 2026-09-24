//Java Program to create Swing application in Java    
import javax.swing.*;    
public class SwingApp1 {    
SwingApp1(){    
//Creating instance of JFrame class    
JFrame f = new JFrame();    
    
//Creating Swing Components    
JLabel firstName = new JLabel("First Name");    
firstName.setBounds(20, 50, 80, 20);    
    
JLabel lastName = new JLabel("Last Name");    
lastName.setBounds(20, 80, 80, 20);    
    
JLabel dob = new JLabel("Date of Birth");    
dob.setBounds(20, 110, 80, 20);    
    
JTextField firstNameTF = new JTextField();    
firstNameTF.setBounds(120, 50, 100, 20);    
    
JTextField lastNameTF = new JTextField();    
lastNameTF.setBounds(120, 80, 100, 20);    
    
JTextField dobTF = new JTextField();    
dobTF.setBounds(120, 110, 100, 20);    
    
JButton sbmt = new JButton("Submit");    
sbmt.setBounds(20, 160, 100, 30);    
    
JButton reset = new JButton("Reset");    
reset.setBounds(120,160,100,30);    
    
//Adding Components on JFrame    
f.add(firstName);    
f.add(lastName);    
f.add(dob);    
f.add(firstNameTF);    
f.add(lastNameTF);    
f.add(dobTF);    
f.add(sbmt);    
f.add(reset);    
    
//Set size, layout and visibility of the JFrame    
f.setSize(300,300);    
f.setLayout(null);    
f.setVisible(true);    
}    
    
//Creating the main method to create object of the class    
public static void main(String[] args) {    
SwingApp1 s = new SwingApp1();    
}    
}    