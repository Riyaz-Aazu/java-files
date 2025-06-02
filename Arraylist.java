package New;
import java.util.*;

public class Arraylist {
	//Array list and Dynamic Array
	//Array list is like resizble array in java it lets you store a list of items like number or names
	// and add or remove them when ever you want without worrying about the size
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vamsi");
		names.add("Sak");
		names.add(null);
		names.add("Vishnu");
		System.out.println(names);//Directly prints the elements from the array
		//Arrays are the primitive data types where as the ArrayList are the objects
		System.out.println(names.get(2)); //Used to retrieve the values
		names.set(0, "Vamsi krishna"); //Set a value based on the index 
		System.out.println(names);
		System.out.println(names.remove(3)); // Used to remove a value from the ArrayList based on the index
		System.out.println(names);
	}
}
