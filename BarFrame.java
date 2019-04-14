import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

/**
  A class that implements an Observer object that displays a barchart view of
  a data model.
*/
public class BarFrame extends JFrame implements ChangeListener
{
   /**
      Constructs a BarFrame object
      @param dataModel the data that is displayed in the barchart
   */
   public BarFrame(DataModel dataModel)
   {
      this.dataModel = dataModel;
      a = dataModel.getData();

      setLocation(0,200);
      setLayout(new BorderLayout());
      
      Icon barIcon = new Icon()
      {
    	  

    	  

    		 
         public int getIconWidth() { return ICON_WIDTH; }
         public int getIconHeight() { return ICON_HEIGHT; }
         public void paintIcon(Component c, Graphics g, int x, int y)
         {

            Graphics2D g2 = (Graphics2D) g;

            g2.setColor(Color.red);

            double max =  (a.get(0)).doubleValue();
            for (Double v : a)
            {
               double val = v.doubleValue();
               if (val > max)
                  max = val;
            }

            double barHeight = getIconHeight() / a.size();

            int i = 0;
            for (Double v : a)
            {
               double value = v.doubleValue();

               double barLength = getIconWidth() * value / max;

               Rectangle2D.Double rectangle = new Rectangle2D.Double
                  (0, barHeight * i, barLength, barHeight);
               i++;
               g2.fill(rectangle);
            }
         }
      };

      
      
      add(new JLabel(barIcon));

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
      
      this.addMouseListener(m);
     
      
   }

   /**
      Called when the data in the model is changed.
      @param e the event representing the change
   */
   public void stateChanged(ChangeEvent e)
   {
      a = dataModel.getData();
      repaint();
   }
   
   
	 MouseListener m = new MouseListener(){
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
	  
	        value = ((value-9)/199)*(Collections.max(a));
	        
			System.out.println("x" + e.getX());
			System.out.println(value);
				
			dataModel.update(j, value);
			
			
		}
	 };


   private ArrayList<Double> a;
   private DataModel dataModel;

   private static final int ICON_WIDTH = 200;
   private static final int ICON_HEIGHT = 200;
}