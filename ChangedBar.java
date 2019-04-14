import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;

public class ChangedBar implements MouseListener{

	   
	 
		public void mouseClicked(MouseEvent arg0){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}	
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
			//CHANGE THE FIELDLIST TO TRIGGER EVENT!?
	        double value = e.getX();
	  
	     //   value = ((value-9)/199)*(Collections.max(a));
	        
			System.out.println("x " + e.getX());
			System.out.println(value);
				
			//	dataModel.update2(j, value);
			
			}
}
