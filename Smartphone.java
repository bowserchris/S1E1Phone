package n2ejercicio1TelefonoInterface;

public class Smartphone extends Phone implements Camera,Clock {
	
	public Smartphone (String make, String model) {
		super(make, model);
	}
	
	public void photo() {
		System.out.println("A photo is being taken.\r");
	}
	
	public void alarm() {
		System.out.println("The alarm is ringing.\r");
	}

}
