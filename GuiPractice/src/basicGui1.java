import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;


public class basicGui1 extends JPanel {
	private static final long serialVersionUID = 1L;
	public JButton button;
	
	public basicGui1()  {
		setBackground(Color.LIGHT_GRAY);
		button = new JButton("click me");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonPressed();
			}

			private void buttonPressed() {
				button.setText("I've been clicked!");
				System.out.println("cliked");
			}
		});
	}
}
