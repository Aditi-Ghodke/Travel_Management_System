package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    
    JButton create,back;
    JTextField tfusername, tfname, tfpassword, tfanswer;
    Choice security;
    
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
//        //panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        
        //textfield
        JLabel username = new JLabel("Username");
        username.setFont(new Font("Thoma",Font.BOLD,14));
        username.setBounds(50, 20, 125, 25);
        p1.add(username);
        
        //JTextField
        tfusername = new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        //NAME
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Thoma",Font.BOLD,14));
        name.setBounds(50, 60, 125, 25);
        p1.add(name);
        
        //JTextField NAME
        tfname = new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        //PASSWORD
        JLabel password = new JLabel("Password");
        password.setFont(new Font("Thoma",Font.BOLD,14));
        password.setBounds(50, 100, 125, 25);
        p1.add(password);
        
        //JTextField password
        tfpassword = new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        //SECURITY QUESTION LABEL
        JLabel lsecurity = new JLabel("Security Question");
        lsecurity.setFont(new Font("Thoma",Font.BOLD,14));
        lsecurity.setBounds(50, 140, 125, 25);
        p1.add(lsecurity);
        
        security = new Choice();
        security.add("Fav superhero");
        security.add("Your lucky number");
        security.add("Fav book");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        //ANSWER
        JLabel answer = new JLabel("Answer");
        answer.setFont(new Font("Thoma",Font.BOLD,14));
        answer.setBounds(50, 180, 125, 25);
        p1.add(answer);
        
        //JTextField answer
        tfanswer = new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        //CREATE BUTTON
        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this); // this function will internally call  actionPerformed listener 
        p1.add(create);
        
        //BACK BUTTON
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(250,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        //IMAGE
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //
        image.setBounds(580,50,250,250);
        add(image);
        
        setVisible(true); //supposed to be the last statement
    }
    
        //to trigger event on button click 
    //ActionEvent gives the source of the event
    @Override
    public void  actionPerformed(ActionEvent ae) {
        if(ae. getSource() == create) {
            String username = tfusername.getText(); //getText() returns a string
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            
            
           //to insert the entire data in the db
            String query = "insert into account values('"+username+"','"+name+"','"+password+"', '"+question+"', '"+answer+"')";
            try{
                Conn c = new Conn(); //for data insertion we need to nake the connection by creating an object
                c.s.executeUpdate(query);
                
               //if your data is inserted successfully then  asmall pop up box is to be shown using JOptionPane which has a static method
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                
                setVisible(false);
                new Login();
            } catch(Exception e) {
                e.printStackTrace();
        }
        }
         else if(ae.getSource() == back) {
            setVisible(false);
            new Login();
    }  
} 
    public static void main(String[] args){
         Signup s = new Signup();
    }
    
}