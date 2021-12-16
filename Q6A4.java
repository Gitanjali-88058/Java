import java.awt.*;  
import java.awt.event.*;

public class Q6A4 implements MouseListener{ 
public static void main(String[] args) {  
    new Q6A4();  
}
    Frame f;
    Q6A4(){  
        f=new Frame("Q6A4");
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.addMouseListener(this);
    }  
    public void mouseClicked(MouseEvent e) {  
        f.setSize(300,300);
    }  
    public void mouseEntered(MouseEvent e) {  
        f.setSize(900,900);
    }  
    public void mouseExited(MouseEvent e) {  
        f.dispose();
    }  
    public void mousePressed(MouseEvent e) {  
   
    }  
    public void mouseReleased(MouseEvent e) {  
 
    }  
  
}
