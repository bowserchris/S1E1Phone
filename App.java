package n2ejercicio1TelefonoInterface;

public class App {

	public static void main(String[] args) {
		
		Smartphone mobile = new Smartphone ("nokia", "3000");
		
		Phone.call("123456789");
		
		mobile.photo();
		mobile.alarm();
		
		System.out.println(mobile);

	}

}

/*
 * 
 * Create a class called "Phone" with the make and model attributes, 
 * and the call() method. This method should receive a String with a 
 * phone number. The method should display a console message saying 
 * that the number received by parameter is being called.

Create an interface called "Camera" with the photograph() method, 
and another interface called Clock with the alarm() method.

Create a class called "Smartphone" that is a subclass of "Phone" 
and implements both the "Camera" and "Watch" interfaces.

The photograph() method must display on the console: “A picture is
 being taken” and the alarm() method must display: “The alarm is sounding”.

From the main() of the application, create a Smartphone object and 
call the previous methods.
 * 
 * 
 * 
 * */
