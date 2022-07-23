import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * 10. Using Swing, write a program to create two buttons named “Red” and “Blue”. When a
 * button is pressed the background color should be set to the color named by the
 * button’s label.
 * 
 * Program by Om Gupta (214047)
 */

public class Q10_ButtonRB extends JFrame
                          implements ActionListener {
    
    protected JButton redBtn = new JButton("RED");
    protected JButton blueBtn = new JButton("BLUE");

    public Q10_ButtonRB(){
        setTitle("R&B Bg");
        setSize(340,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Adding Action Listener 
        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);

        // Customising Buttons
        redBtn.setBackground(Color.RED);
        blueBtn.setBackground(Color.BLUE);
        redBtn.setForeground(Color.WHITE);
        blueBtn.setForeground(Color.WHITE);
        redBtn.setToolTipText("Change background color to Red.");
        blueBtn.setToolTipText("Change background color to Blue.");
        
        // Adding buttons to Frame
        add(redBtn);
        add(blueBtn);

        // Making Frame Visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals(redBtn.getText())) getContentPane().setBackground(Color.RED);
        else if (str.equals(blueBtn.getText())) getContentPane().setBackground(Color.BLUE);
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Q10_ButtonRB();
            }
        });
    }
 }