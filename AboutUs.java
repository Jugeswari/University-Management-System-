
package university_management_system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{
     JLabel l1,l2,l3,l4,l5;
     String test="'Kalahandi University, is a state public University located in Bhawanipatna, the district headquarters of Kalahandi district, Odisha, India formerly called as Government College, Bhawanipatna";
     String test1="Address: W59G+MH7, College Street, Kanakpur, Bhawanipatna, Odisha 766001";
    public AboutUs(){
        super("About Us");       
        setBounds(300,150,900,500);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#b0003a"));
        l1 = new JLabel("ABOUT US");
        l1.setForeground(Color.white);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(new Font("Rockwell",Font.BOLD,30));
        l1.setBounds(200,20,500,30);
        add(l1);
        
        
        l2 = new JLabel();
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("images/Home_Bg.jpg"));
        Image i1 = i.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        l2 = new JLabel(i2);
        l2.setBounds(50,50,400,400);
        add(l2);
        
        l3 = new JLabel("Kalahandi University");
        l3.setForeground(Color.decode("#ff6090"));
        l3.setFont(new Font("Georgia", Font.BOLD, 20));
        l3.setBounds(420, 130, 300, 40);
        add(l3);
        
        l4 = new JLabel("<html>"+test+"</html>");
        l4.setForeground(Color.white);
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setBounds(420, 180, 400, 100);
        add(l4);
        
        l5 = new JLabel("<html>"+test1+"</html");
        l5.setForeground(Color.white);
        l5.setFont(new Font("Arial", Font.BOLD, 17));
        l5.setBounds(420, 265, 400, 100);
        add(l5);
       
        
      
        
    }
    
     
    public static void main(String args[])
    {
        new AboutUs().setVisible(true);
    }
}

