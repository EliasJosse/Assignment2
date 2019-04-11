import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChangedBar implements MouseListener{

	public void mouseClicked(MouseEvent arg0){
				
	}
	
	public void mouseEntered(MouseEvent e){
				
	}

	public void mouseExited(MouseEvent e){
		
	}

	public void mousePressed(MouseEvent e){
		
		int i = e.getY();
		int j;
		
		if(i < 100){
			j = 0;
		}
		else if(i >= 100 && i < 150){
			j = 1;
		}
		else if(i >= 150 && i < 200){
			j = 2;
		}
		else{
			j = 3;
		}
		
        double value = e.getX();
        
		System.out.println("changed bar: " + j);
		System.out.println("new value: " + value);
				
	}

	public void mouseReleased(MouseEvent e){
				
	}	

}
