import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
 * Q9.Using Swing, write a program to display a string in frame window with pink color as
 * background.
 * 
 * Program by Om Gupta (214047)
 */

public class Q9_PinkBg extends JFrame{
    public Q9_PinkBg(){
        setTitle("String on Pink Background");
        setSize(242, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.PINK);
        
        JLabel l = new JLabel("String on Pink Background");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);
        add(l, BorderLayout.CENTER);
        
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Q9_PinkBg();
            }
        });
    }
    
}
