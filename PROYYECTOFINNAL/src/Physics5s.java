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
public class Physics5s extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics5s(){
setLayout(null);
    setTitle("PROBLEM #5");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #5 SOLVED");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #5"
            + "\n\n A baseball is hit so that it goes straight up after beingtouched by the bat."
            + "\n An amateur observes that the ball takes 3 sec. in reaching its maximum height."
            + "\n\n Find your initial velocity"
            + "\n\n ANSWER:"
            + "\n\n Vo = 0m/s       g = 9,8m/s²     t = 3s"
            + "\n\n Vf(equal to 0) = Vo - g t"
            + "\n\n g * t = Vo"
            + "\n\n Vo = 9,8 * 3"
            + "\n\n Vo = 29,4 m/s");
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
         Physics6 Phy6 = new Physics6();
        Phy6.setBounds(0, 0, 600, 360);
        Phy6.setVisible(true);
        Phy6.setResizable(false);
        Phy6.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
        
    }
    
    public static void main(String[]args){
    Physics5s win = new Physics5s();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }