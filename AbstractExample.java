package New;

abstract class Machine{
	abstract void ATM();
	public void ATM2() {
		System.out.println("This the 2nd ATM of the Machine wihtout Abstraction");
	}
}

interface hey{
	void Credit();
}

class Bank extends Machine implements hey{
	void ATM() {
		System.out.println("ATM Machine of the bank is under use");
	}
	public void Credit() {
		System.out.println("This is a credit function of the interface hey");
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.ATM();
		b.ATM2();
		b.Credit();
		
	}

}
