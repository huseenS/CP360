import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class ColorPanel extends JPanel {
	private Color red = Color.RED;
	private Color blue = Color.BLUE;
	private Color green = Color.GREEN;
	
	
	//Constructor
	public ColorPanel() {
		setPreferredSize(new Dimension(400,400));
		setBackground(Color.WHITE);
	} //endconstructor
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.translate(getWidth()/2,getHeight()/2);
		//use intersect and subtract methods  of area to get intersections
		//sliders use changeListeners
		g2d.setColor(red);
		Area circle1 = new Area(new Ellipse2D.Double(100, 100, 50, 50));
		g2d.fill(circle1);
		
		g2d.setColor(blue);
		Area circle2 = new Area(new Ellipse2D.Double(200, 200, 100, 100));
		g2d.fill(circle2);
		
		g2d.setColor(green);
		Area circle3 = new Area(new Ellipse2D.Double(100, 100, -300, 300));
		g2d.fill(circle3);
		
	} //end paintComponent
}
