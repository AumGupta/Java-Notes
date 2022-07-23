/*
 * 10. Using AWT, write a program to create two buttons named “Red” and “Blue”. When a
 * button is pressed the background color should be set to the color named by the
 * button’s label.
 * 
 * Program by Om Gupta (214047)
 */

import java.awt.*;
import java.awt.event.*;

public class Q10_ButtonRB extends Frame implements ActionListener{
    final static int HEIGHT = 300;
    final static int WIDTH = (int)(HEIGHT*1.618);

    Button red, blue;

    public Q10_ButtonRB() {
        setLayout(new FlowLayout());
        red = new Button("Red");
        blue = new Button("Blue");
        
        add(red);
        add(blue);

        red.addActionListener(this);
        blue.addActionListener(this);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Red")){
            this.setBackground(Color.RED);
        } else this.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        Q10_ButtonRB frame = new Q10_ButtonRB();
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle("Background Color Changer");
        frame.setVisible(true);
    }
}
