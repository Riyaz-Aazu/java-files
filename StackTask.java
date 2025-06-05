package Tests;

import java.util.Stack;

public class StackTask {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("Adding plates into the stack");
		for(int i = 1; i <= 5; i++) {
			st.push(i);
		}
		
		System.out.println("Using plate number: "+ st.pop());
		System.out.println("The plates remaining in the stack are :");
		System.out.println(st);
	}
}
