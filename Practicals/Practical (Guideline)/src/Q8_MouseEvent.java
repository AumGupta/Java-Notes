/*
 * Q8. Write a program to create a frame using AWT. Implement mouseClicked( ),
 * mouseEntered( ) and mouseExited( ) events. Frame should become invisible/close when
 * mouse enters it.
 * 
 * Program by Om Gupta (214047)
 */

import java.awt.*;
import java.awt.event.*;

public class Q8_MouseEvent extends Frame {
    String msg = "";
    public static void main(String[] args) {
        Q8_MouseEvent frame = new Q8_MouseEvent();
        
        frame.setSize(485, 300);
        frame.setTitle("Mouse Events Demonstration");
        frame.setVisible(true);
    }

    public Q8_MouseEvent() {
        addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                msg = "MOUSE ENTERED";
                setBackground(Color.CYAN);
                setSize(600,350);
                repaint();
            }
            
            public void mouseClicked(MouseEvent e) {
                msg = "MOUSE CLICKED";
                setBackground(Color.ORANGE);
                setSize(687,400);
                repaint();
            }
            
            public void mouseExited(MouseEvent e) {
                msg = "MOUSE EXITED";
                setBackground(Color.WHITE);
                setSize(485, 300);
                repaint();
                setVisible(false);
                System.exit(0);
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        // Getting Dimensions of Frame
        Dimension d = this.getSize();

        // Center Text
        g.setFont(g.getFont().deriveFont(20f));
        FontMetrics fm = g.getFontMetrics();
        int x = (d.width - fm.stringWidth(msg))/2; 
        int y = (d.height - fm.getHeight())/2 + fm.getAscent(); 
        
        g.drawString(msg, x, y);
    }

}