import javax.swing.*;

public class SignalWindow extends JFrame implements SignalObserver {

	private JTextArea jta;
	
	public SignalWindow(){
		jta = new JTextArea(100, 20);
		jta.append("the signal amp \n");add(jta);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	
	@Override
	public void updateSignal(double x) {
		jta.append(""+x+"\n");
	}
	
	
	public static void main(String []args){
		Signal s = new Signal();
		SignalWindow w = new SignalWindow();
		s.setTheSampler(new DefaultSampler());
		s.addSignalObserver(w);
	}
}
