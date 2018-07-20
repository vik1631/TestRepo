
interface Switch {
	void on();
	void off();
	
}


class TubeLight implements Switch{

	@Override
	public void on() {
		System.out.println("TubeLight is switched on");
		
	}

	@Override
	public void off() {
		System.out.println("Tubelight is switched off");
		
	}
	
}

class SolarLight implements Switch{

	@Override
	public void on() {
		System.out.println("SolarLight is switched on");
		
	}

	@Override
	public void off() {
		System.out.println("SolarLight is switched off");
		
	}
	
}

class Factory{
	
	public static Switch getObject(int iValue) {
		if(iValue==1) {
			return new TubeLight();
		}
		
		else if(iValue==2) {
			return new SolarLight();
		}
		
		else {
			return null;
		}
		
	}
	
}
public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		Switch ref=Factory.getObject(1);
		ref. on();
		ref.off();
	}

}
