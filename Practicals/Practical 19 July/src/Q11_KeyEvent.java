import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
 * 11. Using AWT, write a program which responds to KEY_TYPED event and updates the
 * status window with message (“Typed character is: X”). Use adapter class for other
 * two events.
 * 
 * Program by Om Gupta (214047)
 */

public class Q11_KeyEvent extends JFrame {
    public Q11_KeyEvent(){
        setTitle("Key Event App");
        setSize(240,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JLabel l = new JLabel();
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);
        add(l, BorderLayout.CENTER);
        
        addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent ke) {
                l.setText("Typed character is: "+ke.getKeyChar());
            }
        });
        
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Q11_KeyEvent();
            }
        });
    }
}
