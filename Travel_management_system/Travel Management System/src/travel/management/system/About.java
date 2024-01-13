package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    
    About() {
        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
        
        String s = "About Project                \n" +
                "\n" +
                "The Objective of Travel and Tourism Management System is to develop a system that automats the processes and activities of a travel and the purpose is to design a system using which one can perform all the operations related to travelling\n" +
                "\n" +
                "The application will help in accessing the information related to travel to a particular destination with great ease. The users can track the information related to the tours with easse through the application.\n"+
                "\n" +
                "Advantages of project:\n" +
                "\n"+
                "-Gives accurate information\n" +
                "-Simplifies the manual work\n"+
                "-It minimizes the document related work\n"+
                "-Provides up to date information\n"+
                "-Friendly environment by providing the warning messages\n"+
                "-Travelers details  can also be provided\n"+
                "-Booking Confirmation Notification";
        
        TextArea area = new TextArea(s, 10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args ){
        new About();
    }
}
