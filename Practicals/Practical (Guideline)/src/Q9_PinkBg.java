/*
 * Q9.Using AWT, write a program to display a string in frame window with pink color as
 * background.
 * 
 * Program by Om Gupta (214047)
 */

import java.awt.*;
import java.awt.event.*;

public class Q9_PinkBg extends Frame {
    String msg = "My name is Om";
    public static void main(String[] args) {
        Q9_PinkBg frame = new Q9_PinkBg();
        
        frame.setSize(485, 300);
        frame.setTitle("String on Pink Backgroung");
        frame.setBackground(Color.PINK);
        frame.setVisible(true);
    }

    public Q9_PinkBg(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void paint(Graphics g) {
        g.drawString(msg, 200, 160);
    }
    
}
