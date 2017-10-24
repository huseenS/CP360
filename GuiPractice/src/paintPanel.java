import java.awt.*;
import javax.swing.*;

public class paintPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g; //cast to invoke 2d class methods
		
	
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(getWidth()/2, getHeight()/2, 100, 100);
	}
	

}
