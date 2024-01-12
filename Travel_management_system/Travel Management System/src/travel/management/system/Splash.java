package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread thread;
    
    Splash(){
//        setSize(1200,600);
//        setLocation(200, 100);
        
        
        ImageIcon  i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);// cannot add image in frame directily we need jlabel for that
        add(image);// will add image on the frame
        
        
        setVisible(true);// by default visibility is true
        
        thread = new Thread(this);// create an object of thread if we are implementing the runnable interface
        thread.start();// will call the run method
    }
    
    public void run(){
       try{
           Thread.sleep(7000);//7 sec hold time as 1 sec = 1000 ms 
//           new Login();
            setVisible(false); // close the frame after 7 sec
       } catch(Exception e){}
    }
    
    
    public static void main(String[] args){
        Splash frame = new Splash();
        int x=1;// below code is to increase the size of the frame 
        for(int i =1; i<=500; x+=7, i+=6){ 
            frame.setLocation(750-(x+i)/2, 400-(i/2));
            frame.setSize(x + i,i);
            try{
                Thread.sleep(10);// 10 ms hold time
            }catch (Exception e){}
        }
    }
            
}
