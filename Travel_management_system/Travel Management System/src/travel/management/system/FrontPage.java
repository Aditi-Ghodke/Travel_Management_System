package travel.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FrontPage extends JFrame implements ActionListener{
    
    FrontPage() {
        setBounds(0,0,1600,1500);
        setLayout(null);
        
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/frontpage4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600, 800,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1600,800);
        add(image);
        
        
        JLabel text = new JLabel("Travel and Tourism");
        text.setLayout(null);
        text.setBounds(400,100,1000,300);
        text.setFont(new Font("Tahoma", Font.BOLD,70));
        image.add(text);
        
        
        JLabel text1 = new JLabel("Management  System");
        text1.setBounds(370,180,1000,300);
        text1.setFont(new Font("Tahoma", Font.BOLD,70));
        image.add(text1);
        
        JButton login = new JButton("Login");
        login.setBounds(650,500,150,40);
        login.setLayout(null);
        login.setBackground(new Color(188, 143, 143));
        login.setFont(new Font("Tahoma", Font.PLAIN,20));
        login.addActionListener(this);
        image.add(login);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new FrontPage();
    }
}
