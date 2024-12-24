
package university_management_system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ViewStudentDetails extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JTextField t2,t3;
    JTable t1;
    String x[] = {"Roll_No","Name","Age","Dob","Gender","Phoneno","Course","Branch"};
    String y[][] = new String[20][8];
    int i=0,j=0;
    static String rollno;
    ViewStudentDetails(){
        setTitle("ViewStudentDetails");
        setSize(1260,650);
        setLocation(200,120);
        setLayout(null);
        
        l1 = new JLabel("Enter rollno to delete student record");
        l1.setBounds(20,370,400,30);
        l1.setFont(new Font("Arial",Font.BOLD,20));
        add(l1);
        
        l2 = new JLabel("Enter rollno to update student record");
        l2.setBounds(20,430,400,30);
        l2.setFont(new Font("Arial",Font.BOLD,20));
        add(l2);
        
        l3 = new JLabel("Add Student");
        l3.setBounds(20,487,300,30);
        l3.setFont(new Font("Arial",Font.BOLD,20));
        add(l3);
        
        t2 = new JTextField();
        t2.setBounds(400,370,250,30);
        add(t2);
        
        t3 = new JTextField();
        t3.setBounds(400,430,250,30);
        add(t3);
        
        
        
        b1 = new JButton("Delete");
        b1.setBounds(700,370,130,30);
        b1.setFont(new Font("Arial",Font.BOLD,15));
        b1.setForeground(Color.white);
        b1.setBackground(Color.red);
       
        add(b1);
        b2 = new JButton("Update");
        b2.setBounds(700,430,130,30);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.setForeground(Color.white);
        b2.setBackground(Color.blue);
        add(b2);
        
        b3 = new JButton("Add Student");
        b3.setBounds(180,487,130,30);
        b3.setFont(new Font("Arial",Font.BOLD,15));
        b3.setForeground(Color.white);
        b3.setBackground(Color.orange);
        add(b3);
        
        
        
        try{
            conn c1 = new conn();
            String s1 = "select * from student";
            ResultSet rs = c1.s.executeQuery(s1);
                
            while(rs.next()){
                y[i][j++]=rs.getString("Roll_No");
                y[i][j++]=rs.getString("Name");
                y[i][j++]=rs.getString("Age");             
                y[i][j++]=rs.getString("Dob");                
                y[i][j++]=rs.getString("Gender");
                y[i][j++]=rs.getString("Phone_No");
                y[i][j++]=rs.getString("Courses");
                y[i][j++]=rs.getString("Branch");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);    
        }catch(Exception e){
            System.out.println("The error is"+e);
        }
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        conn c1 = new conn();
        //String rollno = t3.getText();
        
        if(ae.getSource() == b1){
            
            try{
                String a = t2.getText();                
                String q = "delete from student where Roll_No = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new ViewStudentDetails().setVisible(true);
                JOptionPane.showMessageDialog(null,"Delete Successfull");          
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
                           
        }else if(ae.getSource() == b3){
            new AddStudentDetails().setVisible(true);
        }else if(ae.getSource() == b2){
            rollno = t3.getText();
            setVisible(false);
            new UpdateStudent().setVisible(true);
            
        }
    }
    
    public static String rollValue(){
        return rollno;
    }
    
            
    public static void main(String args[]){
        new ViewStudentDetails().setVisible(true);
        
    }
    
}
