
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class Physics3s extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics3s(){
setLayout(null);
    setTitle("PROBLEM #3");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #3 SOLVED");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #3"
            + "\n\n In Mostar, Bosnia, the ultimate test of a young man's courage was to jump off"
            + "\n a 400-year-old bridgeof antiquity (now destroyed) towards the river Neretva, 23 m below the bridge."
            + "\n\n How long was the jump?"
            + "\n\n ANSWER: "
            + "\n\n h = 23m     Vo = 0      a = 9,8m/seg²"
            + "\n\n  h = Vo * t + 1/2 *g *t²"
            + "\n\n 23 = 1/2 * 9,8 * t²"
            + "\n\n 23 = 4,8 *t²"
            + "\n\n t² = 23*4,8"
            + "t = √4,639"
            + "t = 2,16sec");
    txarea1.setFont(new Font("Arial",0,12));
    sc1 = new JScrollPane(txarea1);
    sc1.setBounds(10,40, 575, 200);
    add(sc1);
    
    btn2 = new JButton("NEXT");
    btn2.setBounds(220, 290, 150, 30);
    btn2.addActionListener(this);
    btn2.setEnabled(true);
    add(btn2);
   
}

 @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn2){
         Physics4 Phy4 = new Physics4();
        Phy4.setBounds(0, 0, 600, 360);
        Phy4.setVisible(true);
        Phy4.setResizable(false);
        Phy4.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
        
    }
    
    public static void main(String[]args){
    Physics3s win = new Physics3s();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }
