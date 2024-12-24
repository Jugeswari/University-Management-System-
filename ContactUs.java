
package university_management_system;

import java.awt.*;
import javax.swing.*;

public class ContactUs extends JFrame {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    
    public ContactUs(){
        super("Contact Us");       
        setBounds(460,200,700,500);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#b0003a"));
        l1 = new JLabel("CONTACT US");
        l1.setForeground(Color.white);
        l1.setFont(new Font("Arial",Font.BOLD,30));
        l1.setBounds(260,20,200,30);
        add(l1);
        
        
        
        l2 = new JLabel();
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("images/Home_Bg.jpg"));
        Image i1 = i.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        l2 = new JLabel(i2);
        l2.setBounds(20,50,400,400);
        add(l2);
        
        l3 = new JLabel("University");
        l3.setForeground(Color.decode("#ff6090"));
        l3.setFont(new Font("Georgia", Font.BOLD, 20));
        l3.setBounds(465, 100, 200, 40);
        add(l3);
        
        l4 = new JLabel("Management System");
        l4.setForeground(Color.decode("#ff6090"));
        l4.setFont(new Font("Georgia", Font.BOLD, 20));
        l4.setBounds(430, 130, 300, 40);
        add(l4);
        
        l5 = new JLabel("Developed By: Barsha Meher");
        l5.setForeground(Color.white);
        l5.setFont(new Font("Arial", Font.BOLD, 17));
        l5.setBounds(420, 180, 400, 40);
        add(l5);
        
        l6 = new JLabel("Phone: 7991000945");
        l6.setForeground(Color.white);
        l6.setFont(new Font("Arial", Font.BOLD, 17));
        l6.setBounds(450, 210, 300, 40);
        add(l6);
        
        l7 = new JLabel("Email: barshameher976@gmail.com");
        l7.setForeground(Color.white);
        l7.setFont(new Font("Arial", Font.PLAIN, 16));
        l7.setBounds(400, 240, 400, 40);
        add(l7);
        
        l8 = new JLabel("Education : B.Sc");
        l8.setForeground(Color.white);
        l8.setFont(new Font("Arial", Font.BOLD, 16));
        l8.setBounds(460, 280, 300, 40);
        add(l8);
        
        l9 = new JLabel("(Computer Science)");
        l9.setForeground(Color.white);
        l9.setFont(new Font("Arial", Font.BOLD, 16));
        l9.setBounds(450, 310, 300, 40);
        add(l9);
        
        
        
        
    }
    
    public static void main(String args[])
    {
        new ContactUs().setVisible(true);
    }
}

