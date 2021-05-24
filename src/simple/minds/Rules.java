
package simple.minds;

import  javax.swing.*;
import  java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    
    JButton b1,b2;
    String username;
    

    Rules(String username) {
        
        this.username = username;
        setBounds(550, 150, 800, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);// setbounds works only when setlayout is equal to null.
        
        JLabel l1 = new JLabel("Welcome " + username + " to Simple Minds");
         l1.setForeground(new Color(30,144,254) );
        l1.setFont(new Font("Mongolian Baiti", Font.BOLD, 30 ));
        l1 .setBounds(70, 15, 800, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(20, 20, 700, 400);
         l2.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
         b1 = new JButton("Back");
        b1.setBounds(200, 400, 110, 25);
         b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
         b2 = new JButton("Start");
        b2.setBounds(490, 400, 110, 25);
         b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== b1)
        {
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource()== b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
            
        }
       
    }
    
    public static void main(String[] args){
        new Rules("");
       
        
    }
}
