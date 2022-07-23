/*
 * 12. Using AWT, write a program to create two buttons labelled ‘A’ and ‘B’. When button
 * ‘A’ is pressed, it displays your personal information (Name, Course, Roll No, College)
 * and when button ‘B’ is pressed, it displays your CGPA in previous semester.
 * 
 * Program by Om Gupta (214047)
 */

import java.awt.*;
import java.awt.event.*;

public class Q12_ButtonAB extends Frame implements ActionListener{
    final static int WIDTH = 300;
    final static int HEIGHT = (int)(WIDTH*1.618);
    
    String msg = "";
    Button A, B;
    
    public static void main(String[] args) {
        Q12_ButtonAB frame = new Q12_ButtonAB();
    
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle("Button A & B");
        frame.setVisible(true);
    }
    
    public Q12_ButtonAB() {
        setLayout(new FlowLayout());

        A = new Button("A");
        B = new Button("B");
        
        add(A);
        add(B);

        A.addActionListener(this);
        B.addActionListener(this);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("A")){
            msg ="Om Gupta 214047 (BSc Hons CS, SGGSCC)";
        } else msg = "Previous Semester CGPA = x";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 30, HEIGHT/2);
    }

}
