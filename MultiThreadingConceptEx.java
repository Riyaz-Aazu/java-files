package New;

class Car extends Thread{ //Extended from predefined Thread class
	public void run() {  //when it is a thread class the function name must and should be 'run'
		for(int i = 1; i <=3; i++) {
			System.out.println("Car  is Moving: " + i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}


class Scooter extends Thread{
	public void run() {
		for(int i = 1; i <=3; i++) {
			System.out.println("Bike is Moving: " + i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}

class Vehicle implements Runnable{ //Runnable is an interface which is extended
	public void run() {
		for(int i = 1; i <=3; i++) {
			System.out.println("Vehicle is Moving: " + i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
	}
}


public class MultiThreadingConceptEx {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		Scooter s = new Scooter();	
		s.start();
		Thread caThread = new Thread(new Vehicle());//To run an Runnable Thread , because Runnable is an interface
		caThread.start();
		
		//Note : This is not Thread safe
	}

}
