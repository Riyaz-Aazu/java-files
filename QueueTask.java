package Tests;

import java.util.*;

public class QueueTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> kids = new LinkedList<>();
		for(int i = 1; i < 5; i++) {
			kids.add("Kid "+ i);
		}
		
		System.out.println("All kids who are standing in line: " + kids);
		System.out.println("Serving the icecreams to the kids: ");
		for(int i = 0; i < 2; i++) {
			System.out.println("Serving the icecream to "+ kids.poll());
		}
		System.out.println(kids.add("Kid 5"));
		
		System.out.println("Final Que after serving all the kids "+ kids);
		
		
	}

}
