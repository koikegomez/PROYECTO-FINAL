
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Main extends JFrame implements ActionListener{
    JLabel lb_mat,lb_ing,lb_cin,lb_imgMath;
   
    JButton btn_start;
    JRadioButton rBut1,rBut2,rBut3;
    ButtonGroup rSele;
    
    
    
    
    
    public Main(){
        setLayout(null);
        setTitle("START");
        setIconImage(new ImageIcon(getClass().getResource("images/welcomelb.png")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        rSele = new ButtonGroup();
        
    lb_mat = new JLabel("MATH");
    lb_mat.setBounds(50,150,70,40);
    lb_mat.setFont(new Font("Arial",1,20));
    add(lb_mat);
    
    lb_ing = new JLabel("ENGLISH");
    lb_ing.setBounds(250,150,150,40);
    lb_ing.setFont(new Font("Arial",1,20));
    add(lb_ing);
    
    lb_cin = new JLabel("SIENCE");
    lb_cin.setBounds(450,150,150,40);
    lb_cin.setFont(new Font("Arial",1,20));
    add(lb_cin);
    
    rBut1 = new JRadioButton("START");
    rBut1.setBounds(50,210,100,30);
    add(rBut1);
    rSele.add(rBut1);
    
    rBut2= new JRadioButton("START");
    rBut2.setBounds(250,210,100,30);
    add(rBut2);
    rSele.add(rBut2);
    
    rBut3 = new JRadioButton("START");
    rBut3.setBounds(450,210,100,30);
    add(rBut3);
    rSele.add(rBut3);
    
     lb_imgMath = new JLabel();
     lb_imgMath.setIcon(new ImageIcon("images/calculadora.png"));
      lb_imgMath.setBounds(10,10,100,100);
       add(lb_imgMath);
    
    btn_start = new JButton("OK");
    btn_start.setBounds(250, 270, 100, 50);
    btn_start.addActionListener(this);
    add(btn_start);
    
    
    
        
      

}

   
    
    
    
    
public static void main(String[]args){
    Main win2 = new Main();
    win2.setBounds(0, 0, 600, 360);
    win2.setVisible(true);
    win2.setResizable(false);
    win2.setLocationRelativeTo(null);



}
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(btn_start == e.getSource()){
        validarR();
        
        
        
      }
      
    }

    private void validarR() {
        if(rBut1.isSelected()){
        Math1 Ma1 = new Math1();
    Ma1.setBounds(0, 0, 600, 360);
    Ma1.setVisible(true);
    Ma1.setResizable(false);
    Ma1.setLocationRelativeTo(null);
    this.setVisible(false);
        
        }
        if(rBut2.isSelected()){
        IN1 IN1 = new IN1();
    IN1.setBounds(0, 0, 600, 360);
    IN1.setVisible(true);
    IN1.setResizable(false);
    IN1.setLocationRelativeTo(null);
    this.setVisible(false);
        
        
        }
        if(rBut3.isSelected()){
        Physics1 Phy1 = new Physics1();
    Phy1.setBounds(0, 0, 600, 360);
    Phy1.setVisible(true);
    Phy1.setResizable(false);
    Phy1.setLocationRelativeTo(null);
    this.setVisible(false);
        
        }
    }

   
    
}
