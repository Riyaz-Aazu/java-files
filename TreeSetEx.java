package Tests;
import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Treeset is a part of java Connection FrameWork and it represents a set collection that uses a Red=Black-Tree
		//It is a type of Binary Search Tree
		TreeSet<Integer> tr = new TreeSet<>();
		TreeSet<String> tt = new TreeSet<>();
		tr.add(50);
		tr.add(10);
		tr.add(20);
		tr.add(40);
		tr.add(80);
		tr.add(60);
		
		System.out.println("Unique elements added to the tree set");
		System.out.println(tr);
		System.out.println();
		System.out.println("Tree set after adding the elements: ");
		System.out.println(tr);
		System.out.println();
		System.out.println("Displaying student names Alphabetically");
		tt.add("vamsi");
		tt.add("abhi");
		tt.add("kiran");
		tt.add("bhargav");
		System.out.println(tt);
		System.out.println();
		System.out.println("Finding values from the tree set");
		System.out.println(tt.contains("abhi"));
	}

}
