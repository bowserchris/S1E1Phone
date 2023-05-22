package n2ejercicio1TelefonoInterface;

public class Phone {
	
	protected String make;
	protected String model;
	
	public Phone(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public static void call(String number) {
		System.out.println("The number " + number + " is being called.\r");
	}
	
	public String toString() {
		return "The make of the phone is: " + make + ".\r"
				+ "The model of the phone is: " + model + ".\r";
	}

}
