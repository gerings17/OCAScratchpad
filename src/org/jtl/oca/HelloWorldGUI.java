package org.jtl.oca;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class HelloWorldGUI extends JPanel implements Runnable{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new HelloWorldGUI());
	}
	
	public void run(){
		JFrame frame = new JFrame("Hello World");
		JButton button1 = new JButton("Hello");
		JButton button2 = new JButton("Goodbye");
		add(button1);
		add(button2);
		button1.addActionListener(a -> printHello());
		button2.addActionListener(a -> printGoodbye());
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private void printGoodbye() {
		System.out.println("Goodbye");
	}

	private void printHello() {
		System.out.println("Hello");
	}
	

}
