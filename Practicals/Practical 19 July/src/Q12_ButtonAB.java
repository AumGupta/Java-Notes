import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
 * 12. Using AWT & Swing, write a program to create two buttons labelled ‘A’ and ‘B’. When button
 * ‘A’ is pressed, it displays your personal information (Name, Course, Roll No, College)
 * and when button ‘B’ is pressed, it displays your CGPA in previous semester.
 * 
 * Program by Om Gupta (214047)
 */

public class Q12_ButtonAB extends JFrame 
                          implements ActionListener{

    protected JButton A = new JButton("A");
    protected JButton B = new JButton("B");
    protected JLabel label = new JLabel();
    
    public Q12_ButtonAB() {
        setSize(280,180);
        setTitle("Button A & B");
        setLayout(new FlowLayout());
        
        add(A);
        add(B);
        A.addActionListener(this);
        B.addActionListener(this);
        
        add(label);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("A")){
            label.setText("Om Gupta 214047 (BSc Hons CS, SGGSCC)");
        } else label.setText("Previous Semester CGPA = x");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Q12_ButtonAB();
            }
        });
    }
}

