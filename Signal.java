package vecka2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

public class Signal {

	private double amplitude;
	private final int sampling = 1000;
	private Sampler theSampler;
	private ArrayList<SignalObserver> theObservers;
	
	public Signal(){
		theObservers = new ArrayList<SignalObserver>();
		theSampler = new DefaultSampler();
		Timer t = new Timer(sampling, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				nextValue(theSampler.read());
				
			}
		});
		t.start();
		
	}
	
	public void addSignalObserver(SignalObserver s){
		theObservers.add(s);
		
	}

	private void nextValue(double d) {
		amplitude = d;
		for(SignalObserver so : theObservers){
			so.updateSignal(amplitude);
		}
	}
	
	public void setTheSampler(Sampler aSampler){
		theSampler = aSampler;
		
	}
}
