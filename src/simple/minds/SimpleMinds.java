package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleMinds extends JFrame implements ActionListener{
    
    
    JButton b1,b2;
    JTextField t1;
    SimpleMinds()
    {
        // to make a frame 
        setBounds(450, 150, 1000, 400);// dleft, // dup //framelength //frameheight//// wrt screen
        getContentPane().setBackground(Color.white);// set background color of frame white
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 500, 400);  //wrt frame
        add(l1);
        
        JLabel l2 = new JLabel("Simple Minds");
        l2.setFont(new Font("Mongolian Baiti", Font.BOLD, 30 ));
        l2.setForeground(new Color(30,144,254) );
        l2.setBounds(650, 10, 250, 35);
        add(l2);
       
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 15 ));
        l3.setForeground(new Color(30,144,254) );
        l3.setBounds(680, 90, 250, 20);
        add(l3);
        
         t1 = new JTextField();
         t1.setBounds(630, 120, 250, 25);
         t1.setFont(new Font("Mongolian Baiti", Font.BOLD, 20 ));
         add(t1);
        
         b1 = new JButton("Rules");
         b1.setBounds(630, 190, 110, 25);
         b1.setBackground(new Color(30,144,254));
         b1.setForeground(Color.white);
         b1.addActionListener(this);
         add(b1);
        
          b2 = new JButton("Exit");
          b2.setBounds(770, 190, 110, 25);
          b2.setBackground(new Color(30,144,254));
          b2.setForeground(Color.white);
          b2.addActionListener(this);
          add(b2);
       
        setVisible(true);
    }
     
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1){
           String name = t1.getText();// return string
           this.setVisible(false);
            new Rules(name);
            
        }
        else{
            System.exit(0);
        }
        
    }
    
    public static void main(String[] args) {
        new SimpleMinds();
        
    }
    
}
