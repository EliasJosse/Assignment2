import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * Defines that it is in fact a picture in the center component of the presenter.
 * 
 * 
 */

public abstract class ImagePresenter extends Presenter
{
	JLabel label;
	
	public void showImage(String filename){
		
		ImageIcon image	= new ImageIcon(filename);
		label.setIcon(image);
		label.repaint();
	}
	
	@Override
	public JLabel createCenterComponent() {
		label = new JLabel(); 
		return label;  
	}
	
	public abstract void hmhm();
	
	
	@Override
	public void northButtonPressed() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void southButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}
