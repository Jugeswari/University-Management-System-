
package university_management_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddTeacherDetails extends JFrame implements ActionListener{
    
    JLabel l1,name,age,dob,gender,phoneno,education,department,email;
    JTextField  namet, aget, dobt, gendert, phonenot,emailt;
    JComboBox c1,c2;
    JButton b1,b2;
    
    public AddTeacherDetails()
    {
     setTitle("Teacher Details");
     setBackground(Color.lightGray);
     setBounds(370,120,800,600);
     setLayout(null);
     
     l1=new JLabel("ADD TEACHER DETAILS");
     l1.setBounds(237,30,800,50);
     l1.setFont(new Font("Arial",Font.BOLD,25));
     l1.setForeground(Color.blue);
     add(l1);
     
     
     name=new JLabel("Name");
     name.setFont(new Font("Arial",Font.BOLD,14));
     name.setBounds(100,120,100,30);
     add(name);
     
     email=new JLabel("Email ID");
     email.setFont(new Font("Arial",Font.BOLD,14));
     email.setBounds(100,180,100,30);
     add(email);
     
     age=new JLabel("Age");
     age.setFont(new Font("Arial",Font.BOLD,14));
     age.setBounds(100,240,100,30);
     add(age);
     
     dob=new JLabel("DOB (yyyy-mm-dd)");
     dob.setFont(new Font("Arial",Font.BOLD,14));
     dob.setBounds(100,300,200,30);
     add(dob);
     
     gender=new JLabel("Gender");
     gender.setFont(new Font("Arial",Font.BOLD,14));
     gender.setBounds(430,120,100,30);
     add(gender);
     
     phoneno=new JLabel("Phone N0");
     phoneno.setFont(new Font("Arial",Font.BOLD,14));
     phoneno.setBounds(430,180,100,30);
     add(phoneno);
     
     education=new JLabel("Education");
     education.setFont(new Font("Arial",Font.BOLD,14));
     education.setBounds(430,240,100,30);
     add(education);
     
     department=new JLabel("Department");
     department.setFont(new Font("Arial",Font.BOLD,14));
     department.setBounds(430,300,100,30);
     add(department);
     
     namet=new JTextField();
     namet.setFont(new Font("Arial",Font.PLAIN,13));
     namet.setBounds(230,120,130,30);
     add(namet);
  
     emailt=new JTextField();
     emailt.setFont(new Font("Arial",Font.PLAIN,13));
     emailt.setBounds(230,180,130,30);
     add(emailt);
     
     aget=new JTextField();
     aget.setFont(new Font("Arial",Font.PLAIN,13));
     aget.setBounds(230,240,130,30);
     add(aget);
     
     dobt=new JTextField();
     dobt.setFont(new Font("Arial",Font.PLAIN,13));
     dobt.setBounds(230,300,130,30);
     add(dobt);
     
     gendert=new JTextField();
     gendert.setFont(new Font("Arial",Font.PLAIN,13));
     gendert.setBounds(530,120,130,30);
     add(gendert);
     
     phonenot=new JTextField();
     phonenot.setFont(new Font("Arial",Font.PLAIN,13));
     phonenot.setBounds(530,180,130,30);
     add(phonenot);
     
     String course[]={"Bsc","BE","BCA","B.Tech","BBA","Msc","MCA","BA","BCom"};
     c1=new JComboBox(course);
     c1.setFont(new Font("Arial",Font.PLAIN,13));
     c1.setBounds(530,240,130,30);
     add(c1);
     
     
     String branch[]= {"Computer Science","Physics","Chemistry","Zoology","Mathematics","Civil","Electrical","Electronics","Information Technology","Mechanical"};
     c2=new JComboBox(branch);
     c2.setFont(new Font("Arial",Font.PLAIN,13));
     c2.setBounds(530,300,130,30);
     add(c2);
     
     b1=new JButton("SUBMIT");
     b1.setBounds(170,400,130,30);
     b1.setBackground(Color.gray);
     b1.setForeground(Color.white);
     b1.setFont(new Font("Arial",Font.BOLD,17));
     b1.setSize(150,40);
     add(b1);
     
     b2=new JButton("CANCEL");
     b2.setBounds(470,400,130,30);
     b2.setBackground(Color.gray);
     b2.setForeground(Color.white);
     b2.setFont(new Font("Arial",Font.BOLD,17));
     b2.setSize(150,40);
     add(b2);
     
     b1.addActionListener(this);
     b2.addActionListener(this);
     
     setVisible(true);
     
     
     
 }
     @Override
    public void actionPerformed(ActionEvent ae){
        String a=namet.getText();
        String b=emailt.getText();
        String c=aget.getText();
        String d=dobt.getText();
        String e=gendert.getText();
        String f=phonenot.getText();
        String g=(String)c1.getSelectedItem();
        String h=(String)c2.getSelectedItem();        
        
        if(ae.getSource()==b1){
            try{
                conn cc =new conn();
                String q= "insert into teacher values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Teacher Details Inserted SuccessfullY");
                setVisible(false);
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
                        
        }
        else if(ae.getSource()== b2){
            setVisible(false);
            new Home().setVisible(true);
              
        }
    }
     
    public static void main(String args[]){
        new AddTeacherDetails().setVisible(true);
    }
}
