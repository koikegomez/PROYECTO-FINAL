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
public class Physics8s extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics8s(){
setLayout(null);
    setTitle("PROBLEM #8");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #8 SOLVED");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #8"
            + "\n\n A ball is thrown vertically up from the ground with an initial velocity of 15 m / sec."
            + "\n\n How long does it take until the ball reaches its maximum altitude?"
            + "\n\n ANSWER:"
            + "\n\n Vo = 15m/s      g = 9.8m/s²"
            + "\n\n Vf(equal to 0) = Vo - g t"
            + "\n\n g * t = Vo"
            + "\n\n t = Vo / g"
            + "\n\n t = 15 / 9.8"
            + "\n\n t = 1.53s");
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
         Physics9 Phy9 = new Physics9();
        Phy9.setBounds(0, 0, 600, 360);
        Phy9.setVisible(true);
        Phy9.setResizable(false);
        Phy9.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
        
    }
    
    public static void main(String[]args){
    Physics8s win = new Physics8s();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }