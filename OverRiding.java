package New;

class Bike{
	
	int hello(int a, int b) {
		System.out.println("This method is from Bike class");
		return a +  b;
	}
}

public class OverRiding extends Bike{
	
	@Override
	int hello(int a, int b) {
		System.out.println("This is from main method in the OverRide class");
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OverRiding or = new OverRiding();
		or.hello(1,2);
		

	}

}
