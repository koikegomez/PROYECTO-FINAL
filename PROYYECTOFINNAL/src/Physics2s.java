
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
public class Physics2s extends JFrame implements ActionListener{
    
      JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2,btn3;
    
public Physics2s(){
setLayout(null);
    setTitle("PROBLEM #2");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("PROBLEM #2 SOLVED");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("          PROBLEM #2"
            + "\n\n It was reported that a woman fell 144 feet from the 17th floor of a building,"
            + "\n landing on ametal fan box, which plunged to a depth of 18 in."
            + "\n He only suffered injuriesminors. Ignore the air resistance and calculate:"
            + "\n\n the speed of the woman just beforecollide with the fan."
            + "\n\n\n ANSWER:"
            + "\n\n y = building height = 144 feet a = 32 feet / sec²"
            + "\n\n Vf² = Vo²(EQUAL TO 0) + 2 a y"
            + "\n\n Vf² = 2 a y"
            + "\n\n Vf = √2 a y"
            + "\n\n Vf = √2*32f/sec² * 144f"
            + "\n\n Vf = √9216f/sec²"
            + "\n\n Vf = 96f/sec");
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
         Physics3 Phy3 = new Physics3();
        Phy3.setBounds(0, 0, 600, 360);
        Phy3.setVisible(true);
        Phy3.setResizable(false);
        Phy3.setLocationRelativeTo(null);
        this.setVisible(false);
        
        
        }
        
        
        
        
    }
    
    public static void main(String[]args){
    Physics2s win = new Physics2s();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }
