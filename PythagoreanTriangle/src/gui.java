import java.awt.Dimension;

import  javax.swing.*;

public class gui {

	public static void main(String[] args) {
		SimpleCanvas c = new SimpleCanvas();
		JFrame frame = new JFrame();
		frame.setTitle("Pythag Triangle Proof");
		frame.getContentPane().add(c);
		frame.setSize(new Dimension(300, 300));
		frame.pack();
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
