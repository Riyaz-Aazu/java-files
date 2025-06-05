package New;


//Method Overloading 
// It means having multiple methods with same name but different parameters in the same class


class Calculator{
	int cal(int x, int y) {
		System.out.println("Adding two numbers");
		return x+y;
	}
	int cal(int x, int y, int z) {
		System.out.println("Adding two numbers");
		return x+y;
	}
	
	double cal(double a , double b) {
		return (a+b);
	}
	

}

public class OverLoadingExample {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		System.out.println(c.cal(4, 5));
		System.out.println(c.cal(4, 5, 7));
		System.out.println(c.cal(4.0, 5.6));
		

	}

}
