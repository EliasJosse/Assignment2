import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
   A class for testing an implementation of the Observer pattern.
*/
public class ObserverTester
{
   /**
      Creates a DataModel and attaches barchart and textfield listeners
      @param args unused
   */
   public static void main(String[] args)
   {
      ArrayList<Double> data = new ArrayList<Double>();

      data.add(new Double(33.0));
      data.add(new Double(44.0));
      data.add(new Double(22.0));
      data.add(new Double(22.0));

      DataModel model = new DataModel(data);

      TextFrame frame = new TextFrame(model);

      BarFrame barFrame = new BarFrame(model);

      model.attach(barFrame);
      
      ChangedBar change = new ChangedBar();
      barFrame.addMouseListener(change);
      
   }
   
}
