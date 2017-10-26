package shadedTriangles;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Path2D;

public class Canvas extends JPanel {
	
	
	
	public Canvas() {
		setPreferredSize(new Dimension(200,200));
		setBackground(Color.lightGray);
	} //end constructor
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.translate(getWidth()/2,getHeight()/2);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		        RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Rectangle Gradient paint
		Rectangle r = new Rectangle(-100, -100, 200, 200);
		GradientPaint squarePaint = new GradientPaint(100, 0, Color.WHITE, 100, 100, Color.BLUE);
		g2d.setPaint(squarePaint);
		g2d.fill(r);
		
		
		//Large Traingle gradient paint
		Path2D largeTriangle = new Path2D.Double();
		double centerX= r.getCenterX();
		double centerY = r.getCenterY();
		largeTriangle.moveTo((centerX)+100, (centerY+100)); //right 
		largeTriangle.lineTo(centerX, (centerY)-100);       //top
		largeTriangle.lineTo((centerX)-100, centerY+100); //left
		GradientPaint tPaint = new GradientPaint((float)centerX, (float)centerY-100, Color.BLUE, (float)centerX, (float)centerY+75, Color.WHITE);
		g2d.setPaint(tPaint);
		g2d.fill(largeTriangle);
		
		
		//small triangle Gradient paint
		Path2D smallTriangle = new Path2D.Double();
		smallTriangle.moveTo(((centerX+150)/4), ((centerY-100)/4)); //right
		smallTriangle.lineTo(centerX/4, centerY+100);               //top
		smallTriangle.lineTo(((centerX-150)/4), ((centerY-100)/4)); //left
		GradientPaint t2paint = new GradientPaint((float)(centerX+100)/4, (float)(centerY-100)/4, Color.WHITE, 
				(float)(centerX+100)/4, (float)(centerY+50)/4, Color.BLUE);
		g2d.setPaint(t2paint);
		g2d.fill(smallTriangle);
	} //end paintComponent
	
	

}
