

public class Cosinus implements Sampler{
	
	
	private double t, dt;
	
	public Cosinus(double start, double deltaT){
		t = start;
		dt = deltaT;
	}

	@Override
	public double read() {
		double x = t;
		t = t+dt;
		return (2 + Math.sin(x)) * 30;
	}

}

