import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import org.w3c.dom.css.RGBColor;

class ControlPanel extends JPanel implements ChangeListener
 {
 	ColorPanel cPanel;
	JSlider redSlider, greenSlider, blueSlider;
	int redValue, blueValue, greenValue;
 
 	public ControlPanel(ColorPanel cp)
	{
		cPanel=cp;	
		
		setLayout(new GridLayout(1,3,30,10));
		
    	redSlider = new JSlider(JSlider.VERTICAL,0,255,100);
		redSlider.setMajorTickSpacing(50);
		redSlider.setMinorTickSpacing(10);
		redSlider.setPaintTicks(true);
		redSlider.setPaintLabels(true);
		redSlider.addChangeListener(this);
		JLabel rlabel = new JLabel("Red");
		JPanel r = new JPanel();
		r.setLayout(new BoxLayout(r, BoxLayout.Y_AXIS));
		r.add(rlabel);
    	r.add(redSlider);
		add(r);
		
		
		greenSlider = new JSlider(JSlider.VERTICAL,0,255,100);
		greenSlider.addChangeListener(this);
		greenSlider.setMajorTickSpacing(50);
		greenSlider.setMinorTickSpacing(10);
		greenSlider.setPaintTicks(true);
		greenSlider.setPaintLabels(true);

		JLabel glabel = new JLabel("Green");
		JPanel g = new JPanel();
		g.setLayout(new BoxLayout(g, BoxLayout.Y_AXIS));
		g.add(glabel);
        g.add(greenSlider);
		add(g);
		    
      blueSlider = new JSlider(JSlider.VERTICAL,0,255,100);
		blueSlider.addChangeListener(this);
		blueSlider.setMajorTickSpacing(50);
		blueSlider.setMinorTickSpacing(10);
		blueSlider.setPaintTicks(true);
		blueSlider.setPaintLabels(true);

		JLabel blabel = new JLabel("Blue");
		JPanel b = new JPanel();
		b.setLayout(new BoxLayout(b, BoxLayout.Y_AXIS));
		b.add(blabel);
        b.add(blueSlider);
		add(b);
    
   }//end contructor
   
   public void stateChanged(ChangeEvent ev) {
	   JSlider whichSlider = (JSlider) ev.getSource();
	   if (whichSlider == redSlider) {
		redValue = redSlider.getValue();
	   }
	   if (whichSlider == blueSlider) {
			blueValue = blueSlider.getValue();
	   }
	   if (whichSlider == greenSlider) {
			greenValue = greenSlider.getValue();
	   }
	   cPanel.rb = new Color(redValue, 0, blueValue);
	   cPanel.gb = new Color(0, greenValue, blueValue);
	   cPanel.rg = new Color(redValue, greenValue, 0);
	   cPanel.rgb = new Color(redValue, blueValue, greenValue);
	   cPanel.red = new Color(redValue, 0, 0);
	   cPanel.green = new Color(0, greenValue, 0);
	   cPanel.blue = new Color(0, 0, blueValue);
	   cPanel.repaint();
	   
	 }//end stateChanged

}