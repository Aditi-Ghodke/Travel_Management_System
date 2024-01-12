package travel.management.system;

import javax.swing.*;
import java.awt.event.*;
public class Paytm extends JFrame implements ActionListener {
    
    Paytm() {
        setBounds(500,200,800,600);
        
       JEditorPane pane = new  JEditorPane();
       pane.setEditable(false);
       try {
           //setpage to load the desired page in the editor pane
           pane.setPage("https://paytm.com/rent-payment/rental-form");
       }catch(Exception e) {
           pane.setContentType("text/html");
           pane.setText("<html>Could not load, error 404</html>");
       }
        
       JScrollPane sp = new JScrollPane(pane); // to add scrollbar on the frame pass the 'pane' ref var to this obj
       getContentPane().add(sp);
       
       
       JButton back = new JButton("Back");
       back.setBounds(620,20,80,40);
       back.addActionListener(this);
       pane.add(back);
               
       setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment();
    }
    
    public static void main(String[] args) {
        new Paytm();
    }
}
