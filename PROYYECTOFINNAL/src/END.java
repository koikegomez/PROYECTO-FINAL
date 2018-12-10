
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
public class END extends JFrame implements ActionListener{
    
      JLabel lb1,lb2;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1;
    
public END(){
setLayout(null);
    setTitle("END");
    setIconImage(new ImageIcon(getClass().getResource("images/Matraz.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("END");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("░░░░░░░░░░░░▄▄ \n" +
"░░░░░░░░░░░█░░█ \n" +
"░░░░░░░░░░░█░░█ \n" +
"░░░░░░░░░░█░░░█ \n" +
"░░░░░░░░░█░░░░█ \n" +
"███████▄▄█░░░░░██████▄ \n" +
"▓▓▓▓▓▓█░░░░░░░░░░░░░░█ \n" +
"▓▓▓▓▓▓█░░░░░░░░░░░░░░█ \n" +
"▓▓▓▓▓▓█░░░░░░░░░░░░░░█ \n" +
"▓▓▓▓▓▓█░░░░░░░░░░░░░░█ \n" +
"▓▓▓▓▓▓█░░░░░░░░░░░░░░█ \n" +
"▓▓▓▓▓▓█████░░░░░░░░░█ \n" +
"██████▀░░░░▀▀██████▀\n" +
"\n\n\n\n In the next version add a click counter and manage to put the images.");
    txarea1.setFont(new Font("Arial",0,12));
    sc1 = new JScrollPane(txarea1);
    sc1.setBounds(10,40, 575, 200);
    add(sc1);
    
    bnt1 = new JButton("CLOSE APP");
    bnt1.setBounds(220, 290, 150, 30);
    bnt1.addActionListener(this);
    bnt1.setEnabled(true);
    add(bnt1);
    
    lb2 = new JLabel("YOU GOT ");
    
    
}

 @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bnt1){
            JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING");
        System.exit(0);
        
        
        
        
        }
        
        
        
    }
    
    public static void main(String[]args){
    END win = new END();
    win.setBounds(0, 0, 600, 360);
    win.setVisible(true);
    win.setResizable(false);
    win.setLocationRelativeTo(null);
    
    
    }
    
    }
