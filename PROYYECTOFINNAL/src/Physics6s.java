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
public class Physics6s extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics6s(){
setLayout(null);
    setTitle("PROBLEM #6");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #6 SOLVED");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea("PROBLEM #6"); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #6"
            + "\n\n An aerostatic balloon travels vertically upwards at a constant velocity of 5m/sec."
            + "\n When it is 21 m above the ground a package is released from the."
            + "\n\n How long does the package remain in the air?"
            + "\n\n ANSWER:"
            + "\n\n Vo = -5m/s      h = 21m     g = 9,8m/s²"
            + "\n\n h = Vo * t + 1/2 * g * t²"
            + "\n\n 21 = -5 t 1/2 * 9,8 * t²"
            + "\n\n 21 = -5 t + 4,9 t²"
            + "\n\n Shorting the equation."
            + "\n\n a = 4,9     b= -4       c = -21"
            + "\n\n t = -b ± √ b² - 4ac / 2 * a"
            + "\n\n t = - (-5) ± √ (-5)² - 4 * 4,9 * (-21) / 2 * 4,9"
            + "\n\n t = 5 ± √ 25 + 411,6 / 9,8"
            + "\n\n t = 5 ± √ 436,6 / 9,8"
            + "\n\n t = 5 ± 20,89 / 9,8 "
            + "\n\n t = 25,89 / 9,9"
            + "\n\n t = 2,64m/s");
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
         Physics7 Phy7 = new Physics7();
        Phy7.setBounds(0, 0, 600, 360);
        Phy7.setVisible(true);
        Phy7.setResizable(false);
        Phy7.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
        
    }
    
    public static void main(String[]args){
    Physics6s win = new Physics6s();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }