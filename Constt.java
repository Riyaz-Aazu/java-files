package New;



public class Constt {
	//Constructor program
	//A constructor has a same name as a class name and main purpose of constructor to intitalze the object by time of its creation
	Constt(String name, int num){
		System.out.println("This is a constructor"); //Constructor
		System.out.println("The parameter passed to the constructor is "+name+num);
	}
	
	Constt(){
		System.out.println("This is a non parametarized constructor");
	}
	

	public static void main(String[] args) {
		
		Constt c = new Constt("Vamsi Krishna",84);
		c.hello();
		Constt df = new Constt();
		df.hello();
		
		
		
	}
	
	void hello() {
		System.out.println("This is a method in the hello function in the Constt Class ");
	}
}
