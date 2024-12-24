
package university_management_system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loginpage extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p;
    JButton b1,b2;
    
    Loginpage(){
        
        super("Login");
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(550,150,400,410);
        
        l1 = new JLabel("Username");
        l1.setFont(new Font("Arial",Font.PLAIN,12));
        l1.setForeground(Color.gray);
        l1.setBounds(50,60,115,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setFont(new Font("Arial",Font.PLAIN,12));
        l2.setForeground(Color.gray);
        l2.setBounds(50,125,100,30);
        add(l2);
        
        l3 = new JLabel("LOGIN");
        l3.setFont(new Font("Arial",Font.BOLD,25));
        l3.setForeground(Color.decode("#b0003a"));
        l3.setBounds(165,20,100,30);
        add(l3);
        
 
        t1=new JTextField();
        t1.setBackground(Color.decode("#e8eaf6"));
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t1.setBounds(50,85,300,40);
        add(t1);

        p=new JPasswordField();
        p.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p.setBackground(Color.decode("#e8eaf6"));
        p.setBounds(50,150,300,40);
        add(p);
        
        b1 = new JButton("LOGIN");
        b1.setBounds(50,210,300,40);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setBackground(Color.decode("#b0003a"));
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("CANCEL");
        b2.setBounds(50,260,300,40);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setBackground(Color.decode("#b0003a"));
        b2.setForeground(Color.WHITE);
        add(b2);
        
        JLabel hyperlink = new JLabel("Forgot Password?");
        hyperlink.setHorizontalAlignment(JLabel.CENTER);
        hyperlink.setBounds(50,310,300,30);
        hyperlink.setForeground(Color.decode("#ec407a"));
        add(hyperlink);
        hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
       b1.addActionListener(this);
       b2.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String userValue = t1.getText();  
            String passValue = p.getText();
            
            if(userValue.equals("admin")&&passValue.equals("pass")){
                //Home home0 = new Home();
                new Home().setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Please enter valid user and pass");
                //System.out.println("Please enter valid user and pass");
            }
        }
        if(ae.getSource() == b2){
            this.setVisible(false);
        }
            
            
        }
    public static void main(String[] arg){
        new Loginpage().setVisible(true);
        //Loginpage i =new Loginpage();
    }
}
