
public class ThreeCharFilt extends Filter {

	boolean accept(String s) {
		if(s.length()<=3){
			return true;
		}
		return false;

	}
	
	public static void main(String[] args) {
		String[] a = {"hej", "bra","annars","eller","ok"};
		ThreeCharFilt threeFilter = new ThreeCharFilt();
		a = threeFilter.filter(a);
		for(String s : a)System.out.println(s);
	}
}