import java.awt.BorderLayout;

import javax.swing.*;

public class basicGui {
	
	public static void main(String[] args){
		basicGui1 myCanvas = new basicGui1();
		paintPanel paint = new paintPanel();
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Basic Draw Test");
		myFrame.setSize(300,300);

		//Sets the window to close when upper right corner clicked.  
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Must use getContentPane() with JFrame.
		myFrame.getContentPane().add(BorderLayout.SOUTH, myCanvas);
		myFrame.getContentPane().add(BorderLayout.SOUTH, myCanvas.button);
		myFrame.getContentPane().add(BorderLayout.CENTER, paint);
		myFrame.setResizable(true);
		myFrame.setVisible(true);
	}
}
