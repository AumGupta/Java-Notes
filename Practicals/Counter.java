import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Counter  extends JFrame
				    implements ActionListener {
	int counter = 0;
	JButton count = new JButton("Count");
	JTextField tf = new JTextField(counter+"");
	JLabel label = new JLabel("Counter");
	
	
	public Counter(){
		setTitle("Counter");
		setSize(300,200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(label);
		add(tf);
		add(count);
		
		count.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		counter++;
		tf.setText(counter+"");
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new Counter();
			}
		});
	}
	
}