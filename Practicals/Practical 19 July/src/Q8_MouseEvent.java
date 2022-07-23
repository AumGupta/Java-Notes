import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
 * Q8. Write a program to create a frame using AWT. Implement mouseClicked( ),
 * mouseEntered( ) and mouseExited( ) events. Frame should become invisible/close when
 * mouse enters it.
 * 
 * Program by Om Gupta (214047)
 */

public class Q8_MouseEvent extends JFrame {
    protected JLabel l = new JLabel();
    
    public Q8_MouseEvent() {
        setTitle("Mouse Event Demonstration");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);
        add(l, BorderLayout.CENTER);

        addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e) {
                l.setText("MOUSE ENTERED");
            }
            
            public void mouseClicked(MouseEvent e) {
                l.setText("MOUSE CLICKED");
            }
            
            public void mouseExited(MouseEvent e) {
                l.setText("MOUSE EXITED");
                setVisible(false);
                System.exit(0);
            }
        });
        
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new Q8_MouseEvent();
            }
        });
    }
}