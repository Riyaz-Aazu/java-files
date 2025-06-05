package New;

public class SimpleWrapper {
	public static void main(String[] args) {
		int a = 1;
		Integer b = 10;
		
		double d = 23.11;  //primitive type 
		Double d1 = 11.22; //Wrapper class
		
		System.out.println(((Object)a).getClass().getName());
		System.out.println(b.getClass());
		
		System.out.println(d);
		System.out.println(d1.getClass());
		
		
	}

}
