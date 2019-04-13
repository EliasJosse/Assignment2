

public abstract class Filter {
	public String[] filter(String[] a){
		int pointer = 0;
		for(int i=0;i<a.length;i++){
			if(accept(a[i])){
				a[pointer] = a[i];
				pointer++;
			}
		}
		String[] b = new String[pointer];
		for(int i=0;i<pointer;i++){
			b[i] = a[i];
		}
		return b;
	}
	
	abstract boolean accept(String s);

}
