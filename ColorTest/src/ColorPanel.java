import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Vector;

class ColorPanel extends JPanel {	
	private static final long serialVersionUID = 1L;
	
	//set colors
	public Color red;
	public Color blue;
	public Color green;
	public Color rb;
	public Color gb;
	public Color rg;
	public Color rgb;
	
	
	//Constructor
	public ColorPanel() {
		setPreferredSize(new Dimension(400,400));
		setBackground(Color.WHITE);
	} //endconstructor
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.translate(getWidth()/2,getHeight()/2);
		
		//draw and color circles
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.BLACK);
		Area redCircle = new Area(new Ellipse2D.Double(0, -65, 100, 100));
		g2d.draw(redCircle);
		g2d.setColor(red);
		g2d.fill(redCircle);
		
		g2d.setColor(Color.BLACK);
		Area blueCircle = new Area(new Ellipse2D.Double(30, 0, 100, 100));
		g2d.draw(blueCircle);
		g2d.setColor(blue);
		g2d.fill(blueCircle);
		
		g2d.setColor(Color.BLACK);
		Area greenCircle = new Area(new Ellipse2D.Double(-30, 0, 100, 100));
		g2d.draw(greenCircle);
		g2d.setColor(green);
		g2d.fill(greenCircle);
		
		
		//Set Areas
		Area redblue = new  Area(redCircle);
		redblue.intersect(blueCircle);
		g2d.setColor(rb);
		g2d.fill(redblue);
		
		Area redGreen = new  Area(redCircle);
		redGreen.intersect(greenCircle);
		g2d.setColor(rg);
		g2d.fill(redGreen);
		
		Area greenBlue = new  Area(greenCircle);
		greenBlue.intersect(blueCircle);
		g2d.setColor(gb);
		g2d.fill(greenBlue);
		
		Area redgreenblue = new Area(redGreen);
		redgreenblue.intersect(redblue);
		g2d.setColor(rgb);
		g2d.fill(redgreenblue);
	} //end paintCompone
	
}
