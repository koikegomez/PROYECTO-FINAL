import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Introduccion extends JFrame implements ActionListener {
 //DECLARACIONES
    JLabel lb1,lb2,lb3;
    JTextArea txarea1;
    JCheckBox ckbox1;
    JScrollPane sc1;
    JButton bnt1,btn2;
public Introduccion(){
setLayout(null);
    setTitle("Introduction");
    setIconImage(new ImageIcon(getClass().getResource("images/welcomelb.png")).getImage());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lb1 = new JLabel("WHAT IS THIS GAME?");
    lb1.setBounds(215, 5, 300, 30);
    lb1.setFont(new Font("Arial",1,20));
    lb1.setForeground(new Color(0,0,0));
    add(lb1);
    
    txarea1 = new JTextArea(); 
    txarea1.setEditable(false);
    txarea1.setText("\n\n          Whats is this."
            +       "\n\nThis game determines your knowledge about several areas, "
            + "\nto determine which areas of study you need to improve");
    txarea1.setFont(new Font("Arial",0,12));
    sc1 = new JScrollPane(txarea1);
    sc1.setBounds(10,40, 575, 200);
    add(sc1);
    
    bnt1 = new JButton("YES I WANT TO PLAY!");
    bnt1.setBounds(10, 290, 200, 30);
    bnt1.addActionListener(this);
    bnt1.setEnabled(true);
    add(bnt1);
    
    btn2 = new JButton("MEH, I DONT WANNA...");
    btn2.setBounds(220, 290, 200, 30);
    btn2.addActionListener(this);
    btn2.setEnabled(true);
    add(btn2);
            
    
    
    
    
   
    


}
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bnt1){
       Main Main1 = new Main();
       Main1.setVisible(true);
       this.setVisible(false);
       Main1.setBounds(0,0,600,360);
      Main1.setLocationRelativeTo(null);
       
       
        }else if(e.getSource() == btn2){
        
        System.exit(0);
        
        }
        
        
       
    }
    public static void main(String [] args){
    Introduccion win1 = new Introduccion();
    win1.setBounds(0,0,600,360);
    win1.setVisible(true);
    win1.setLocationRelativeTo(null);
    win1.setResizable(false);
    
    
    
    }
}
