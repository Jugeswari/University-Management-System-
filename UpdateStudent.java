
package university_management_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener {
    JLabel l1,roll,name,age,dob,gender,phoneno,course,branch;
    JTextField rollt, namet, aget, dobt, gendert, phonenot;
    JComboBox c1,c2;
    JButton b1,b2;
    String getRollValue;
    
    public UpdateStudent()
    {
       
     setTitle("Students Details");
     setBackground(Color.lightGray);
     setBounds(370,120,800,600);
     setLayout(null);
     
     l1=new JLabel("UPDATE STUDENT DETAILS");
     l1.setBounds(237,30,800,50);
     l1.setFont(new Font("Arial",Font.BOLD,25));
     l1.setForeground(Color.red);
     add(l1);
     
     roll=new JLabel("Roll No");
     roll.setFont(new Font("Arial",Font.BOLD,14));
     roll.setBounds(100,120,100,30);
     add(roll);
     
     name=new JLabel("Name");
     name.setFont(new Font("Arial",Font.BOLD,14));
     name.setBounds(100,180,100,30);
     add(name);
     
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
     
     course=new JLabel("Course");
     course.setFont(new Font("Arial",Font.BOLD,14));
     course.setBounds(430,240,100,30);
     add(course);
     
     branch=new JLabel("Branch");
     branch.setFont(new Font("Arial",Font.BOLD,14));
     branch.setBounds(430,300,100,30);
     add(branch);
     
    getRollValue = ViewStudentDetails.rollValue();    
     rollt=new JTextField(getRollValue);
     rollt.setFont(new Font("Arial",Font.PLAIN,13));
     rollt.setBounds(230,120,130,30);
     add(rollt);
     
     namet=new JTextField();
     namet.setFont(new Font("Arial",Font.PLAIN,13));
     namet.setBounds(230,180,130,30);
     add(namet);
     
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
     
     String branch[]= {"Computer Science","Physics","Chemistry","Zoology","Mathematics","Civil","Electrical","Electronics","Information Technology","Mechanical"};
     c1=new JComboBox(branch);
     c1.setFont(new Font("Arial",Font.PLAIN,13));
     c1.setBounds(530,300,130,30);
     add(c1);
     
     String course[]={"Bsc","BE","BCA","B.Tech","BBA","Msc","MCA","BA","BCom"};
     c2=new JComboBox(course);
     c2.setFont(new Font("Arial",Font.PLAIN,13));    
     c2.setBounds(530,240,130,30);
     add(c2);
     
     b1=new JButton("UPDATE");
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
     
     setValue();
     
     
     setVisible(true);
     setSize(800,600);
    }
      
    @Override
    public void actionPerformed(ActionEvent ae){
        String a=rollt.getText();
        String b=namet.getText();
        String c=aget.getText();
        String d=dobt.getText();
        String e=gendert.getText();
        String f=phonenot.getText();
        String g=(String)c1.getSelectedItem();
        String h=(String)c2.getSelectedItem();
        
        if(ae.getSource()==b1){
            try{
                conn cc =new conn();
                String q= "update student set Name = '"+namet.getText()+"', Age = '"+aget.getText()+"', DOB = '"+dobt.getText()+"', Gender = '"+gendert.getText()+"', Phone_No = '"+phonenot.getText()+"', Courses = '"+(String)c1.getSelectedItem()+"', Branch = '"+(String)c2.getSelectedItem()+"' where Roll_No = '"+rollt.getText()+"'";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Student Details Update SuccessfullY");
                setVisible(false);
                new ViewStudentDetails().setVisible(true);
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
                        
        }
        if(ae.getSource()== b2){
            setVisible(false);
            new Home().setVisible(true);
              
        }
    }
    
    public void  setValue(){
        try{
            conn con = new conn();
            String str = "select * from student where Roll_No = '"+getRollValue+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                rollt.setText(rs.getString(1));
                namet.setText(rs.getString(2));
                aget.setText(rs.getString(3));
                dobt.setText(rs.getString(4));
                gendert.setText(rs.getString(5));
                phonenot.setText(rs.getString(6));
                c1.setSelectedItem(rs.getString(7));
                c2.setSelectedItem(rs.getString(8));                    
            }
        }catch(Exception ex){}
    }
     
    
  public static void main(String[] args) {
        new UpdateStudent().setVisible(true);        
    }
}
    


