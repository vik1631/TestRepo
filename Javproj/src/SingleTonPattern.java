
public class SingleTonPattern {
	
	private static  SingleTonPattern single;
	String s;
	private SingleTonPattern() {
		s="Vignesh";
	}
	
	public static SingleTonPattern getInstance() {
	return (single==null)? new SingleTonPattern():single;
	}

	
	public static void main(String[] args) {
		SingleTonPattern pat=getInstance();
		
		System.out.println(pat.s);
		
		pat.s=pat.s.toLowerCase();
		
		System.out.println(pat.s);
	}
}
