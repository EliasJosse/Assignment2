import javax.swing.ImageIcon;

public class Application{
	
	public static void main(String[] args){
		
		ImageIcon[] pictures = new ImageIcon[3];
    	pictures[0] = new ImageIcon("Dog1.png","This is the first dog.");
    	pictures[1] = new ImageIcon("Dog2.png","This is the second dog.");
    	pictures[2] = new ImageIcon("Dog3.png","This is the third dog.");
    	View view = new  View(pictures); 
    	
	}


}
