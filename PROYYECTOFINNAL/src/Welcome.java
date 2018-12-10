// @author Jorge Alberto Gallegos Gomez 

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Welcome extends JFrame implements ActionListener{

    //DECLARACIONES
    JLabel label1,label2,label3;
     JButton btwelcome;
     JTextField txtwelcome;
    
   public Welcome(){
   setLayout(null);
       setTitle("Welcome");
       getContentPane().setBackground(new Color(86,159,209));
       setIconImage(new ImageIcon(getClass().getResource("images/welcomelb.png")).getImage());
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       ImageIcon img1 = new ImageIcon("images/iconwelcome.png");
       label1 = new JLabel(img1);
       label1.setBounds(25, 15,300, Image.SCALE_DEFAULT);
       add(label1);
       
       label2 = new JLabel("WHAT DO YOU KNOW!");
       label2.setBounds(200, 150, 300, 30);
       label2.setFont(new Font("Arial",3,18));
       label2.setForeground(new Color(0,0,0));
       add(label2);
       
    
     btwelcome = new JButton("START!");
       btwelcome.setBounds(250, 200, 90, 30);
       btwelcome.setFont(new Font("Arial",1,15));
      btwelcome.setForeground(new Color (0,0,0));
       btwelcome.addActionListener(this);
      
       add(btwelcome);
       
       
       
   
   
   }
 
    
   
    
    
  
    public static void main(String[] args) {
    Welcome ventana1 = new Welcome();
       
      
    ventana1.setBounds(0,0,600,360);
    ventana1.setVisible(true);
    ventana1.setResizable(false);
    ventana1.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== btwelcome){
             Introduccion aIntro = new Introduccion();
             aIntro.setVisible(true);
             this.setVisible(false);
             aIntro.setResizable(true);
             aIntro.setBounds(0,0,600,360);
             aIntro.setLocationRelativeTo(null);
            
            }
    }
    
}
