
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
public class Physics1s extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics1s(){
setLayout(null);
    setTitle("PROBLEM #1");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #1 SOLVED");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #1"
            + "\n\n A student throws a keychain vertically upwards to her sister form female club pf students,"
            + "\n who is in a window 4 meters above.The keys are trapped 1.5 sec."
            + "\n afer the extended arm of sister."
            + "\n\n With what initial speed ere the keys realsed?"
            + "\n\n ANSWER:"
            + "\n h = 4m  t = 1,5sec    Vo = ?    a = 9,8m/sec²"
            + "\n\n h = Vo * t + 1/2 *g * t²"
            + "\n\n 4 = Vo * 1,5 - 1/2 * 9,8 * 1,5²"
            + "\n\n 4 = 1,5 Vo - 11,025"
            + "\n\n 15,025 = 1,5Vo"
            + "\n\n Vo = 15,025/1,5"
            + "\n\n Vo 10m/sec");
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
         Physics2 Phy2 = new Physics2();
        Phy2.setBounds(0, 0, 600, 360);
        Phy2.setVisible(true);
        Phy2.setResizable(false);
        Phy2.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
    }
    
    public static void main(String[]args){
    Physics1s win = new Physics1s();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }
