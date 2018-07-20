
public class SingleTonPattern {
	
	private static  SingleTonPattern single;
	private SingleTonPattern() {
		
	}
	
	public static SingleTonPattern getInstance() {
	return (single==null)? new SingleTonPattern():single;
	}

}
