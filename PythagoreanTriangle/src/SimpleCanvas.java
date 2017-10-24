
/**
 * SimpleCanvas.java
 *
 * Part of the basic graphics Template.
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class SimpleCanvas extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	Color triangleColor;
	Color square1Color;
	Color square2Color;
	Color square3Color;
	Line2D.Double myLine;
    public SimpleCanvas () {
		//The following is another way to guarantee correct size.	 
		setPreferredSize(new Dimension(800,800));
		setBackground(Color.lightGray);
		addMouseListener(this);
        triangleColor = Color.black;
        square1Color = Color.yellow;
        square2Color = Color.BLUE;
        square3Color = Color.red;
    }

    public void paintComponent(Graphics g) {
		super.paintComponent(g);  //without this no background color set.
	
		Graphics2D g2d = (Graphics2D)g; //cast so we can use JAVA2D.
		g2d.translate(getWidth()/2,getHeight()/2);
		
		
		//draw Triangle
		g2d.setPaint(triangleColor);
		g2d.fillPolygon(new int[] {-100, -100, 100}, new int[] {100, -100, 100}, 3);
		
		//draw bottom square
		g2d.setColor(square1Color);
		g2d.fillRect(-100, 100, 200, 200);
		//draw side square
		g2d.setColor(square2Color);
		g2d.fillRect(-300, -100, 200, 200);
		
		//draw hypotenuse square
		double hypotenuse = Math.sqrt((-100-100)*(-100-100) + (-100-100)*(-100-100));
		AffineTransform transform = new AffineTransform();
		transform.rotate(Math.toRadians(45), (200+(int)hypotenuse/2), (-100+(int)hypotenuse/2) );
		AffineTransform old = g2d.getTransform();
		g2d.transform(transform);
		g2d.setColor(square3Color);
		g2d.fillRect(-70, -29, (int)(hypotenuse), (int)(hypotenuse));
		g2d.setTransform(old);
	 }
	 
	 public void mouseClicked(MouseEvent e) {
	    System.out.println("Mouse Clicked");
	 	triangleColor = Color.WHITE;
	 	square1Color = new Color(255, 0, 255); //purple
	 	square2Color = Color.RED;
	 	square3Color = Color.BLUE;
		repaint();
	 }
	 
    //Empty methods to satisfy MouseListener interface
	 public void mouseEntered(MouseEvent e){}
	 
	 public void mouseExited(MouseEvent e){}
	  
	 public void mousePressed(MouseEvent e){}
	 	
	 public void mouseReleased(MouseEvent e){}

}// SimpleCanvas
