package Tests;
import java.util.*;
public class StackEx {
	public static void main(String[] args) {
		Stack<String> lifo = new Stack<String>();
		lifo.push("Burger ");
		lifo.push("Pizza");
		lifo.push("Sandwitch");
		
		System.out.println(lifo);
		System.out.println(lifo.peek());
		System.out.println("Serving: " + lifo.pop());
		
		if (lifo.isEmpty()) {
			System.out.println("All items in the stack are served");
		}
		System.out.println(lifo);
	
	}

}
