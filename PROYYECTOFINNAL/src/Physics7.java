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
public class Physics7 extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics7(){
setLayout(null);
    setTitle("PROBLEM #7");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #7");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #7"
            + "\n\n It is possible to shoot an arrow at a speed of up to 100 m / sec. "
            + "riction is neglected,"
            + " \n\n How high would an arrow thrown at this speed go if it shoots straight up?");
    txarea1.setFont(new Font("Arial",0,12));
    sc1 = new JScrollPane(txarea1);
    sc1.setBounds(10,40, 575, 200);
    add(sc1);
    
    bnt1 = new JButton("Y = 464m");
    bnt1.setBounds(10, 290, 150, 30);
    bnt1.addActionListener(this);
    bnt1.setEnabled(true);
    add(bnt1);
    
    btn2 = new JButton("Y = 550m");
    btn2.setBounds(220, 290, 150, 30);
    btn2.addActionListener(this);
    btn2.setEnabled(true);
    add(btn2);
   
    btn3 = new JButton("Y = 510,2m");
    btn3.setBounds(420, 290, 150, 30);
    btn3.addActionListener(this);
    btn3.setEnabled(true);
    add(btn3);
    
    
}

 @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource() == btn3){
            JOptionPane.showMessageDialog(null, "CORRECT ANSWER");
        Physics8 Phy8 = new Physics8();
        Phy8.setBounds(0, 0, 600, 360);
        Phy8.setVisible(true);
        Phy8.setResizable(false);
        Phy8.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }else if(e.getSource() == btn2){
            JOptionPane.showMessageDialog(null, "WRONG ANSWER");
         Physics7s Phy7s= new Physics7s();
         Phy7s.setBounds(0,0,600,360);
         Phy7s.setResizable(false);
        Phy7s.setVisible(true);
        Phy7s.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        
        }else if(e.getSource() == bnt1){
             JOptionPane.showMessageDialog(null, "WRONG ANSWER");
         Physics7s Phy7s= new Physics7s();
          Phy7s.setBounds(0,0,600,360);
         Phy7s.setResizable(false);
        Phy7s.setVisible(true);
        Phy7s.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
    }
    
    public static void main(String[]args){
    Physics7 win = new Physics7();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }