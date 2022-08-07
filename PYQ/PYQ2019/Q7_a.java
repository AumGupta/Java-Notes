package PYQ2019;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Q7_a_UsingAWT extends Frame implements ActionListener{
    
    protected Button yesBtn = new Button("Yes");
    protected Button noBtn = new Button("No");
    protected Label lbl = new Label();

    public Q7_a_UsingAWT(){
        setSize(300,200);
        setTitle("Q7 Using AWT");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        
        add(yesBtn);
        add(noBtn);
        yesBtn.addActionListener(this);
        noBtn.addActionListener(this);
        
        add(lbl);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        lbl.setText(ae.getActionCommand());
    }
}

class Q7_a_UsingSwing extends JFrame implements ActionListener{
    
    protected JButton yesBtn = new JButton("Yes");
    protected JButton noBtn = new JButton("No");
    protected JLabel lbl = new JLabel();

    public Q7_a_UsingSwing(){
        setSize(300,200);
        setTitle("Q7 Using AWT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        add(yesBtn);
        add(noBtn);
        yesBtn.addActionListener(this);
        noBtn.addActionListener(this);
        
        add(lbl);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        lbl.setText(ae.getActionCommand());
    }
}

public class Q7_a {
    public static void main(String[] args) {
        new Q7_a_UsingAWT();
        new Q7_a_UsingSwing();
    }
}
