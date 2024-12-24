
package university_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener {
    public Home(){
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("images/Home_Bg.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1920, 1250,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar menu_bar= new JMenuBar();
        JMenu student = new JMenu("Student");
        JMenuItem student1 =new JMenuItem("Add Student");
        JMenuItem student2 = new JMenuItem("Student Details");
        
        menu_bar.setBackground(Color.black);
        student.setFont(new Font("Arial",Font.BOLD,17));
        student.setForeground(Color.white);
        student1.setFont(new Font("Arial",Font.BOLD,13));
        student2.setFont(new Font("Arial",Font.BOLD,13));
        
        
        student.add(student1);
        student.add(student2);
        menu_bar.add(student);
        setJMenuBar(menu_bar);
        
        JMenu teacher = new JMenu("Teacher");
        JMenuItem teacher1 =new JMenuItem("Add Teacher");
        JMenuItem teacher2 = new JMenuItem("Teacher Details");
        teacher1.setFont(new Font("Arial",Font.BOLD,13));
        teacher2.setFont(new Font("Arial",Font.BOLD,13));
        
        teacher.setFont(new Font("Arial",Font.BOLD,17));
        teacher.setForeground(Color.white);
        
        
        teacher.add(teacher1);
        teacher.add(teacher2);
        menu_bar.add(teacher);
        setJMenuBar(menu_bar);
        
        JMenu courses = new JMenu("Courses");
        JMenu be =new JMenu("B.E");
        JMenuItem cs = new JMenuItem("Computer Science");
        JMenuItem ee = new JMenuItem("Electrical Engineering");
        JMenuItem ce = new JMenuItem("Civil Engineering");
        JMenuItem me = new JMenuItem("Mechanical Engineering");
        
        courses.setFont(new Font("Arial",Font.BOLD,13));
        be.setFont(new Font("Arial",Font.BOLD,13));
        cs.setFont(new Font("Arial",Font.BOLD,13));
        ce.setFont(new Font("Arial",Font.BOLD,13));
        ee.setFont(new Font("Arial",Font.BOLD,13));
        me.setFont(new Font("Arial",Font.BOLD,13));
        
        
        menu_bar.add(courses);
        courses.add(be);
        be.add(cs);
        be.add(ee);
        be.add(ce);
        be.add(me);
        
        JMenu bsc = new JMenu("Bsc");
        JMenuItem cs2 = new JMenuItem("Computer Science");
        JMenuItem physics = new JMenuItem("Physics");
        JMenuItem Chemistry = new JMenuItem("Chemistry");
        JMenuItem zoology = new JMenuItem("Zoology");
        JMenuItem maths = new JMenuItem("Mathematic");
        JMenuItem botany = new JMenuItem("Botany");
        
        bsc.setFont(new Font("Arial",Font.BOLD,13));
        cs2.setFont(new Font("Arial",Font.BOLD,13));
        physics.setFont(new Font("Arial",Font.BOLD,13));
        Chemistry.setFont(new Font("Arial",Font.BOLD,13));
        zoology.setFont(new Font("Arial",Font.BOLD,13));
        maths.setFont(new Font("Arial",Font.BOLD,13));
        botany.setFont(new Font("Arial",Font.BOLD,13));
       
       
        courses.add(bsc);
        bsc.add(cs2);
        bsc.add(physics);
        bsc.add(Chemistry);
        bsc.add(zoology);
        bsc.add(maths);
        bsc.add(botany);
        
        
        JMenu mca = new JMenu("MCA");
        mca.setFont(new Font("Arial",Font.BOLD,13));
        courses.add(mca);
                
        JMenu mba = new JMenu("MBA");
        mba.setFont(new Font("Arial",Font.BOLD,13));
        courses.add(mba);
               
        JMenu msc = new JMenu("Msc          ");
        
        courses.add(msc);
        JMenuItem msc1 = new JMenuItem("Physics");
        JMenuItem msc2 = new JMenuItem("Chemistry");
        JMenuItem msc3 = new JMenuItem("Biology");
        JMenuItem msc4 = new JMenuItem("Mathematics");
        JMenuItem msc5 = new JMenuItem("Environmental Sciences");
        JMenuItem msc6 = new JMenuItem("Biotechnology");
        JMenuItem msc7 = new JMenuItem("Microbiology");
        JMenuItem msc8 = new JMenuItem("Statistics");
        JMenuItem msc9 = new JMenuItem("Life Sciences");
        JMenuItem msc10 = new JMenuItem("Food Sciences");
        
        msc.setFont(new Font("Arial",Font.BOLD,13));
        msc1.setFont(new Font("Arial",Font.BOLD,13));
        msc2.setFont(new Font("Arial",Font.BOLD,13));
        msc3.setFont(new Font("Arial",Font.BOLD,13));
        msc4.setFont(new Font("Arial",Font.BOLD,13));
        msc5.setFont(new Font("Arial",Font.BOLD,13));
        msc6.setFont(new Font("Arial",Font.BOLD,13));
        msc7.setFont(new Font("Arial",Font.BOLD,13));
        msc8.setFont(new Font("Arial",Font.BOLD,13));
        msc9.setFont(new Font("Arial",Font.BOLD,13));
        msc10.setFont(new Font("Arial",Font.BOLD,13));
        
        courses.add(msc);
        msc.add(msc1);
        msc.add(msc2);
        msc.add(msc3);
        msc.add(msc4);
        msc.add(msc5);
        msc.add(msc6);
        msc.add(msc7);
        msc.add(msc8);
        msc.add(msc9);
        msc.add(msc10);
       
        JMenu bca = new JMenu("BCA");
        bca.setFont(new Font("Arial",Font.BOLD,13));
        courses.add(bca);
        
        JMenu bba = new JMenu("BBA");
        bba.setFont(new Font("Arial",Font.BOLD,13));
        courses.add(bba);
                     
        courses.setFont(new Font("Arial",Font.BOLD,17));
        courses.setForeground(Color.white);
        
        JMenu fees = new JMenu("Fees");
        JMenuItem vf = new JMenuItem("View Fees");
        vf.setFont(new Font("Arial",Font.BOLD,13));
        menu_bar.add(fees);
        fees.add(vf);
        fees.setFont(new Font("Arial",Font.BOLD,17));
        fees.setForeground(Color.white);
        
        JMenu about =new JMenu("About");
        JMenuItem about1 = new JMenuItem("About Us");
        about1.setFont(new Font("Arial",Font.BOLD,13));
        menu_bar.add(about);
        about.add(about1);
        about.setFont(new Font("Arial",Font.BOLD,17));
        about.setForeground(Color.white);
        
        JMenu contact =new JMenu("Contact");
        JMenuItem contact1 = new JMenuItem("Contact Us");
        contact1.setFont(new Font("Arial",Font.BOLD,13));
        menu_bar.add(contact);
        contact.add(contact1);
        contact.setFont(new Font("Arial",Font.BOLD,17));
        contact.setForeground(Color.white);
        
                    
        
        student1.addActionListener(this);
        student2.addActionListener(this);
        teacher1.addActionListener(this);
        teacher2.addActionListener(this);
        about1.addActionListener(this);
        contact1.addActionListener(this);
        vf.addActionListener(this);
        
        
                 
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Add Student")){
            new AddStudentDetails().setVisible(true);   
            
        }else if(msg.equals("Student Details")){
            new ViewStudentDetails().setVisible(true);
            
        }else if(msg.equals("Add Teacher")){
            new AddTeacherDetails().setVisible(true);
            
        }else if(msg.equals("Contact Us")){
            new ContactUs().setVisible(true);
        }else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
                    
        }else if(msg.equals("View Fees")){
            new fees().setVisible(true);
        }else if(msg.equals("Teacher Details")){
            new ViewTeacherDetails().setVisible(true);
        
                       
    }
    }
     public static void main(String args[]){
        Home h=new Home();
        h.setVisible(true);
        
    }
    
}


    

