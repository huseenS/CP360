
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
	Color myColor;
	 Line2D.Double myLine;
    public SimpleCanvas () {
		//The following is another way to guarantee correct size.	 
		setPreferredSize(new Dimension(300,300));
		setBackground(Color.lightGray);
		addMouseListener(this);
		Point2D.Double p1 = new Point2D.Double(10,10);
		Point2D.Double p2 = new Point2D.Double(100,100);
		myLine  = new Line2D.Double();
		myLine.setLine(p1,p2);
        myColor = Color.red;
    }

    public void paintComponent(Graphics g) {
		super.paintComponent(g);  //without this no background color set.
	
		Graphics2D g2d = (Graphics2D)g; //cast so we can use JAVA2D.
		g2d.translate(getWidth()/2,getHeight()/2);
		
		g2d.setPaint(myColor);
		g2d.draw(myLine);
      //g2d.fillRect(-30,-30,30,30); //solid rectangle
		
	 }
	 
	 public void mouseClicked(MouseEvent e) {
	   System.out.println("Mouse Clicked");
	 	myColor = Color.green;
		repaint();
	 }
	 
    //Empty methods to satisfy MouseListener interface
	 public void mouseEntered(MouseEvent e){}
	 
	 public void mouseExited(MouseEvent e){}
	  
	 public void mousePressed(MouseEvent e){}
	 	
	 public void mouseReleased(MouseEvent e){}

}// SimpleCanvas
