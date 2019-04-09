package vecka2;

public class Observer {
	
	public static void main(String []args){
		Signal s = new Signal();
		s.addSignalObserver(new SignalObserver(){
			public void updateSignal(double d){
				
				printStars((int)d);
			}
			
		});
		s.addSignalObserver(new SignalWindow());
		
	}
	
	private static void printStars(int x){
		for(int i=0;i<x;i++) System.out.print("*");
		System.out.println();
	}

}
