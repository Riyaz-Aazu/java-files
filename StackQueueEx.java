package Tests;

import java.util.*;
public class StackQueueEx {
	public static void main(String[] args) {
		Stack<String> toys = new Stack<String>();
		Queue<String> ice = new LinkedList<String>();
		
		System.out.println("--------------------STACK-----------------------------");
		System.out.println();
		System.out.println("All the toys in the stack are " + toys);
		toys.push("Ball");
		toys.push("Blocks");
		toys.push("puzzle");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Current playing toy: " + toys.pop());
			System.out.println("Remaining toys: "+ toys);
		}
		System.out.println();
		System.out.println("--------------------QUEUE-----------------------------");
		System.out.println();
		ice.add("Maya");
		ice.add("Leo");
		ice.add("Nina");
		
		System.out.println("All the kids in the line are: "+ ice);
		for(int i = 0; i < 3; i++) {
			System.out.println("Serving ice cream to kid named "+ ice.poll());
			System.out.println("Remaining kids waiting in the line are " + ice);
		}
		
		
		
	}

}
