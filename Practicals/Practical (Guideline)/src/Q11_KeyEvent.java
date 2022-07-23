/*
 * 11. Using AWT, write a program which responds to KEY_TYPED event and updates the
 * status window with message (“Typed character is: X”). Use adapter class for other
 * two events.
 * 
 * Program by Om Gupta (214047)
 */

import java.awt.*;
import java.awt.event.*;

public class Q11_KeyEvent extends Frame {
    String msg = "";

    public static void main(String[] args) {
        Q11_KeyEvent frame = new Q11_KeyEvent();
        frame.setSize(485, 300);
        frame.setVisible(true);
    }

    public Q11_KeyEvent(){
        addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent ke) {
                msg = "Typed character is: "+ke.getKeyChar();
                repaint();
            }
        });
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(msg, 150, 150);
    }
}
