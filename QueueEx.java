package Tests;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue is a DataStructure that works on FIFO (First-In-First-Out) 
		Queue<String> que = new LinkedList<String>();
		
		que.add("Student 1");
		que.add("Student 2");
		que.add("Student 3");
		que.add("Student 4");
		
		System.out.println(que);
		System.out.println(que.poll());//It return null when the que is empty
		System.out.println(que.remove());//It throws Exception when que is empty
		System.out.println(que);
				
		
		
	}

}
