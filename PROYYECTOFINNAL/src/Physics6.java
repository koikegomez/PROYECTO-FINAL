import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class Physics6 extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics6(){
setLayout(null);
    setTitle("PROBLEM #6");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #6");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea("PROBLEM #6"); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #6"
            + "\n\n An aerostatic balloon travels vertically upwards at a constant velocity of 5m/sec."
            + "\n When it is 21 m above the ground a package is released from the."
            + "\n\n How long does the package remain in the air?");
    txarea1.setFont(new Font("Arial",0,12));
    sc1 = new JScrollPane(txarea1);
    sc1.setBounds(10,40, 575, 200);
    add(sc1);
    
    bnt1 = new JButton("t = 2,64m/seg");
    bnt1.setBounds(10, 290, 150, 30);
    bnt1.addActionListener(this);
    bnt1.setEnabled(true);
    add(bnt1);
    
    btn2 = new JButton("t = 3,0m/sec");
    btn2.setBounds(220, 290, 150, 30);
    btn2.addActionListener(this);
    btn2.setEnabled(true);
    add(btn2);
   
    btn3 = new JButton("t = 2,74m/sec");
    btn3.setBounds(420, 290, 150, 30);
    btn3.addActionListener(this);
    btn3.setEnabled(true);
    add(btn3);
    
    
}

 @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource() == bnt1){
            JOptionPane.showMessageDialog(null, "CORRECT ANSWER");
        Physics7 Phy7 = new Physics7();
        Phy7.setBounds(0, 0, 600, 360);
        Phy7.setVisible(true);
        Phy7.setResizable(false);
        Phy7.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }else if(e.getSource() == btn2){
            JOptionPane.showMessageDialog(null, "WRONG ANSWER");
         Physics6s Phy6s= new Physics6s();
         Phy6s.setBounds(0,0,600,360);
         Phy6s.setResizable(false);
        Phy6s.setVisible(true);
        Phy6s.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        
        }else if(e.getSource() == btn3){
             JOptionPane.showMessageDialog(null, "WRONG ANSWER");
         Physics6s Phy6s= new Physics6s();
          Phy6s.setBounds(0,0,600,360);
         Phy6s.setResizable(false);
        Phy6s.setVisible(true);
        Phy6s.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
    }
    
    public static void main(String[]args){
    Physics6 win = new Physics6();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }