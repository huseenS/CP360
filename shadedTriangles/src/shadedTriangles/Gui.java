package shadedTriangles;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Gui {
	public static void main(String[] args) {
		Canvas c = new Canvas();
		JFrame frame = new JFrame();
		frame.setTitle("Shaded Triangles");
		frame.setSize(new Dimension(300, 300));
		frame.getContentPane().add(c);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
