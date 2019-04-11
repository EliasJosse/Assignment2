public class Observer implements SignalObserver {
	
	
//	public static void main(String []args){
//		Signal s = new Signal();
//		s.setTheSampler(new Sinus);
//		s.addSignalObserver(new SignalObserver(){
//			public void updateSignal(double d){
//		
//				printStars((int)d);
//			}
//		});
//	}
	
	public void updateSignal(double d){
		
		printStars((int)d);
	}
	
	private static void printStars(int x){
		for(int i=0;i<x;i++) System.out.print("*");
		System.out.println();
	}

}
