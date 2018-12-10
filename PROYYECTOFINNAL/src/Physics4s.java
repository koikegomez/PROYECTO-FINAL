
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
public class Physics4s extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics4s(){
setLayout(null);
    setTitle("PROBLEM #4");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #4 SOLVED");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #4"
            + "\n\n A ball is thrown directly down, with an initial speed of 8 m / sec.,"
            + "\n  From aheight of 30 m. After what time interval does the ball reach the ground?"
            + "\n\n ANSWER:"
            + "\n\n h = 30      Vo = 8m/s       a = 9,8m/sec²"
            + "\n\n h = V0 * t + 1/2 * 9,8 * t²"
            + "\n\n 30 = 8 * t + 1/2 * 9,8 * t²"
            + "\n\n 30 = 8t + 4,9 t²"
            + "\n\n Sort the equation."
            + "\n\n   4,9t² + 8t - 30 = 0"
            + "\n\n   a = 4,9  b = 8  c = -30 "
            + "\n\n t = -b ± √ b² - 4ac / 2 * a"
            + "\n\n t = -8 ± √ 8² - 4* 4,9 * (-30) / 2* 4,9"
            + "\n\n t = -8 ± √ 64 + 588 / 9,8"
            + "\n\n t = -8 ± √ 652 / 9,8"
            + "\n\n t = 1,79sec");
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
         Physics5 Phy5 = new Physics5();
        Phy5.setBounds(0, 0, 600, 360);
        Phy5.setVisible(true);
        Phy5.setResizable(false);
        Phy5.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
        
    }
    
    public static void main(String[]args){
    Physics4s win = new Physics4s();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }

