public class excercise1 {
	public static void main(String []args){
		Signal a = new Signal();
		Signal b = new Signal();
		a.setTheSampler(new Sinus(0, 0.1));
		b.setTheSampler(new Sinus(0, 0.1));
		a.addSignalObserver(new Observer());
		b.addSignalObserver(new SignalWindow());
		
	}

}
