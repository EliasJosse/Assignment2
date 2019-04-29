import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Application extends ImagePresenter{
	
    int count;
    String[] pictures;
    String[] names;
    
    
	public Application(String[] lib, String[] name){
		
		count = 0;
		pictures = lib;
		names = name;	
	}
	
	public static void main(String[] args){
		
		String dog1 = new String("Dog1.png");
		String dog2 = new String("Dog2.png");
		String dog3 = new String("Dog3.png");
		
		String[] images = {dog1, dog2, dog3};
		String[] names  ={"dog1","dog2","dog3"};
		Application app = new Application(images, names);
		app.createFrame();
		app.showImage("Dog1.png");
		app.showText("Dog1");
	}
	
	

	
	@Override
	public void eastButtonPressed() {
		if(count == pictures.length - 1) count = 0;	
		else count++;
		
		showImage(pictures[count]);
		showText(names[count]);
	}
	
	@Override
	public void westButtonPressed() {
		if(count ==  0) count =	pictures.length - 1;
		else count--;
		
		showImage(pictures[count]);
		showText(names[count]);
	}

	@Override
	public void showPresenter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hmhm() {
		// TODO Auto-generated method stub
		
	}

}
